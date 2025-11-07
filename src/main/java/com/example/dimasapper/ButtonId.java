package com.example.dimasapper;

public class ButtonId {
    public static String sendingId(String source){
        String[] separation = source.split("id=");
        String[] id = separation[1].split(",") ;
        return id[0] ;
    }
}