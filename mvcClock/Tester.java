package mvcClock;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Tester extends Thread{
    private Controller controller;
    private boolean isactive = false;

    public Tester(Controller controller) {
        this.controller = controller;
    }
    public void stopActive(){
        isactive = true;
    }

    public void run() {

        while (!isactive) {
            controller.setTimer();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
