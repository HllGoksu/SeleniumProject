package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {


    @Test
    public static void faker() {
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name() = " + faker.name().fullName());



        String streetAddress = faker.address().streetAddress();

        System.out.println("faker.numerify(\"##-###-####-#\") = " + faker.numerify("##-###-####-#"));
        System.out.println("faker.letterify(\"b???A?\") = " + faker.letterify("b???A?"));
        System.out.println("faker.bothify(\"##-###\") = " + faker.bothify("##??-###"));



        System.out.println("faker.finance().creditCard() = "
                + faker.finance().creditCard().replaceAll("-", ""));
    }


}