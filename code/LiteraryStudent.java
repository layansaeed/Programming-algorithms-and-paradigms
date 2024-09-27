package com.company;

public class LiteraryStudent extends SecondarySchoolStudent {

    private int geographyMark;
    private int islamicScienceMark;
    private int historyMark;
    static int  numberOfSubjects = 6;

    public LiteraryStudent(String name, String schoolName, String birthDate){
        super(name, schoolName, birthDate);
    }

    public int getGeographyMark() {
        return geographyMark;
    }

    public void setGeographyMark(int geographyMark) {
        this.geographyMark = geographyMark;
    }

    public int getIslamicScienceMark() {
        return islamicScienceMark;
    }

    public void setIslamicScienceMark(int islamicScienceMark) {
        this.islamicScienceMark = islamicScienceMark;
    }

    public int getHistoryMark() {
        return historyMark;
    }

    public void setHistoryMark(int historyMark) {
        this.historyMark = historyMark;
    }

    public void setMarks(int arabicLanguageMark, int englishLanguageMark, int mathMark, int geographyMark,
                         int islamicScienceMark, int historyMark){
        setMarks(arabicLanguageMark, englishLanguageMark, mathMark);
        this.geographyMark = geographyMark;
        this.islamicScienceMark = islamicScienceMark;
        this.historyMark = historyMark;
        calculateGpa();
    }

    public void calculateGpa(){
        double gpa = (getArabicLanguageMark() + getEnglishLanguageMark() + getMathMark()
                + geographyMark + islamicScienceMark + historyMark)/numberOfSubjects;
        setGpa(gpa);
    }
}
