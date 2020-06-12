package com.heloworld;
import java.util.Timer;
import java.util.TimerTask;

class Demo extends TimerTask {
    public void run() {
          System.out.println("Hello World"); 
     }
}

public class helloworld {

    public static void main(String args[]) {
    	Timer t1 = new Timer();
    	t1.schedule(new Demo(), 0,5000);
    	
        
    }
}