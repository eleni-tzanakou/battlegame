package nl.yc.weekassignment1;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        Player player = new Player();
        Boat b1 = new Boat(6);
        Boat b2 = new Boat(2);
        Boat b3 = new Boat(4);
        Boat b4= new Boat(3);
        Boat b5 = new Boat(3);
        Sea sea = new Sea(new int[100]);
        sea.addBoat(b1,3);
        sea.addBoat(b2,97);
        sea.addBoat(b3,45);
        sea.addBoat(b4,28);
        sea.addBoat(b5,16);
        while (player.shots > 0){
            System.out.println("Play");
            int input = scanner.nextInt();
            player.shoot(sea , input);
        }
        System.out.println("End of game");
    }

}