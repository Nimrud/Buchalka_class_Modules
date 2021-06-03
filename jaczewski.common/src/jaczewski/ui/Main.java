package jaczewski.ui;

import jaczewski.db.Datasource;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Import gotowego projektu z Javy 8 (autor: Tim Buchalka)
// Projekt używa bibliotek sqlite_jdbc_3_21_0.xml

// File -> New -> Module -> Java -> next -> [nazwa] -> tworzymy pierwszy moduł
// -> przenosimy do niego tymczasowo wszystkie pliki (ale podzielone na docelowe pakiety, np. UI, DB itd.)
// -> przenosimy również plik module-info.java, aktualizujemy w nim ścieżki
// (bez tego pliku nie zadziałają importy pakietów javafx, java.sql itd.)
// (importy napisanych przez nas klas aktualizujemy przez wykasowanie - automatycznie się zrobią)
// File -> Project structure -> Modules -> dodajemy JavaFX i sterownik JDBC do MODUŁU


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/jaczewski/ui/main.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        controller.listArtists();

        primaryStage.setTitle("Music Database");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        if(!Datasource.getInstance().open()) {
            System.out.println("FATAL ERROR: Couldn't connect to database");
            Platform.exit();
        }
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        Datasource.getInstance().close();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
