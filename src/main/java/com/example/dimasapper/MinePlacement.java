package com.example.dimasapper;

import java.util.*;
import java.util.stream.IntStream;

public class MinePlacement {
    public Set<Integer> returnMines() {
        Set<Integer> cellIndexMine = new HashSet<>();
        Random rand = new Random();
        IntStream.of(rand.nextInt(80), rand.nextInt(80), rand.nextInt(80), rand.nextInt(80), rand.nextInt(80), rand.nextInt(80),
                rand.nextInt(80), rand.nextInt(80)).forEach(cellIndexMine::add);

        while (cellIndexMine.size() < 8) {
            cellIndexMine.add(rand.nextInt(80));
        }

        return cellIndexMine;
    }
}
