package nl.yc.weekassignment1;


import java.util.ArrayList;

public class Sea {

    int[] space;
    ArrayList<Boat> boats;

    public Sea(int[] space, ArrayList<Boat> boats) {
        this.space = space;
        this.boats = boats;
    }

    public Sea(int[] space) {
        this.space = space;
        this.boats = new ArrayList<Boat>();
    }

    public void hitOrMiss(int hitPosition) {
        for (int i = 1; i < boats.size(); i++) {
            Boat boat = boats.get(i);
            if( boat.hasPosition(hitPosition)){
                System.out.println("HIT");
                return;
            }
        }
        System.out.println("MISS");
    }
    public void addBoat(Boat boat, int startPosition){

        boat.startPosition = startPosition;
        boat.endPosition = startPosition + boat.size-1;
        this.boats.add(boat);
    }
}
