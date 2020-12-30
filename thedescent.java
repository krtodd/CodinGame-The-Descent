import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int maxHeight;

        // game loop
        while (true) {
            //heightTest = 0;
            Vector <Integer> mountainHeights = new Vector <Integer> (8); //creates new vector to store mountain heights

            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                mountainHeights.add(mountainH); //adds mountain heights to vector
            }

            maxHeight = mountainHeights.get(0);
            for (int i = 0; i < mountainHeights.size(); i++){
                if (mountainHeights.get(i) > maxHeight){
                    maxHeight = mountainHeights.get(i);
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            //System.out.println("4"); // The index of the mountain to fire on.
            System.out.println(mountainHeights.indexOf(maxHeight));
        }
    }
}
