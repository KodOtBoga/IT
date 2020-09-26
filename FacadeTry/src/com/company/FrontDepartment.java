package com.company;

public class FrontDepartment extends Department{
    private int sum;
    private String str = "FrontDevelopers: ";

    public FrontDepartment(int sum) {
        this.sum = sum;
        if(this.sum == 0)
        {
            str += "Chilling and Relaxing";
        }
        else if(this.sum > 1000 && this.sum < 2000)
        {
            str += "Creating design";
        }
        else
        {
            str += "Doing our best";
        }
        System.out.println(str);

        BackDepartment bd = new BackDepartment(this.sum);
    }

    }
