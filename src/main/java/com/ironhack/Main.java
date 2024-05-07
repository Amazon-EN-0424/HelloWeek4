package com.ironhack;


import com.google.gson.Gson;
import net.datafaker.Faker;

public class Main {
    public static void main(String[] args) {


        Faker faker = new Faker();

        System.out.println("Hello " + faker.name().fullName());

        System.out.println(faker.chuckNorris().fact());
        System.out.println(faker.phoneNumber().phoneNumber());


        Gson gson = new Gson();


        Rapper rapper1 = new Rapper("Kendrick", "kdot");
        rapper1.addSong("Meet the grahams");
        rapper1.addSong("This is not us");

        System.out.println(rapper1);

        var rapper1Json = gson.toJson(rapper1); // we are generating a json representation of an object
        System.out.println(rapper1Json);

        Rapper rapperClone = gson.fromJson(rapper1Json, Rapper.class); // we are using a json representation in order to create a Java object
        System.out.println(rapperClone.getName());

        var rapper2Json = """
                {"name":"Drake","nickname":"Drake","songs":["One last dance"]}
                """;

        Rapper rapper2 = gson.fromJson(rapper2Json, Rapper.class); // we are using a json representation in order to create a Java object
        System.out.println(rapper2);

    }
}