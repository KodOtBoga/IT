package com.company;

public class BackDepartment extends Department {
    private int summ;
    private String str = "BackEnd Developers:";

    public BackDepartment(int summ) {
        this.summ = summ;
        if(this.summ == 0)
        {
            str += "Reading gitHub, Habr, sleeping";
        }
        else if(this.summ > 1000 && this.summ < 2000)
        {
            str += "Doing our Best";
        }
        else
        {
            str += "PRODUCTIONS OVER 9000!!!";
        }
        System.out.println(str);
    }

}
