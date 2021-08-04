package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;                         // khai bao bien kieu double
        System.out.print("Your weight (in kilogram):");    // nhap du lieu tu ban phim
        weight= scanner.nextDouble();

        System.out.println("Your height (in meter):");
        height=scanner.nextDouble();

        bmi= weight/ Math.pow(height, 2);  // dung ham Math.pow(x,2) de binh phuong so x
        System.out.printf("%-20s%s","bmi","Interpretation\n");

        if(bmi<18)
            System.out.printf("%-20.2f%s",bmi,"underweight");
        else if(bmi < 25.0)
            System.out.printf("%-20.2f%s",bmi,"Normal");
        else if(bmi < 30.0)
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        else
            System.out.printf("%-20.2f%s",bmi,"Obese");

    }
}
