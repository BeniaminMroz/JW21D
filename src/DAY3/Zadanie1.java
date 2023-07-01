//package DAY3;
//
//import java.util.StringTokenizer;
//
//public class Zadanie1 {
//    public static void main(String[] args) {
//
//        StringTokenizer str1;
//        String date = "29/04/2016";
//        str1 = new StringTokenizer(date, "/");
//        System.out.println("Part 1: " + str1.nextToken());
//        System.out.println("Part 2: " + str1.nextToken());
//        System.out.println("Part 3: " + str1.nextToken());
//
//    }
//}
//
///* Solution to Chapter 3, Exercise 1 in Teach Yourself Java in 21 Days (Eighth
//   Edition) by Rogers Cadenhead. */
//package com.java21days;
//
//class Birthday {
//    public static void main(String[] arguments) {
//        String birthday = "04/29/2020";
//        String month = birthday.substring(0, 2);
//        String day = birthday.substring(3, 5);
//        String year = birthday.substring(6, 10);
//        System.out.println("Birthday: " + birthday);
//        System.out.println("Month: " + month);
//        System.out.println("Day: " + day);
//        System.out.println("Year: " + year);    }
//}