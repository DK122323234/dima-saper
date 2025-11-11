package com.example.dimasapper;

import java.util.*;
import java.util.stream.IntStream;

public class MinePlacement {
    public Set<Integer> returnMines() {
        Set<Integer> set = new HashSet<>();
        Random rand = new Random();
        IntStream.of(rand.nextInt(80), rand.nextInt(80), rand.nextInt(80), rand.nextInt(80), rand.nextInt(80), rand.nextInt(80),
                rand.nextInt(80), rand.nextInt(80)).forEach(set::add);

        while (set.size() < 8) {
            set.add(rand.nextInt(80));
        }

        return set;
    }
}
