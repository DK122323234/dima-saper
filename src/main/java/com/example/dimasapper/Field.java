package com.example.dimasapper;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Field {
    static final int MINE_VALUE = 9;
    static final int DISPLACEMENT_OF_THE_LEFT_CAGE = -1;
    static final int DISPLACEMENT_OF_THE_RIGHT_CAGE = 1;
    static final int RIGHT_DOWN_CELL = 10;
    static final int LEFT_DOWN_CELL = 8;
    static final int RIGHT_UP_CELL = -8;
    static final int LEFT_UP_CELL = -10;
    static final int MINIMUM_INDEX_CELL = 0;
    static final int MAXIMUM_INDEX_CELL = 80;
    static final int UP_CELL = -9;
    static final int DOWN_CELL = 9;
    static final int MAXIMUM_CELLS = 81;
    static final int MINE_NEARBY = 1;
    static final Set<Integer> LEFTMOST_CELL_INDEXES = Set.of(0, 9, 18, 27, 36, 45, 56, 63, 72);
    static final Set<Integer> RIGHTMOST_CELL_INDEXES = Set.of(8, 17, 26, 35, 44, 53, 62, 71, 80);

    private static List<Integer> getMinefield(Set<Integer> locationMine) {
        List<Integer> fieldCellArray = new ArrayList<>();
        int indexArrayMine = 0;

        while (fieldCellArray.size() < MAXIMUM_CELLS) {
            if (locationMine.contains(indexArrayMine)) {
                fieldCellArray.add(9);
            } else {
                fieldCellArray.add(0);
            }
            indexArrayMine++;
        }
        return fieldCellArray;
    }

    public static List<Integer> getCellsLeftMine(List<Integer> fieldCellArray, int indexArrayMine) {

        if (fieldCellArray.get(indexArrayMine + DISPLACEMENT_OF_THE_LEFT_CAGE) != MINE_VALUE) {
            fieldCellArray.set(indexArrayMine + DISPLACEMENT_OF_THE_LEFT_CAGE, fieldCellArray.get(indexArrayMine + DISPLACEMENT_OF_THE_LEFT_CAGE) + MINE_NEARBY);

        }
        if (indexArrayMine + LEFT_DOWN_CELL <= MAXIMUM_INDEX_CELL) {
            if (fieldCellArray.get(indexArrayMine + LEFT_DOWN_CELL) != MINE_VALUE) {
                fieldCellArray.set(indexArrayMine + LEFT_DOWN_CELL, fieldCellArray.get(indexArrayMine + LEFT_DOWN_CELL) + MINE_NEARBY);
            }
        }
        if (indexArrayMine + LEFT_UP_CELL >= MINIMUM_INDEX_CELL) {
            if (fieldCellArray.get(indexArrayMine + LEFT_UP_CELL) != MINE_VALUE) {
                fieldCellArray.set(indexArrayMine + LEFT_UP_CELL, fieldCellArray.get(indexArrayMine + LEFT_UP_CELL) + MINE_NEARBY);
            }

        }
        return fieldCellArray;
    }

    public static List<Integer> getCellsRightMine(List<Integer> fieldCellArray, int indexArrayMine) {

        if (fieldCellArray.get(indexArrayMine + DISPLACEMENT_OF_THE_RIGHT_CAGE) != MINE_VALUE) {
            fieldCellArray.set(indexArrayMine + DISPLACEMENT_OF_THE_RIGHT_CAGE, fieldCellArray.get(indexArrayMine + DISPLACEMENT_OF_THE_RIGHT_CAGE) + MINE_NEARBY);
        }

        if (indexArrayMine + RIGHT_UP_CELL >= MINIMUM_INDEX_CELL) {
            if (fieldCellArray.get(indexArrayMine + RIGHT_UP_CELL) != MINE_VALUE) {
                fieldCellArray.set(indexArrayMine + RIGHT_UP_CELL, fieldCellArray.get(indexArrayMine + RIGHT_UP_CELL) + MINE_NEARBY);
            }
        }
        if (indexArrayMine + RIGHT_DOWN_CELL <= MAXIMUM_INDEX_CELL) {
            if (fieldCellArray.get(indexArrayMine + RIGHT_DOWN_CELL) != MINE_VALUE) {
                fieldCellArray.set(indexArrayMine + RIGHT_DOWN_CELL, fieldCellArray.get(indexArrayMine + RIGHT_DOWN_CELL) + MINE_NEARBY);
            }
        }

        return fieldCellArray;
    }

    public static List<Integer> getCellsAboveAndBelowMine(List<Integer> fieldCellArray, int indexArrayMine) {
        if (indexArrayMine + UP_CELL >= MINIMUM_INDEX_CELL) {
            if (fieldCellArray.get(indexArrayMine + UP_CELL) != MINE_VALUE) {
                fieldCellArray.set(indexArrayMine + UP_CELL, fieldCellArray.get(indexArrayMine + UP_CELL) + MINE_NEARBY);
            }
        }

        if (indexArrayMine + DOWN_CELL <= MAXIMUM_INDEX_CELL) {
            if (fieldCellArray.get(indexArrayMine + DOWN_CELL) != MINE_VALUE) {
                fieldCellArray.set(indexArrayMine + DOWN_CELL, fieldCellArray.get(indexArrayMine + DOWN_CELL) + 1);
            }
        }
        return fieldCellArray;
    }

    public static List<Integer> reMiSnefieluhbdd(List<Integer> fieldCellArray) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int indexArrayMine = 0;
        for (Integer cell : fieldCellArray) {
            if (cell == MINE_VALUE) {
                if (LEFTMOST_CELL_INDEXES.contains(fieldCellArray.get(indexArrayMine))) {
                    fieldCellArray = Field.getCellsLeftMine(fieldCellArray,indexArrayMine);
                }
            }
            indexArrayMine++;
        }
    }
}


