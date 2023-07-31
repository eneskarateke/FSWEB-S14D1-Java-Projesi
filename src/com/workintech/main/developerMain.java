package com.workintech.main;


import com.workintech.developerModels.*;

import java.util.Arrays;

public class developerMain {
    public static void main(String[] args) {
        Employee hademe = new Employee(6, "Murat", 11500);
        hademe.work();

        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(2, "Baha");
        juniorDeveloper1.work();
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(3, "Serkan");
        juniorDeveloper2.work();
        //JuniorDeveloper[] juniors = new JuniorDeveloper[]{juniorDeveloper1, juniorDeveloper2};

        MidDeveloper midDeveloper1 = new MidDeveloper(3, "Ahmet");
        midDeveloper1.work();
        MidDeveloper midDeveloper2 = new MidDeveloper(4, "Mehmet");
        midDeveloper2.work();
        //MidDeveloper[] juniors = new JuniorDeveloper[]{juniorDeveloper1, juniorDeveloper2};

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(5, "Ayse");
        seniorDeveloper.work();


        HRManager hrManager = new HRManager(1, "Mustafa", new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        System.out.println("Senior Salary: " + seniorDeveloper.getSalary());
        System.out.println("Hr Manager Salary: " + hrManager.getSalary());

        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));

        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(0, midDeveloper1);
        hrManager.addEmployee(0, seniorDeveloper);
        hrManager.addEmployee(0, seniorDeveloper);

        System.out.println("***********************************************");
        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));


    }

}