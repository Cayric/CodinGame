import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        int xMin = -1;
        int xMax = W;
        int yMin = -1;
        int yMax = H;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            if(bombDir.lastIndexOf("U") != -1){    
                yMax = Y0;
                Y0 = (Y0-((yMax-yMin)/2));
            }

             if(bombDir.lastIndexOf("D") != -1){ 
                yMin = Y0;
                Y0 = (Y0+((yMax-yMin)/2));
            }

             if(bombDir.lastIndexOf("L") != -1){ 
                xMax = X0;
                X0 = (X0-((xMax-xMin)/2));
            }
            
             if(bombDir.lastIndexOf("R") != -1){ 
                xMin = X0;
                X0 = (X0+((xMax-xMin)/2));
            }
            
            System.out.println(X0 + " " + Y0);
        }
    }
}