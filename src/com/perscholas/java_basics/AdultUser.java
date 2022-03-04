package com.perscholas.java_basics;

public class AdultUser implements LibraryUser {
    int age;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    String bookType;

    public AdultUser() {
        // default constructor
    }

    @Override
    public String registerAccount() {
        if (age > 12){
            return "“You have\n" +
               "successfully registered under an Adult Account”";
        }else if (age < 12){
            return "“Sorry, Age must be greater than 12\n" +
                    "to register as an adult”";
        }
        return null;
    }

    @Override
    public String requestBook() {

       if (bookType == "Fiction"){
           return "“Book Issued\n" +
            "successfully, please return the book within 7 days”";
       }
       return "“Oops, you are allowed to take only adult\n" +
               "Fiction books”";
    }
}
