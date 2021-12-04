/*
 * Course: CS10121 - 021
 * Winter 2021
 * LSH 1- Colors and Enumeration
 * Name: Asher Sprigler
 * Created: 12/04/2021
 */

package spriglera;


import java.util.Locale;
import java.util.Scanner;

enum Color
{
    BLUE("\u001B[34m"), RED("\u001B[31m"),
    GREEN("\u001B[32m"), ORIGINAL("\u001B[0m");

    private String ansi;


    private Color(String ansi)
    {
        this.ansi = ansi;
    }

    public String getCode()
    {
        return this.ansi;
    }
}

public class Main {


    public static void main(String[] args) {
        /**
         * Will maintain the program loop as long as the value is true
         */
        boolean programRunning = true;

        Scanner scanner = new Scanner(System.in);

        String userInput;


        System.out.println("Welcome to Number Converter 3000!" + '\n' +
                "This program will take a decimal number" + '\n' +
                "and convert it to binary and hexadecimal representations" + '\n');

        System.out.println(Color.BLUE.getCode() + "Decimal will be displayed in blue");
        System.out.println(Color.RED.getCode() + "Decimal will be displayed in red");
        System.out.println(Color.GREEN.getCode() + "Binary will be displayed in green");

        System.out.println(Color.ORIGINAL.getCode());
        while(programRunning) {
            System.out.println("Please enter a number to convert (or q to quit)");
            userInput = scanner.nextLine();
            if (userInput.equals("q")) {
                programRunning = false;
                System.out.println("Thank you for using Number Converter 3000!");
            } else {
                validate(userInput);
            }

        }
    }

    /**
     * This method accepts a String from the user,
     * and ensures that the input is an integer
     *
     * @param input the String input from the user in the main loop
     * @return vaild whether or not the string can be turned into an integer
     */
    public static void validate(String input)
    {
        try {
            display(Integer.parseInt(input));

        }
        catch (Exception e){

        }
    }
    /**
     * This method takes an integer value and displays it:
     * in decimal using the color blue,
     * Hexidecimal using the color red,
     * and Binary in the color green.
     *
     * @param decimal the decimal input from the user in the main loop
     * @return the
     */
    public static void display(int decimal)
    {
        System.out.println(Color.BLUE.getCode() + "Decimal: " + decimal);
        System.out.println(Color.RED.getCode() + "Hexadecimal: " + "0x" + Integer.toHexString(decimal).toUpperCase(Locale.ROOT));
        System.out.println(Color.GREEN.getCode() + "Binary: " + Integer.toBinaryString(decimal));
        System.out.println(Color.ORIGINAL.getCode());
    }
}
