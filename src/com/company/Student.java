package com.company;

public class Student {
    private String name;
    private String lastName;
    private int yearsOld;
    private String birthDay;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        if (this.yearsOld > 0) {
            this.yearsOld = yearsOld;
        } else {
            System.out.println("Возрат студента отрицателен");
        }
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }




}
