package com.company;

public class SellingDepartment extends Department implements Dep{
    public SellingDepartment() {
    }

    @Override
    public void doJob(int summ) {
    FrontDepartment fd = new FrontDepartment(summ);
    }
}
