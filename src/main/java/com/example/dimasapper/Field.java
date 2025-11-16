package com.example.dimasapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Field {
    public List<Integer> returnField(Set<Integer> ARRAY_LOCATION_MIN){
        List<Integer> fieldCellArray  = new ArrayList<>();
        Integer[] ARRAY_OF_PROHIBITED_INDEX1 = {0, 9, 18, 27, 36, 45, 56, 63, 72};
        List<Integer> ARRAY_LIST_OF_PROHIBITED_INDEX1 = new ArrayList<>(List.of(ARRAY_OF_PROHIBITED_INDEX1));

        Integer[] ARRAY_OF_PROHIBITED_INDEX2 = {8, 17, 26, 35, 44, 53, 62, 71, 80};
        List<Integer> ARRAY_LIST_OF_PROHIBITED_INDEX2 = new ArrayList<>(List.of(ARRAY_OF_PROHIBITED_INDEX2));
        int INDEX_ARRAY_MINE = 0;


           while(fieldCellArray.size() < 81){
                     if (ARRAY_LOCATION_MIN.contains(INDEX_ARRAY_MINE)){
                         fieldCellArray.add(9);

            }
            else {
                         fieldCellArray.add(0);
            }
               INDEX_ARRAY_MINE++;
        }
        INDEX_ARRAY_MINE = 0;


           for (Integer integer : fieldCellArray){
               if (integer == 9){
                   try {
                     if (!ARRAY_LIST_OF_PROHIBITED_INDEX1.contains(INDEX_ARRAY_MINE)){
                         if (fieldCellArray.get(INDEX_ARRAY_MINE - 1) != 9){
                             fieldCellArray.set(INDEX_ARRAY_MINE - 1, fieldCellArray.get(INDEX_ARRAY_MINE - 1) + 1);

                         }
                         if (INDEX_ARRAY_MINE + 8 <= 80) {
                             if (fieldCellArray.get(INDEX_ARRAY_MINE + 8) != 9) {
                                 fieldCellArray.set(INDEX_ARRAY_MINE + 8, fieldCellArray.get(INDEX_ARRAY_MINE + 8) + 1);
                             }
                         }
                         if (INDEX_ARRAY_MINE - 10 >= 0) {
                             if (fieldCellArray.get(INDEX_ARRAY_MINE - 10) != 9) {
                                 fieldCellArray.set(INDEX_ARRAY_MINE - 10, fieldCellArray.get(INDEX_ARRAY_MINE - 10) + 1);
                             }

                         }
                       }
                     else {
                         System.out.println("Если это читает Лёша, перестань немедлено");
                     }





                       if (!ARRAY_LIST_OF_PROHIBITED_INDEX2.contains(INDEX_ARRAY_MINE)){

                           if (fieldCellArray.get(INDEX_ARRAY_MINE + 1) != 9) {
                               fieldCellArray.set(INDEX_ARRAY_MINE + 1, fieldCellArray.get(INDEX_ARRAY_MINE + 1) + 1);
                           }

                           if (INDEX_ARRAY_MINE - 8 >= 0) {
                               if (fieldCellArray.get(INDEX_ARRAY_MINE - 8) != 9) {
                                   fieldCellArray.set(INDEX_ARRAY_MINE - 8, fieldCellArray.get(INDEX_ARRAY_MINE - 8) + 1);
                               }
                           }
                           if (INDEX_ARRAY_MINE + 10 <= 80) {
                               if (fieldCellArray.get(INDEX_ARRAY_MINE + 10) != 9) {
                                   fieldCellArray.set(INDEX_ARRAY_MINE + 10, fieldCellArray.get(INDEX_ARRAY_MINE + 10) + 1);
                               }
                           }


                       }
                       else {
                           System.out.println("Если это читает Лёша, Я ЖЕ СКАЗАЛ ПЕРЕСТАТЬ");

                       }
                   }
                   catch (Exception e){
                       System.out.println("ПРОЧИТАТЬ:");
                   }

                       if (INDEX_ARRAY_MINE - 9 >= 0) {
                           if (fieldCellArray.get(INDEX_ARRAY_MINE - 9) != 9) {
                               fieldCellArray.set(INDEX_ARRAY_MINE - 9, fieldCellArray.get(INDEX_ARRAY_MINE - 9) + 1);
                       }
                   }

                       if (INDEX_ARRAY_MINE + 9 <= 80) {
                           if (fieldCellArray.get(INDEX_ARRAY_MINE + 9) != 9) {
                               fieldCellArray.set(INDEX_ARRAY_MINE + 9, fieldCellArray.get(INDEX_ARRAY_MINE + 9) + 1);
                       }
                   }






               }
               INDEX_ARRAY_MINE ++;
           }

        return fieldCellArray;
    }
}

