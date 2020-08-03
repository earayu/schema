package com.yuqi.protocol.command.sqlnode;

import com.google.common.collect.Lists;
import com.yuqi.protocol.connection.ConnectionContext;
import com.yuqi.protocol.pkg.MysqlPackage;
import com.yuqi.protocol.pkg.ResultSetHolder;
import com.yuqi.protocol.utils.PackageUtils;
import com.yuqi.sql.SlothSchema;
import com.yuqi.sql.SlothSchemaHolder;
import com.yuqi.sql.ddl.SqlShow;
import io.netty.buffer.ByteBuf;
import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.yuqi.protocol.constants.ErrorCodeAndMessageEnum.NO_DATABASE_SELECTED;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description your description
 * @time 31/7/20 17:00
 **/
public class SqlShowHandler implements Handler<SqlShow> {

    public static final SqlShowHandler INSTANCE = new SqlShowHandler();

    @Override
    public void handle(ConnectionContext connectionContext, SqlShow sqlNode) {
        final String command = sqlNode.getCommand();
        //todo
        List<String> data = Collections.EMPTY_LIST;
        if ("databases".equalsIgnoreCase(command)) {
            data = SlothSchemaHolder.INSTANCE.getAllSchemas();
        } else if ("tables".equalsIgnoreCase(command)) {
            String db = connectionContext.getDb();
            if (Objects.isNull(db)) {
                MysqlPackage mysqlPackage = PackageUtils.buildErrPackage(
                        NO_DATABASE_SELECTED.getCode(),
                        NO_DATABASE_SELECTED.getMessage(),
                        1);

                connectionContext.write(mysqlPackage);
                return;
            }

            final SlothSchema slothSchema = SlothSchemaHolder.INSTANCE.getSlothSchema(db);
            data = slothSchema.getTables();
        }

        final ResultSetHolder resultSetHolder = ResultSetHolder.builder()
                .columnName(new String[] {"Database"})
                .columnType(new int[] {0xfd})
                .data(data.stream().map(Lists::newArrayList).collect(Collectors.toList()))
                .schema(StringUtils.EMPTY)
                .table(StringUtils.EMPTY)
                .build();

        final ByteBuf byteBuf = PackageUtils.buildResultSet(resultSetHolder);

        connectionContext.getChannelHandlerContext().channel()
                .writeAndFlush(byteBuf);
        byteBuf.clear();
    }
}