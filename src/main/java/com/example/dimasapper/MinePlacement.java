package com.example.dimasapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class MinePlacement {
    public List<Integer> returnMines() {
        List<Integer> mines = new ArrayList<Integer>();
        int a = 0;
        while (a <= 8) {

            if (mines.size() >= 80) {
                if (a < 8 ){

                    mines.subList(0, a).clear();

                 Integer f = Integer.valueOf(Math.toIntExact(Stream.of(mines).filter(value -> value.equals(9)).count())) ;
                    if (a > f){
                        for (int i = 0; i < 8-f; i++) {
                              mines.add(9);
                        }
                    }
                }
            }

            Random rand = new Random();
            if (rand.nextInt(100) <= 10 + a) {
                mines.add(9);
                a++;
            }
            else {
                mines.add(0);
            }

        }
        return mines;
    }
}
