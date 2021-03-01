package com.example.sumonahemed.projectdemo;

public class Question  {

    public String mquestion[]={
            "What is the biggest country in the world?",
            "What is the most successfull country in the world?",
            "What country capital name is Dhaka?",
            "What country mother toungh of bangla?",
            "What country is the most poor in the world?"
    };

    private String mchoice[][]={
            {"India","Rasia","China","USA"},
            {"USA","Canada","SwZerland","Australia"},
            {"Bangladesh","India","Pakisthan","Srilanka"},
            {"India","Bangladesh","Rasia","Vhutan"},
            {"Bangladesh","Swdan","Denmark","Ireland"}

    };

    private String mcorrectanswer[]={"Rasia","USA","Bangladesh","Bangladesh","Swdan"};

    public String getQuestion(int a)
    {
        String question=mquestion[a];
        return question;
    }
    public String getchoice1(int a)
    {
        String choice=mchoice[a][0];
        return choice;
    }
    public String getchoice2(int a)
    {
        String choice=mchoice[a][1];
        return choice;
    }
    public String getchoice3(int a)
    {
        String choice=mchoice[a][2];
        return choice;
    }
    public String getchoice4(int a)
    {
        String choice=mchoice[a][3];
        return choice;
    }

    public String getcorrectanswer(int a)
    {
        String correctanswer=mcorrectanswer[a];
        return correctanswer;
    }
}
