package hm_25042024;

import java.util.Scanner;

public class Lab97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year:");
        int year = sc.nextInt();

        if((year%4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("It is a Leap Year.");
        }
        else
        {
            System.out.println("It is not a Leap Year");
        }
        sc.close();
    }

}