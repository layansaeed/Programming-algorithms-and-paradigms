package com.company;

public class Main
{
    public static void main (String[]args)
    {
        ScientificStudent s1 = new ScientificStudent("Layan", "HTU", "17/03/2003");
        s1.setMarks(80,90,75);
        s1.setMarks(80,90,75, 95,87,80);
        System.out.println(s1.getGpa());

    }
}



