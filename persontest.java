package com.madt;

import java.util.Scanner;

public class persontest {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        person person = new person();
        System.out.print("Enter Name : ");
        person.setName(person.name=scanner.nextLine());
        System.out.print("Enter Address : ");
        person.setAddress(person.address=scanner.nextLine());
        System.out.print("Enter Age : ");
        person.setAge(person.age=scanner.nextInt());

        System.out.print("\n");
        System.out.println("Name : "+person.getName()+"\n"+"Address : "+person.getAddress()+"\n"+ "Age : "+person.getAge());
        //System.out.print(person.toString());
        person arsh = new person("Arshdeep","3321",18);
        //System.out.print(arsh.toString());


        person jatinder = new person(arsh);
        System.out.print(jatinder.toString());
    }
}
