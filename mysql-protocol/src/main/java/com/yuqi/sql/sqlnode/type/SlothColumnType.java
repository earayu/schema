package com.yuqi.sql.sqlnode.type;

import org.apache.calcite.sql.SqlDataTypeSpec;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlTypeNameSpec;
import org.apache.calcite.sql.parser.SqlParserPos;

/**
 * @author yuqi
 * @mail yuqi4733@gmail.com
 * @description your description
 * @time 16/8/20 17:03
 **/
public class SlothColumnType extends SqlDataTypeSpec {

    private SqlNode precision;

    /**
     * Currently java can't implement unsigned;
     */
    private boolean unsigned;

    /**
     * default value;
     */
    private SqlNode defaultValue;

    /**
     * comment
     */
    private SqlNode comment;

    public SlothColumnType(SqlDataTypeSpec sqlDataTypeSpec, SqlNode precision, boolean unsigned,
                           SqlNode defaultValue, SqlNode comment) {
        super(sqlDataTypeSpec.getTypeNameSpec(), null, sqlDataTypeSpec.getNullable(), sqlDataTypeSpec.getParserPosition());
        this.precision = precision;
        this.unsigned = unsigned;
        this.defaultValue = defaultValue;
        this.comment = comment;
    }

    public SlothColumnType(SqlTypeNameSpec typeNameSpec, SqlParserPos pos, SqlNode precision, boolean unsigned,
                           SqlNode defaultValue, SqlNode comment) {
        super(typeNameSpec, pos);
        this.precision = precision;
        this.unsigned = unsigned;
        this.defaultValue = defaultValue;
        this.comment = comment;
    }

    public SqlNode getPrecision() {
        return precision;
    }

    public boolean isUnsigned() {
        return unsigned;
    }

    public SqlNode getDefaultValue() {
        return defaultValue;
    }

    public SqlNode getComment() {
        return comment;
    }

    @Override
    public Boolean getNullable() {
        return super.getNullable();
    }
}
