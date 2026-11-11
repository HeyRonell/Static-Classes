package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String name1 = NameFormatter.format("Ron", "Figueroa");
        String name2 = NameFormatter.format("", "Ronell", "Figueroa", "Bautista", "");
        String name3 = NameFormatter.format("Ron Bautista");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

    }
}
