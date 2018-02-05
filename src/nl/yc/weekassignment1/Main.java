package nl.yc.weekassignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        Player player = new Player();
        Boat b1 = new Boat(6);
        Boat b2 = new Boat(2);
        Boat b3 = new Boat(4);
        Boat b4 = new Boat(3);
        Boat b5 = new Boat(3);
        ArrayList<String> space = createSpace(8, 8);
        Sea sea = new Sea(space);
        sea.addBoat(b1, "A3");
        sea.addBoat(b2, "C3");
        sea.addBoat(b3, "E3");
        sea.addBoat(b4, "G3");
        sea.addBoat(b5, "H3");
        while (player.shots > 0) {
            System.out.print("Play: ");
            String input = scanner.next();
            player.shoot(sea, input);
        }
        System.out.println("End of game");
    }

    static ArrayList<String> createSpace(int x, int y) {

        ArrayList<String> localSpace = new ArrayList<String>();
        int letterA = (int) 'A';

        for (int i = 0; i < x; i++) {
            String letter = (char) (letterA + i) + "";
            for (int j = 1; j <= y; j++) {
                String point = letter + j;
                localSpace.add(point);
            }
        }
        return localSpace;
    }
}