package com.company;

public class Student {
    private String name;
    private String birthDate;
    private String schoolName;
    private double gpa;

    public Student(String name, String schoolName, String birthDate) {
        this.name = name;
        this.schoolName = schoolName;
        this.birthDate = birthDate;
        this.gpa = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) { // dd/mm/yyyy
        if(birthDate.length() == 10 && birthDate.charAt(2) == '/' && birthDate.charAt(5) == '/')
            this.birthDate = birthDate;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getGpa() {
        return gpa;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
