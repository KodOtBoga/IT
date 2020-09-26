package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum;
        Scanner scan = new Scanner(System.in);

    SellingDepartment sd = new SellingDepartment();
        System.out.println("Hello, we can create a project for you, Enter a summ($) and we do what it cost: ");
    while(true)
    {
        sum = scan.nextInt();
        sd.doJob(sum);
    }
    }
}
