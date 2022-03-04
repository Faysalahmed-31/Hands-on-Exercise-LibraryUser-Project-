package com.perscholas.java_basics;

public class KidUsers implements LibraryUser {
    int age;

    public KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    String bookType;

    public KidUsers() {
         // default constructor
    }

    @Override
    public String registerAccount() {
        if (age < 12) {
            return "“You have successfully\n" +
                    "registered under a Kids Account";
        } else if (age > 12) {
            return "Sorry Age must be less than 12 to register" +
                    "as a kid ";
        }
        return null;
    }



        @Override
        public String requestBook() {
           if (bookType == "Kids"){
               return "book issued succesfull please return " +
                       "the book with in 10 days " ;
           }
            return "“Oops, you are allowed to take only kids\n" +
                    "books”";
        }
    }
