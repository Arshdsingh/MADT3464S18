package com.madt;

import com.madt.Airthmetic;

public class Dailytask {
    public static void main(String args[]) {
        Airthmetic airthmetic = new Airthmetic();
        airthmetic.addition();
        System.out.println("Integer Sum is : "+airthmetic.addition(20,30));
        System.out.println("Float sum is : "+airthmetic.addition(20.4f,31.3f));
        int numbers[] = {10,20,30,40};
        airthmetic.additionarray(numbers);
        int numbersarr[] = {10,20,30,40};
        airthmetic.additionarr(numbersarr);
    }
}
