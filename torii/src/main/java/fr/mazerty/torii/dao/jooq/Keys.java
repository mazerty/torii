/*
 * This file is generated by jOOQ.
 */
package fr.mazerty.torii.dao.jooq;


import fr.mazerty.torii.dao.jooq.tables.TUser;
import fr.mazerty.torii.dao.jooq.tables.records.TUserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>torii</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TUserRecord, Integer> IDENTITY_T_USER = Identities0.IDENTITY_T_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TUserRecord> T_USER_PKEY = UniqueKeys0.T_USER_PKEY;
    public static final UniqueKey<TUserRecord> T_USER_EMAIL_KEY = UniqueKeys0.T_USER_EMAIL_KEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TUserRecord, Integer> IDENTITY_T_USER = Internal.createIdentity(TUser.T_USER, TUser.T_USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<TUserRecord> T_USER_PKEY = Internal.createUniqueKey(TUser.T_USER, "t_user_pkey", TUser.T_USER.ID);
        public static final UniqueKey<TUserRecord> T_USER_EMAIL_KEY = Internal.createUniqueKey(TUser.T_USER, "t_user_email_key", TUser.T_USER.EMAIL);
    }
}
