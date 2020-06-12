package com.heloworld;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task 
 * to execute once 5 seconds have passed.
 */
class Demo extends TimerTask {
    public void run() {
          System.out.println("Hello World"); 
     }
}
public class helloworld {
    Timer timer;

    public helloworld(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
    	Timer t1 = new Timer();
    	t1.schedule(new Demo(), 0,6000);
    	new helloworld(5);
        System.out.println("Task scheduled.");
    }
}