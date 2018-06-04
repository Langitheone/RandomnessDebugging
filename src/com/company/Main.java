package com.company;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
	output ("Generated 6 random intergers between 0 and 6 ");
	Random rnd = new Random();

        for (int i = 1; i <= 12; ++i)
        {
            int randomInt = 1 + rnd.nextInt(6);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);

    }
}
