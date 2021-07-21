package com.reconvince.me;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("\n" +
                "███╗░░██╗██╗░░░██╗███╗░░░███╗██████╗░███████╗██████╗░░██████╗░███████╗███╗░░██╗\n" +
                "████╗░██║██║░░░██║████╗░████║██╔══██╗██╔════╝██╔══██╗██╔════╝░██╔════╝████╗░██║\n" +
                "██╔██╗██║██║░░░██║██╔████╔██║██████╦╝█████╗░░██████╔╝██║░░██╗░█████╗░░██╔██╗██║\n" +
                "██║╚████║██║░░░██║██║╚██╔╝██║██╔══██╗██╔══╝░░██╔══██╗██║░░╚██╗██╔══╝░░██║╚████║\n" +
                "██║░╚███║╚██████╔╝██║░╚═╝░██║██████╦╝███████╗██║░░██║╚██████╔╝███████╗██║░╚███║\n" +
                "╚═╝░░╚══╝░╚═════╝░╚═╝░░░░░╚═╝╚═════╝░╚══════╝╚═╝░░╚═╝░╚═════╝░╚══════╝╚═╝░░╚══╝\n");

        Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.println("What number would you like the random number gen to go up to?");
    int upperbound = scanner.nextInt();


    if (upperbound > 0) {
        int randOm = random.nextInt(upperbound);
        System.out.println("You're random number is " + randOm + "!");
      } else {
        System.out.println("Don't put 0.");
    }
    }





}
