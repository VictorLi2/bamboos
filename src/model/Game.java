package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private List<Integer> wall = new ArrayList<Integer>();
    private List<Integer> hand = new ArrayList<Integer>();
    private List<Integer> discards = new ArrayList<Integer>();

    public Game() {
        createWall();
        drawHand();
    }

    private void createWall() {
        for(int i = 1; i < 10; i++) {
            Collections.addAll(wall, i, i, i, i);
        }

        Collections.shuffle(wall);
    }

    private void drawHand() {
        for(int i = 0; i < 14; i++) {
            draw();
        }
    }

    private void draw() {
        hand.add(wall.remove(0));
    }

    public List<Integer> getHand() {
        return hand;
    }

    public List<Integer> getDiscards() {
        return discards;
    }

    public void sortHand() {
        Collections.sort(hand);
    }

    public boolean discard(Integer i) {
        if(hand.remove(i)) {
            discards.add(i);
            draw();
            return true;
        } else {
            return false;
        }
    }
}
