package com.perscholas.java_basics;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {
//      // @TestCase #1

       KidUsers kid = new KidUsers();
       // try age 10yo check the output!!
       kid.age = 10;
       System.out.println("1 -"+ kid.registerAccount());
         // try age 18yo check the output!!
       kid.age =  18;
       System.out.println("2 -  "+kid.registerAccount());

       System.out.println("----------->");
       // check booktype kid what is the output
       kid.bookType = "Kids";
       System.out.println(kid.requestBook());
        kid.bookType = "Fiction";
        System.out.println(kid.requestBook());
         System.out.println("==================>");
          // TestCase #2
           AdultUser adultUser = new AdultUser();
            adultUser.age = 5;
            System.out.println("1 -"+ adultUser.registerAccount());
            // try age 18yo check the output!!
            adultUser.age =  23;
            System.out.println("2 -  "+ adultUser.registerAccount());

            System.out.println("----------->");
            // check booktype kid what is the output
            adultUser.bookType = "Kids";
            System.out.println(adultUser.requestBook());
            adultUser.bookType = "Fiction";
            System.out.println(adultUser.requestBook());

    }
}
