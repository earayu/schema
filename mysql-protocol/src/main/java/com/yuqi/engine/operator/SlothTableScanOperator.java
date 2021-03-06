package com.yuqi.engine.operator;

import com.google.common.collect.Sets;
import com.yuqi.engine.data.type.DataType;
import com.yuqi.engine.data.value.Value;
import com.yuqi.sql.SlothSchemaHolder;
import com.yuqi.sql.SlothTable;
import com.yuqi.storage.lucene.QueryContext;
import com.yuqi.storage.lucene.TableEngine;
import org.apache.calcite.plan.RelOptTable;
import org.apache.calcite.prepare.RelOptTableImpl;
import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rex.RexNode;
import org.apache.lucene.search.MatchAllDocsQuery;

import java.util.Iterator;
import java.util.List;

/**
 * @author yuqi
 * @mail yuqi4733@gmail.com
 * @description your description
 * @time 5/7/20 15:46
 **/
public class SlothTableScanOperator extends AbstractOperator {

    private RelOptTable table;

    private List<RexNode> project;
    private RexNode condition;

    /**
     * if project is not null or empty, the outputType is the project output type;
     */
    private RelDataType outputType;

    //MOCK
    private Iterator<List<Value>> iterator;
    private List<DataType> dataTypes;

    public SlothTableScanOperator(RelOptTable table, RelDataType originType,
                                  RelDataType outputType, List<RexNode> projects, RexNode filter) {
        super(originType);
        this.table = table;
        this.project = projects;
        this.condition = filter;
        this.outputType = outputType;
    }

    @Override
    public void open() {
        final RelOptTableImpl relOptTable = (RelOptTableImpl) table;
        final List<String> dbAndTable = relOptTable.getQualifiedName();
        final SlothTable slothTable = (SlothTable) SlothSchemaHolder.INSTANCE
                .getSlothSchema(dbAndTable.get(0)).getTable(dbAndTable.get(1));


        TableEngine tableEngine = slothTable.getTableEngine();

        QueryContext queryContext = new QueryContext(new MatchAllDocsQuery(), Sets.newHashSet(tableEngine.getColumnNames()));
        iterator = tableEngine.search(queryContext);
    }

    @Override
    public List<Value> next() {
        while (iterator.hasNext()) {
            return iterator.next();
        }

        return EOF;
    }

    @Override
    public void close() {

    }
}
