package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("số lượng snt muốn in ra = ");
        int number = scanner.nextInt();
        int n = 2;
        int i;
        boolean check = true;
        int count = 0;
        while (count < number) {
            n++;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                } else {
                    check = true;

                }
            }
            if (check){
                System.out.println(n);
                count++;
            }
        }
    }
}
