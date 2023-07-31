package com.workintech.developerModels;

public class MidDeveloper extends Employee{

    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(30000);
        System.out.println(super.getName() + " mid developer starts to working");
    }
}
