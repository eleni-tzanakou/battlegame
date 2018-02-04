package nl.yc.weekassignment1;

public class Player {
    int shots;

    public Player() {
        this.shots = 5;
    }

    void shoot(Sea sea, int hitPosition) {
        shots = shots-1;
        sea.hitOrMiss(hitPosition);
    }
}

