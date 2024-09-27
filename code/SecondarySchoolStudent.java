package com.company;

public class SecondarySchoolStudent extends Student{
    private int arabicLanguageMark;
    private int englishLanguageMark;
    private int mathMark;
    static int numberOfSubjects = 3;

    public SecondarySchoolStudent(String name, String schoolName, String birthDate){
        super(name, schoolName, birthDate);
    }

    public int getArabicLanguageMark() {
        return arabicLanguageMark;
    }

    public void setArabicLanguageMark(int arabicLanguageMark) {
        this.arabicLanguageMark = arabicLanguageMark;
    }

    public int getEnglishLanguageMark() {
        return englishLanguageMark;
    }

    public void setEnglishLanguageMark(int englishLanguageMark) {
        this.englishLanguageMark = englishLanguageMark;
    }

    public int getMathMark() {
        return mathMark;
    }

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }

    public void setMarks(int arabicLanguageMark, int englishLanguageMark, int mathMark){
        this.arabicLanguageMark = arabicLanguageMark;
        this.englishLanguageMark = englishLanguageMark;
        this.mathMark = mathMark;
        calculateGpa();
    }

    public void calculateGpa(){
        double gpa = (arabicLanguageMark + englishLanguageMark + mathMark)/numberOfSubjects;
        setGpa(gpa);
    }


}
