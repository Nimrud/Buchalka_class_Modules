module jaczewski.db {
    requires java.sql;
    requires sqlite.jdbc;
    requires jaczewski.common;

    exports jaczewski.db;
}