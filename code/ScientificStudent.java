package com.company;

public class ScientificStudent extends SecondarySchoolStudent{
    private int chemistryMark;
    private int physicsMark;
    private int biologyMark;
    static int numberOfSubjects = 6;

    public ScientificStudent(String name, String schoolName, String birthDate){
        super(name, schoolName, birthDate);
    }

    public int getChemistryMark() {
        return chemistryMark;
    }

    public void setChemistryMark(int chemistryMark) {
        this.chemistryMark = chemistryMark;
    }

    public int getPhysicsMark() {
        return physicsMark;
    }

    public void setPhysicsMark(int physicsMark) {
        this.physicsMark = physicsMark;
    }

    public int getBiologyMark() {
        return biologyMark;
    }

    public void setBiologyMark(int biologyMark) {
        this.biologyMark = biologyMark;
    }

    public void setMarks(int arabicLanguageMark, int englishLanguageMark, int mathMark, int chemistryMark,
                         int physicsMark, int biologyMark){
        setMarks(arabicLanguageMark, englishLanguageMark, mathMark);
        this.chemistryMark = chemistryMark;
        this.physicsMark = physicsMark;
        this.biologyMark = biologyMark;
        calculateGpa();
    }

    public void calculateGpa(){
        // Override for calculateGpa of SecondarySchoolStudent
        double gpa = (getArabicLanguageMark() + getEnglishLanguageMark() + getMathMark()
                + chemistryMark + physicsMark + biologyMark)/numberOfSubjects;
        setGpa(gpa);
    }

}
