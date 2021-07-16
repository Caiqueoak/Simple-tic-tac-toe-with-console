package ticTacToe;

	import java.util.InputMismatchException;
	import java.util.Random;
	import java.util.Scanner;

	public class TicTacToe {
		
		static Scanner scan = new Scanner(System.in);
		static Random rand = new Random();
		static int row = 0;
		static int column = 0;
		static String[][] spaces = { {" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "} };
		static String player1;
		static String player2;
		
		public static void getPlayerNames() {
			System.out.printf("Input \"cpu\" to play against the machine %n%n");
			System.out.print("Input Player's 1 name: ");
			player1 = scan.nextLine();
			System.out.print("Input Player's 2 name: ");
			player2 = scan.nextLine();
		}
		
		public static void winnerMsgP1() {
			gameBoard();
			System.out.printf("%nPlayer %s Wins!", player1);
		}
		
		public static void winnerMsgP2() {
			gameBoard();
			System.out.printf("%nPlayer %s Wins!", player2);
		}
		
		public static boolean checkWinCondition() {
			//Conditions to Player 1 win
			if(spaces[0][0].equals("X") & spaces[0][1].equals("X") & spaces[0][2].equals("X")) {
				winnerMsgP1();
				return true;
			}
			else if(spaces[1][0].equals("X") & spaces[1][1].equals("X") & spaces[1][2].equals("X")) {
				winnerMsgP1();
				return true;
			}
			else if(spaces[2][0].equals("X") & spaces[2][1].equals("X") & spaces[2][2].equals("X")) {
				winnerMsgP1();
				return true;
			}
			else if(spaces[0][0].equals("X") & spaces[1][0].equals("X") & spaces[2][0].equals("X")) {
				winnerMsgP1();
				return true;
			}
			else if(spaces[0][1].equals("X") & spaces[1][1].equals("X") & spaces[2][1].equals("X")) {
				winnerMsgP1();
				return true;
			}
			else if(spaces[0][2].equals("X") & spaces[1][2].equals("X") & spaces[2][2].equals("X")) {
				winnerMsgP1();
				return true;
			}
			else if(spaces[0][0].equals("X") & spaces[1][1].equals("X") & spaces[2][2].equals("X")) {
				winnerMsgP1();
				return true;
			}
			else if(spaces[2][0].equals("X") & spaces[1][1].equals("X") & spaces[0][2].equals("X")) {
				winnerMsgP1();
				return true;
			}
			//Conditions to Player 2 win
			else if(spaces[0][0].equals("O") & spaces[0][1].equals("O") & spaces[0][2].equals("O")) {
				winnerMsgP2();
				return true;
			}
			else if(spaces[1][0].equals("O") & spaces[1][1].equals("O") & spaces[1][2].equals("O")) {
				winnerMsgP2();
				return true;
			}
			else if(spaces[2][0].equals("O") & spaces[2][1].equals("O") & spaces[2][2].equals("O")) {
				winnerMsgP2();
				return true;
			}
			else if(spaces[0][0].equals("O") & spaces[1][0].equals("O") & spaces[2][0].equals("O")) {
				winnerMsgP2();
				return true;
			}
			else if(spaces[0][1].equals("O") & spaces[1][1].equals("O") & spaces[2][1].equals("O")) {
				winnerMsgP2();
				return true;
			}
			else if(spaces[0][2].equals("O") & spaces[1][2].equals("O") & spaces[2][2].equals("O")) {
				winnerMsgP2();
				return true;
			}
			else if(spaces[0][0].equals("O") & spaces[1][1].equals("O") & spaces[2][2].equals("O")) {
				winnerMsgP2();
				return true;
			}
			else if(spaces[2][0].equals("O") & spaces[1][1].equals("O") & spaces[0][2].equals("O")) {
				winnerMsgP2();
				return true;
			}
			else{
				return false;
			}
		}
		
		public static void gameBoard(){
			System.out.print("");
			System.out.println("   0   1   2");
			System.out.printf("0  %s | %s | %s %n", spaces[0][0], spaces[0][1], spaces[0][2]);
			System.out.println("  ---+---+---");
			System.out.printf("1  %s | %s | %s %n", spaces[1][0], spaces[1][1], spaces[1][2]);
			System.out.println("  ---+---+---");
			System.out.printf("2  %s | %s | %s %n", spaces[2][0], spaces[2][1], spaces[2][2]);
			
			
		}
		
		public static void main(String[] args) {
			
			//Gets the player names
			getPlayerNames();
			
			for (int i = 0; i <= 10; i++){	
				//Checks draw condition
				if (i == 10) {
					gameBoard();
					System.out.printf("%nDraw!");
					break;
				}
				//Labels created to make a CPU x CPU game visually better 
				boardOutput: {
					playerInput: {
						if (i == 0) {
							break playerInput;
						}
						//Try and catch exceptions if a player input an non-int or out of bounds coordinate
						try {
							//Defines player's turn
							if(i % 2 == 1) {
								//Checks if player 1 is a CPU
								if (player1.equalsIgnoreCase("cpu")){
									row = rand.nextInt(3);
									column = rand.nextInt(3);
								}
								else {
									System.out.println("Input a row:");
									row = scan.nextInt();
									System.out.println("Input a column:");
									column = scan.nextInt();
								}
							}
							else if(i % 2 == 0) {
								//Checks if player 2 is a CPU
								if (player2.equalsIgnoreCase("cpu")){
									row = rand.nextInt(3);
									column = rand.nextInt(3);
								}
								else {
									System.out.println("Input a row:");
									row = scan.nextInt();
									System.out.println("Input a column:");
									column = scan.nextInt();
								}
							}
							//Checks if the user choose an already picked coordinate
							if (spaces[row][column].equals("X") | spaces[row][column].equals("O")){
								//For player's turn
								if(i % 2 == 1 & !player1.equalsIgnoreCase("cpu") | i % 2 == 0 & !player2.equalsIgnoreCase("cpu")) {
									System.out.printf("%nInvalid coordinates, Try Again. %n");
									i--;
									break playerInput;
								}	
								else {
									i--;
									break boardOutput;
								}
							}
						}
						catch (InputMismatchException e){
							System.out.printf("%nInvalid coordinates, Try Again. %n");
							i--;
							scan.next();
							break playerInput;
						}
						catch (ArrayIndexOutOfBoundsException e){
							System.out.printf("%nInvalid coordinates, Try Again. %n");
							i--;
							break playerInput;
						}
						
						//Sets the player's sign
						if(i % 2 == 1) {
							spaces[row][column] = "X";
						}
						else if(i % 2 == 0) {
							spaces[row][column] = "O";
						}
						
						//Checks win condition
						if(checkWinCondition()) {
							break;
						}
					}
					if (i < 9) {
						//Shows the current state of the Game
						System.out.printf("%nInput a coordinate: %n" );
						gameBoard();
						
						//Shows in the console the player's turn
						if(i % 2 == 0 | i == 0) {
							System.out.printf("%n%s's Turn (X) %n%n", player1);
						}
						else if(i % 2 == 1) {
							System.out.printf("%n%s's Turn (O) %n%n", player2);
						}
					}	
				}	
			}
			scan.close();
		}
	}