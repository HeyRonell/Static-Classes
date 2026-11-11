package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String name1 = NameFormatter.format("Ron", "Figueroa");
        String name2 = NameFormatter.format("", "Ronell", "Figueroa", "Bautista", "");

        System.out.println(name1);
        System.out.println(name2);

    }
}
