package games;
import java.util.*;

import java.util.Arrays;

public class Tictacgames {
	 static String[] board;
	static String turn;
	
	static String checkwinner() 
	{
		for(int a=0;a < 8;a++) {
			String line=null;
			
			 switch (a) {
	            case 0:
	                line = board[0] + board[1] + board[2];
	                break;
	            case 1:
	                line = board[3] + board[4] + board[5];
	                break;
	            case 2:
	                line = board[6] + board[7] + board[8];
	                break;
	            case 3:
	                line = board[0] + board[3] + board[6];
	                break;
	            case 4:
	                line = board[1] + board[4] + board[7];
	                break;
	            case 5:
	                line = board[2] + board[5] + board[8];
	                break;
	            case 6:
	                line = board[0] + board[4] + board[8];
	                break;
	            case 7:
	                line = board[2] + board[4] + board[6];
	                break;
	            }
		
			 if(line.equals("XXX")) {
				 return "x";
			 }else if(line.equals("SSS")) {
				 return "S";
			 }
		}
		
		for(int a=0;a < 9;a++) {
			if(Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}else if(a==8) {
				return "draw";
			}
		}
		
		System.out.println(turn + " Turns:" );
		  return null; 
	}
		//PRINT BOARD
		
		static void printboard() {
			
			System.out.println("|---|---|---|");
			
	        System.out.println("| " + board[0] + " | "
	                           + board[1] + " | " + board[2]
	                           + " |");
	        System.out.println("|-----------|");
	        System.out.println("| " + board[3] + " | "
	                           + board[4] + " | " + board[5]
	                           + " |");
	        System.out.println("|-----------|");
	        System.out.println("| " + board[6] + " | "
	                           + board[7] + " | " + board[8]
	                           + " |");
	        System.out.println("|---|---|---|");
		
		
	}

	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		board=new String[9];
		turn="X";
		String winner=null;
		for(int a=0;a<9;a++) {
			board[a]=String.valueOf(a+1);
		}
			System.out.println("Welcome to the Tic Tac Game");
			printboard();
			
			System.out.println("X Turn:");
		while(winner==null) {
			int numinput;
		
			try {
				numinput=in.nextInt();
				if(!(numinput> 0 && numinput<=9)) {
					System.out.println("Invalid option Enter the Correct Number");
					continue;
				}
			}
				catch(InputMismatchException e) {
					System.out.println("Invalid option Enter the Correct Number");
					continue;
				}
				if(board[numinput-1].equals(String.valueOf(numinput))) {
					board[numinput-1]=turn;
					
					if(turn.equals("X")) {
						turn="S";
					}else {
						turn="X";
					}
						printboard();
						winner=checkwinner();				
				}
				else {
					System.out.println("Slot Already Taken");
				}
			}
			if(winner.equalsIgnoreCase("draw")) {
				System.out.println("It is Draw");
			}else {
				System.out.println("Congragulation " + winner +" 'S have Won The Game ");
			}
		in.close();
	
		}

}
