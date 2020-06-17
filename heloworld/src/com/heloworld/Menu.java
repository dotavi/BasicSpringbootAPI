package com.heloworld;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.heloworld.CountDown.DisplayCountdown;

public class Menu {
	public int globalbet,usercredit,piktballglobal = -1;
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
			System.out.println("Your wallet currently contains :");
			System.out.println(usercredit);
			int wallet = usercredit;
			usercredit=	loadCredit();
			System.out.print("Your new balance is : ");
			usercredit=	usercredit + wallet;
			System.out.println(usercredit);
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
			int x = 0;
			System.out.println("-----------------Roulette--------------------");
			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			System.out.println("--once started, a lucky number will be drawn-");
			System.out.println("------------every 30 seconds.----------------");
			System.out.println("---------------------------------------------");
			
			
		}
		
		private void printMenu () {
			System.out.println("Please make a selection");
			System.out.println("1 : Start Ball ");
			System.out.println("2 : Load Credit");
			System.out.println("3 : Pick  ball and bet");
			System.out.println("4 : Stop Ball");
			System.out.println("9 : View Stats");
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
		    	    System.out.print("You are betting :");
		    	    System.out.println(globalbet); 
		    	    System.out.print("Last Number Chosen :");
		    	    System.out.println(piktballglobal);
		    	    System.out.print("Last Winning Number                        :");
		    	    System.out.println(rand); // Roulette Number
		    	  
		    	    if (piktballglobal == rand) { 
		    			System.out.println("WINNER");
		    			//Insert credits and losses here
		    			usercredit = usercredit *36; 
		    		}else 
		    			{
		    			
		    			System.out.println("LOSER");
		    			
		    			
		    			}
		    	    System.out.print("You now have :");
		    	    System.out.println(usercredit);
		    	    
		    		
		     }
		}
		
				
		static int loadCredit() {
			//Do error checking on entry here. Only numbers from 0.00 - whatever, no characters
			//convert wallet and credit to not integer
			System.out.println("Please enter the amount of credit to load");
	        Scanner d = new Scanner(System.in);
	        int usercredit = d.nextInt();
	        return usercredit;	
		}
		
		
		private void pickBall(){
			System.out.println("Please choose a lucky number :");
	        Scanner scanner = new Scanner(System.in);
	        int piktball = scanner.nextInt();
	        
	    
	        piktballglobal = piktball;
	        
	        System.out.println("Please amount to bet each round");
	        Scanner scanner1 = new Scanner(System.in);
	        int bet = scanner1.nextInt();
	        globalbet = bet;
	        runMenu();
			}
		
		
		
		public void stopBall(){
			timer.cancel();
			return;
			
		}
		
		}
		
	

	


