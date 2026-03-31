package ScenarioBased;
import java.util.*;
public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int player1Position=0;
        int player2Position=0;
        int diceCount=0;
        int currentPlayer = 1;
        Random rand=new Random();
        while(player1Position!=100 && player2Position!=100) {
        	
        	int dice_number=rand.nextInt(6)+1;
        	System.out.println("Player " + currentPlayer + " rolled dice: " + dice_number);
        	boolean extraTurn=false;
        	diceCount++;
        	if(currentPlayer==1) {
        		int previousPosition = player1Position;
                System.out.println("0 for no play,1 for ladder or 2 for snake");
                int option=rand.nextInt(3);
                if(option==1) {
                	player1Position+=dice_number;
                	System.out.println("ladder");
                	extraTurn=true;
                }
                else if(option==2) {
                	player1Position-=dice_number;
                	System.out.println("snake");
                }
                else {
                	System.out.println("no play");
                }
                if (player1Position < 0) {
                	player1Position = 0;
                }
                if(player1Position>100) {
                	player1Position=previousPosition;
                }
                System.out.println("The current position of the player1 is at "+player1Position);
        	}
        	else {
        		int previousPosition = player2Position;
                System.out.println("0 for no play,1 for ladder or 2 for snake");
                int option=rand.nextInt(3);
                if(option==1) {
                	player2Position+=dice_number;
                	System.out.println("ladder");
                	extraTurn=true;
                }
                else if(option==2) {
                	player2Position-=dice_number;
                	System.out.println("snake");
                }
                else {
                	System.out.println("no play");
                }
                if (player2Position < 0) {
                	player2Position = 0;
                }
                if(player2Position>100) {
                	player2Position=previousPosition;
                }
                System.out.println("The current position of the player2 is at "+player2Position);
        	
        	}
            System.out.println("The number of times the dice was played: "+diceCount);
            if(!extraTurn) {
            	currentPlayer=(currentPlayer==1)?2:1;
            }
            
            

        }
        if(player1Position==100) {
        	System.out.println("The palyer 1 is won");
        }
        else {
        	System.out.println("The player 2 is won");
        }
	}

}
