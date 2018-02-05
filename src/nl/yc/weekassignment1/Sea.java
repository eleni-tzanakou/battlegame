package nl.yc.weekassignment1;


import java.util.ArrayList;

public class Sea {

    ArrayList<String> space;
    ArrayList<Boat> boats;

    public Sea(ArrayList<String> space, ArrayList<Boat> boats) {
        this.space = space;
        this.boats = boats;
    }

    public Sea(ArrayList<String> space) {
        this.space = space;
        this.boats = new ArrayList<Boat>();
    }

    public void hitOrMiss(String hitPosition) {
        for (int i = 0; i < boats.size(); i++) {
            Boat boat = boats.get(i);
            if (boat.isHit(hitPosition)) {
                System.out.println("HIT");
                if (boat.isSunk()) {
                    System.out.println("BOAT IS SUNK");
                }
                return;
            }
        }
        System.out.println("MISS");
    }

    public void addBoat(Boat boat, String startPosition) {
        boat.addPosition(startPosition, this.space);
        this.boats.add(boat);
    }
}
