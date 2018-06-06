/*
 * Copyright 2015-2018 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This file is generated by jOOQ.
*/
package zipkin2.storage.mysql.v1.internal.generated.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import zipkin2.storage.mysql.v1.internal.generated.Indexes;
import zipkin2.storage.mysql.v1.internal.generated.Keys;
import zipkin2.storage.mysql.v1.internal.generated.Zipkin;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ZipkinDependencies extends TableImpl<Record> {

    private static final long serialVersionUID = 1870027917;

    /**
     * The reference instance of <code>zipkin.zipkin_dependencies</code>
     */
    public static final ZipkinDependencies ZIPKIN_DEPENDENCIES = new ZipkinDependencies();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>zipkin.zipkin_dependencies.day</code>.
     */
    public final TableField<Record, Date> DAY = createField("day", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>zipkin.zipkin_dependencies.parent</code>.
     */
    public final TableField<Record, String> PARENT = createField("parent", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>zipkin.zipkin_dependencies.child</code>.
     */
    public final TableField<Record, String> CHILD = createField("child", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>zipkin.zipkin_dependencies.call_count</code>.
     */
    public final TableField<Record, Long> CALL_COUNT = createField("call_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>zipkin.zipkin_dependencies.error_count</code>.
     */
    public final TableField<Record, Long> ERROR_COUNT = createField("error_count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>zipkin.zipkin_dependencies</code> table reference
     */
    public ZipkinDependencies() {
        this(DSL.name("zipkin_dependencies"), null);
    }

    /**
     * Create an aliased <code>zipkin.zipkin_dependencies</code> table reference
     */
    public ZipkinDependencies(String alias) {
        this(DSL.name(alias), ZIPKIN_DEPENDENCIES);
    }

    /**
     * Create an aliased <code>zipkin.zipkin_dependencies</code> table reference
     */
    public ZipkinDependencies(Name alias) {
        this(alias, ZIPKIN_DEPENDENCIES);
    }

    private ZipkinDependencies(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ZipkinDependencies(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Zipkin.ZIPKIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ZIPKIN_DEPENDENCIES_DAY, Indexes.ZIPKIN_DEPENDENCIES_DAY_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_ZIPKIN_DEPENDENCIES_DAY, Keys.KEY_ZIPKIN_DEPENDENCIES_DAY_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinDependencies as(String alias) {
        return new ZipkinDependencies(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ZipkinDependencies as(Name alias) {
        return new ZipkinDependencies(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ZipkinDependencies rename(String name) {
        return new ZipkinDependencies(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ZipkinDependencies rename(Name name) {
        return new ZipkinDependencies(name, null);
    }
}
