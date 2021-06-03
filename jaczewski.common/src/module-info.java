module modules.jaczewski.common {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;

    opens jaczewski.common;
    opens jaczewski.ui;
    opens jaczewski.db;
}