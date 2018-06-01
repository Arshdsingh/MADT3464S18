package com.madt;

public class person {
    String name;
    String address;
    int age;

    person()
    {
        name="unknown";
        address="unkhown";
        age=1;
    }
    person(String name,String address,int age) {
        this.name=name;
        this.address=address;
        this.age=age;
    }
    person(person anperson) {
        this.name = anperson.name;
        this.address=anperson.address;
        this.age=anperson.age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : "+name+"\n"+"Address : "+address+"\n"+"age : "+age;
    }
}
