package com.heloworld;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.heloworld.CountDown.DisplayCountdown;

public class Menu {
	
		boolean exit;
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
					System.out.print("Enter Choice");
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
				loadCredit();
				break;
			case 3:
				pickBall();
			case 4:
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
			
		}
		
		Timer timer;
		public void CountDown() {
			timer = new Timer(); timer.schedule(new DisplayCountdown(), 0, 1000); 
			}

		class DisplayCountdown extends TimerTask { 
			int seconds = 60;
		@Override
		public void run() {
			System.out.println("PRints every 10sec");
		}
		
		}1
		private void startBall() {
			System.out.println("Countdown Beginning"); new CountDown();
		}
		
		
		
		
		
		private void loadCredit() {
			//Credit Variable : Accept Amount
			//Load it, return to main menu
			
		}
		
		
		private void pickBall(){
				
			}
		
		private void stopBall(){
			
		}
		
		}
		
	

	


