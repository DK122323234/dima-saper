package com.example.dimasapper;

import java.util.ArrayList;
import java.util.List;

public class Field {
    public List<Integer> returnField(List<Integer> list){
       List<Integer> list1 = new ArrayList<>();

        int i = 81 - list.size();
        while(i > 0){
            list.add(0);
            i--;
        }
        int a = 0;
        for (Integer integer : list) {

            if (integer == 0) {
                try {
                    if (list.get(a - 1).equals(9)) {
                        integer = integer + 1;
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    if (list.get(a + 1).equals(9)) {
                        integer = integer + 1;
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    if (list.get(a - 9).equals(9)) {
                        integer = integer + 1;
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    if (list.get(a + 9).equals(9)) {
                        integer = integer + 1;
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    if (list.get(a - 8).equals(9)) {
                        integer = integer + 1;
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    if (list.get(a - 10).equals(9)) {
                        integer = integer + 1;
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    if (list.get(a + 10).equals(9)) {
                        integer = integer + 1;
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
                }

                try {
                    if (list.get(a + 8).equals(9)) {
                        integer = integer + 1;
                    }
                }
                catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(integer);
                 list1.add(integer);
        }
            if(integer == 9){
                list1.add(9);
            }

            System.out.println(integer);
            a++;
        }
        return list1;
    }
}
