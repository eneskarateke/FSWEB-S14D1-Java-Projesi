package com.workintech.developerModels;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(50000);
        System.out.println(super.getName() + " senior developer starts to working");
    }
}
