package nl.yc.weekassignment1;

public class Boat {

    int size;
    int startPosition;
    int endPosition;

    public Boat(int size) {
        this.size = size;
    }

    boolean hasPosition(int hitPosition) {
        if ((hitPosition >= this.startPosition && hitPosition <= this.endPosition) ||
                (hitPosition >= this.endPosition && hitPosition <= this.startPosition)) {
            return true;
        }
        return false;
    }
}

