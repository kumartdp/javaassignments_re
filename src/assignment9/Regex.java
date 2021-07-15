package assignment9;

import java.util.Scanner;

public class Regex {
    public static void main(String args[]) {
        System.out.println("Enter input String:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.matches("^[A-Z].*[.]")) {
            System.out.println("Match found");

        } else {
            System.out.println("given input does not match with an entry capital letter and ending with period");
        }

    }
}
