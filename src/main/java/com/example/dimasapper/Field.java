package com.example.dimasapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Field {
    public List<Integer> returnField(Set<Integer> set){
        List<Integer> list1 = new ArrayList<>();
        int i = 0;
           while(list1.size() < 81){
                 if (set.contains(i)){
                list1.add(9);

            }
            else {
                list1.add(0);
            }
            i++;
        }
           i = 0;


           for (Integer integer : list1){
               if (integer == 9){
                   try {
                     if (i != 0 && i != 9 && i != 18 && i != 27 && i != 36 && i != 45
                             && i != 54 && i != 63 && i != 72){
                         if (list1.get(i - 1) != 9){
                             list1.set(i - 1, list1.get(i - 1) + 1);

                         }
                         if (i + 8 <= 80) {
                             if (list1.get(i + 8) != 9) {
                                 list1.set(i + 8, list1.get(i + 8) + 1);
                             }
                         }
                       }
                     else {
                         System.out.println("Если это читает Лёша, перестань немедлено");
                     }





                       if (i != 8 && i != 17 && i  != 26 && i != 35 && i != 44 &&
                                i != 53 && i != 62 && i != 71 && i != 80){

                           if (list1.get(i + 1) != 9) {
                               list1.set(i + 1, list1.get(i + 1) + 1);
                           }
                           if (i - 10 >= 0) {
                               if (list1.get(i - 10) != 9) {
                                   list1.set(i - 10, list1.get(i - 10) + 1);
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

                       if (i - 9 >= 0) {
                           if (list1.get(i - 9) != 9) {
                           list1.set(i - 9, list1.get(i - 9) + 1);
                       }
                   }

                       if (i + 9 <= 80) {
                           if (list1.get(i + 9) != 9) {
                           list1.set(i + 9, list1.get(i + 9) + 1);
                       }
                   }

                   if (i - 8 >= 0) {
                       if (list1.get(i - 8) != 9) {
                           list1.set(i - 8, list1.get(i - 8) + 1);
                       }
                   }


                   if (i + 10 <= 80) {
                       if (list1.get(i + 10) != 9) {
                           list1.set(i + 10, list1.get(i + 10) + 1);
                       }
                   }

               }
               i ++;
           }

        return list1;
    }
}

