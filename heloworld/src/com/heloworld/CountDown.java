package com.heloworld;

import java.util.Timer;
import java.util.TimerTask;

public class CountDown {

Timer timer;

public CountDown() {
	timer = new Timer(); timer.schedule(new DisplayCountdown(), 0, 1000); 
	}

class DisplayCountdown extends TimerTask { 
	int seconds = 60;
@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("PRints every 10sec");
}



}

public static void main(String args[]) { System.out.println("Countdown Beginning"); new CountDown(); } }