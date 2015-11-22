package mvcClock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Clock extends Application {
    private Stage stage;
    private String timer;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        showMainMenu();
    }

    public void showMainMenu() throws Exception {
        Pane rootpane = null ;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Clock.class.getResource("viewClock.fxml"));
        rootpane = loader.load();
        Scene scene = new Scene(rootpane);
        stage.setScene(scene);
        stage.show();
    }


}
