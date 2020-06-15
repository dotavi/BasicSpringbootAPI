package com.heloworld;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.heloworld.CountDown.DisplayCountdown;

public class Menu {
	public int usercredit,piktballglobal = -1;
	Timer timer;
		boolean exit;
		int stoptimer = -1;
		public static void main(String[] args) {
			Menu menu = new Menu();
			menu.runMenu();
		}
		
		public void runMenu() {
			printHeader();
			while(!exit) {
				printMenu();
				int choice  = getInput();
				performAction(choice);
			}
		}
		
		private int getInput() {
			 Scanner kb = new Scanner (System.in);
			int choice = -1;
			while (choice < 0 ) {
				try {
					System.out.println("Enter Choice ");
					choice = Integer.parseInt(kb.nextLine());
				}
				catch (NumberFormatException e) {
					System.out.println("Invalid selection");
				}
			}return choice;
		} 
		
		private void performAction(int choice) {
			switch(choice) {
			case 0 : 
				exit = true;
				System.out.println("exitting");
				break;
			case 1:
				startBall();
				break;
			case 2:
			
			int x=	loadCredit();
			System.out.print("You have loaded: ");
			System.out.println(x);
			break;
			
			case 3:
				pickBall();
			case 4:
				timer.cancel();
				timer.purge();
				stopBall();
			default: 
				System.out.println("Unknown Error");
			
				
			}
		}
		
		private void printHeader () {
			System.out.println("---------------------------------------------");
			System.out.println("-----------------Roulette--------------------");
			System.out.println("---------------------------------------------");
		}
		
		private void printMenu () {
			System.out.println("Please make a selection");
			System.out.println("1 : Start Ball -> Will pick lucky number every 30 seconds");
			System.out.println("2 : Load Credit");
			System.out.println("3 : Pick  ball and bet");
			System.out.println("4 : Stop Ball");
			System.out.println("0 : Exit");
			System.out.println("\n");
		}
		
		private void startBall() {
			System.out.println("Countdown Beginning"); 
		
			timer = new Timer(); 
			timer.schedule(new Demo(), 0, 4000); 
		}
		
		class Demo extends TimerTask {
		    public void run() {
		    	int rand=0, min=0, max = 36;
		    	    Random r = new Random();
		    	    rand = r.nextInt((max - min) + 1) + min;	    
		    	    System.out.print("Last Winning Number :");
		    	    System.out.println(rand); // Roulette Number
		           
		    	    if (usercredit == rand) { System.out.println("WINNER"); 
		     }
		}
		}
				
		static int loadCredit() {
			System.out.println("Please enter user credit to load");
	        Scanner d = new Scanner(System.in);
	        int usercredit = d.nextInt();
	        return usercredit;
			
		}
		
		
		private void pickBall(){
			System.out.println("Please ball to win");

	        Scanner d = new Scanner(System.in);
	        int piktball = d.nextInt();
	        System.out.println(piktball);
	        piktballglobal = piktball;
	        runMenu();
			}
		
		public void stopBall(){
	timer.cancel();
			return;
			
		}
		
		}
		
	

	


