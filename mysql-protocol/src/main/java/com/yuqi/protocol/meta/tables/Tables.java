/*
 * This file is generated by jOOQ.
 */
package com.yuqi.protocol.meta.tables;


import com.yuqi.protocol.meta.Sloth;
import com.yuqi.protocol.meta.tables.records.TablesRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row21;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables extends TableImpl<TablesRecord> {

    /**
     * The reference instance of <code>sloth.tables</code>
     */
    public static final Tables TABLES = new Tables();
    private static final long serialVersionUID = 130752018;
    /**
     * The column <code>sloth.tables.TABLE_CATALOG</code>.
     */
    public final TableField<TablesRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>sloth.tables.TABLE_SCHEMA</code>.
     */
    public final TableField<TablesRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>sloth.tables.TABLE_NAME</code>.
     */
    public final TableField<TablesRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>sloth.tables.TABLE_TYPE</code>.
     */
    public final TableField<TablesRecord, String> TABLE_TYPE = createField(DSL.name("TABLE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>sloth.tables.ENGINE</code>.
     */
    public final TableField<TablesRecord, String> ENGINE = createField(DSL.name("ENGINE"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");
    /**
     * The column <code>sloth.tables.VERSION</code>.
     */
    public final TableField<TablesRecord, ULong> VERSION = createField(DSL.name("VERSION"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>sloth.tables.ROW_FORMAT</code>.
     */
    public final TableField<TablesRecord, String> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "");
    /**
     * The column <code>sloth.tables.TABLE_ROWS</code>.
     */
    public final TableField<TablesRecord, ULong> TABLE_ROWS = createField(DSL.name("TABLE_ROWS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>sloth.tables.AVG_ROW_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> AVG_ROW_LENGTH = createField(DSL.name("AVG_ROW_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>sloth.tables.DATA_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> DATA_LENGTH = createField(DSL.name("DATA_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>sloth.tables.MAX_DATA_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> MAX_DATA_LENGTH = createField(DSL.name("MAX_DATA_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>sloth.tables.INDEX_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> INDEX_LENGTH = createField(DSL.name("INDEX_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>sloth.tables.DATA_FREE</code>.
     */
    public final TableField<TablesRecord, ULong> DATA_FREE = createField(DSL.name("DATA_FREE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>sloth.tables.AUTO_INCREMENT</code>.
     */
    public final TableField<TablesRecord, ULong> AUTO_INCREMENT = createField(DSL.name("AUTO_INCREMENT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>sloth.tables.CREATE_TIME</code>.
     */
    public final TableField<TablesRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");
    /**
     * The column <code>sloth.tables.UPDATE_TIME</code>.
     */
    public final TableField<TablesRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("UPDATE_TIME"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");
    /**
     * The column <code>sloth.tables.CHECK_TIME</code>.
     */
    public final TableField<TablesRecord, LocalDateTime> CHECK_TIME = createField(DSL.name("CHECK_TIME"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");
    /**
     * The column <code>sloth.tables.TABLE_COLLATION</code>.
     */
    public final TableField<TablesRecord, String> TABLE_COLLATION = createField(DSL.name("TABLE_COLLATION"), org.jooq.impl.SQLDataType.VARCHAR(32), this, "");
    /**
     * The column <code>sloth.tables.CHECKSUM</code>.
     */
    public final TableField<TablesRecord, ULong> CHECKSUM = createField(DSL.name("CHECKSUM"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");
    /**
     * The column <code>sloth.tables.CREATE_OPTIONS</code>.
     */
    public final TableField<TablesRecord, String> CREATE_OPTIONS = createField(DSL.name("CREATE_OPTIONS"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");
    /**
     * The column <code>sloth.tables.TABLE_COMMENT</code>.
     */
    public final TableField<TablesRecord, String> TABLE_COMMENT = createField(DSL.name("TABLE_COMMENT"), org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>sloth.tables</code> table reference
     */
    public Tables() {
        this(DSL.name("tables"), null);
    }

    /**
     * Create an aliased <code>sloth.tables</code> table reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>sloth.tables</code> table reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    private Tables(Name alias, Table<TablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tables(Name alias, Table<TablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Tables(Table<O> child, ForeignKey<O, TablesRecord> key) {
        super(child, key, TABLES);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablesRecord> getRecordType() {
        return TablesRecord.class;
    }

    @Override
    public Schema getSchema() {
        return Sloth.SLOTH;
    }

    @Override
    public Tables as(String alias) {
        return new Tables(DSL.name(alias), this);
    }

    @Override
    public Tables as(Name alias) {
        return new Tables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(String name) {
        return new Tables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(Name name) {
        return new Tables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, String, String, ULong, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, LocalDateTime, LocalDateTime, LocalDateTime, String, ULong, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }
}
