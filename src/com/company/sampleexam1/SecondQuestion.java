package com.company.sampleexam1;

public class SecondQuestion {
    public static void main(String[] args) {

        int num = 12;
        int i = 2;
        while(i < num/2 && num%i != 0){
            i++;
        }

        System.out.print(num + " is ");
        if(i < num/2)
            System.out.print("not ");
        System.out.println("prime");
    }
}
