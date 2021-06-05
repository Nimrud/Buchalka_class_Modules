module jaczewski.ui {
    requires javafx.fxml;
    requires javafx.graphics;
    //requires jaczewski.common;  // już niewymagane, bo moduł .db udostępnia .common za pomocą 'transitive'
    requires jaczewski.db;
    requires javafx.controls;

    opens jaczewski.ui;
    exports jaczewski.ui to javafx.graphics, javafx.fxml;
}