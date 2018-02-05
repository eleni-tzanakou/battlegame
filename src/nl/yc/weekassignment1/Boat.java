package nl.yc.weekassignment1;

import java.util.ArrayList;

public class Boat {

    int size;
    ArrayList<String> position;
    int remainingHits;

    public Boat(int size) {
        this.size = size;
        this.remainingHits = size;
        this.position = new ArrayList<String>();
    }

    boolean isHit(String hitPosition) {
        if (this.position.contains(hitPosition)) {
            this.remainingHits = this.remainingHits - 1;
            return true;
        }
        return false;
    }

    boolean isSunk() {
        if (remainingHits == 0) {
            return true;
        }
        return false;
    }

    public void addPosition(String startPosition, ArrayList<String> space) {
        int startIndex = space.indexOf(startPosition);
        this.position.add(startPosition);
        for (int i = 1; i < this.size; i++) {
            this.position.add(space.get(startIndex + i));
        }
    }
}

