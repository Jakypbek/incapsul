package com.company;

public class Main {

    public static void main(String[] args) {

        Curs curs1 = new Curs();
        curs1.setName("Peaksoft");
        curs1.setNumber(0700123123);
        curs1.setDateOfBegin("03.01.2022");
        curs1.setNameOfTeacher("Mухамед Алланов");

        Student student1 = new Student();
        student1.setName("Jakypbek");
        student1.setLastName("Kadyrov");
        student1.setYearsOld(-20);
        student1.setBirthDay("12.02.2001");

        System.out.println(student1.getYearsOld());

    }
}
