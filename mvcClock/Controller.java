package mvcClock;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {


    @FXML
    private Button stop;
    @FXML
    private Button start;
    @FXML
    private Text readClock;

    private Tester timer;

    public void actionStop() {

        timer.stopActive();

    }
    public void actionStart() {

        timer = new Tester(this);
        timer.start();
    }

    public void setTimer() {
        String time = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        time = simpleDateFormat.format(new Date());
        readClock.setText(time);
        System.out.println(time);
    }

    public Button getStop() {
        return stop;
    }

    public void setStop(Button stop) {
        this.stop = stop;
    }

    public Button getStart() {
        return start;
    }

    public void setStart(Button start) {
        this.start = start;
    }

    /**
     * Created by Rustymattok on 22.11.2015.
     */
}
