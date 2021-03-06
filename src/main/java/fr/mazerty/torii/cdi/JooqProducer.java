package fr.mazerty.torii.cdi;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JooqProducer {

    private static final String DATASOURCE_JNDI_NAME = "java:/comp/env/jdbc/postgresql";

    /**
     * @return jooq context to operate the database
     */
    @ApplicationScoped
    @Produces
    public DSLContext produce() throws NamingException {
        return DSL.using(new DefaultConfiguration()
                .set(SQLDialect.POSTGRES_9_5)
                .set((DataSource) new InitialContext().lookup(DATASOURCE_JNDI_NAME)));
    }

}
