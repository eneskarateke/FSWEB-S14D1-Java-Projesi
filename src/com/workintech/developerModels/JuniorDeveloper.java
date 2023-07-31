package com.workintech.developerModels;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(20000);
        System.out.println(super.getName() + " junior developer starts to working");
    }

    public void work(double salary) {
        setSalary(salary);
        System.out.println(getName() + " junior developer begins to work.");
    }
}
