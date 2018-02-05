package nl.yc.weekassignment1;

import java.util.ArrayList;

public class Player {
    int shots;
    ArrayList<String> hits;

    public Player() {
        this.shots = 10;
        this.hits = new ArrayList<String>();
    }

    void shoot(Sea sea, String hitPosition) {
        if (hits.contains(hitPosition)){
            System.out.println("You already hit there! Choose another position!");
            return;
        }
        shots = shots - 1;
        hits.add(hitPosition);
        sea.hitOrMiss(hitPosition);
    }
}

