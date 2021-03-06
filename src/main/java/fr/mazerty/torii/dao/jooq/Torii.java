/*
 * This file is generated by jOOQ.
*/
package fr.mazerty.torii.dao.jooq;


import fr.mazerty.torii.dao.jooq.tables.TUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Torii extends SchemaImpl {

    private static final long serialVersionUID = 1699324581;

    /**
     * The reference instance of <code>torii</code>
     */
    public static final Torii TORII = new Torii();

    /**
     * The table <code>torii.t_user</code>.
     */
    public final TUser T_USER = fr.mazerty.torii.dao.jooq.tables.TUser.T_USER;

    /**
     * No further instances allowed
     */
    private Torii() {
        super("torii", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.T_USER_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            TUser.T_USER);
    }
}
