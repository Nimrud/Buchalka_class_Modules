module jaczewski.ui {
    requires javafx.fxml;
    requires javafx.graphics;
    requires jaczewski.common;
    requires jaczewski.db;
    requires javafx.controls;

    opens jaczewski.ui;
    exports jaczewski.ui to javafx.graphics, javafx.fxml;
}