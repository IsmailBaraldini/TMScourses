package com.javacourses.sc.lesson6;

public class CreditСard {

    long accountnumber;
    long currentamount;

    public CreditСard() {
    }

    @Override
    public String toString() {
        return "Creditcard : " +
                "accountnumber=" + accountnumber +
                ", currentamount=" + currentamount;
    }

    public CreditСard(long accountnumber, long currentamount) {

        this.accountnumber = accountnumber;
        this.currentamount = currentamount;

    }
}
