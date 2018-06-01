package com.madt;

public class Airthmetic {
    public void addition() {
        int number = 0;
        System.out.println("Addition is : " + (number + 20));
    }

    public int addition(int num1, int num2) {
        //System.out.println("Sum is : "+(num1+num2));
        return (num1 + num2);
    }

    public float addition(float num1, float num2) {
        return (num1 + num2);
    }

    public void additionarray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum Of Array : " + sum);
    }

    public void additionarr(int... arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum is : " + sum);
    }


}
