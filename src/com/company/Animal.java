package com.company;

public abstract class Animal {
    private int age;
    private String name;

    /**
     * @param age  - age have written user;
     * @param name - name have written user;
     */
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * @return - age cow;
     */
    public int getAge() {
        return age;
    }
}
