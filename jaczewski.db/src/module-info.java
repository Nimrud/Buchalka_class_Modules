module jaczewski.db {
    requires java.sql;
    requires sqlite.jdbc;
    requires transitive jaczewski.common;

    exports jaczewski.db;
}