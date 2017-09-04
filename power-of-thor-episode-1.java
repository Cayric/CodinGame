import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            String pos = "";
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            if(lightY>initialTY){
                pos+="S";
                initialTY++;
            }
            if(lightY<initialTY){
                pos+="N";
                initialTY--;
            }
            if(lightX>initialTX){
                pos+="E";
                initialTX++;
            }
            if(lightX<initialTX){
                pos+="W";
                initialTX--;
            }
            
            System.out.println(pos);
        }
    }
}