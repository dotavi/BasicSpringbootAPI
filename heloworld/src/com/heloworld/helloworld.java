package com.heloworld;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

//Timer Task is invoked
//Integer Generated between 0 and 36
class Demo extends TimerTask {
    public void run() {
    	int rand=0, min=0, max = 36;
    	    Random r = new Random();
    	    rand = r.nextInt((max - min) + 1) + min;	    
    	    System.out.println(rand); 
          
     }
}



public class helloworld {



	
    public static void main(String args[]) {
    	
    	
    	Timer t1 = new Timer();
    	//Timer Scheduled for every 4 seconds
    	t1.schedule(new Demo(), 0,4000);
        
    }
}