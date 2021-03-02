package com;

public class SimpleInterestCalculator {
    int principle;
    int years;
    public static void main(String[] args)
    {
        SimpleInterestCalculator simIntCalc=new SimpleInterestCalculator();
        simIntCalc.calculateSimpleInterest(200000,12);
        simIntCalc.calculateSimpleInterest(50000,12);
        simIntCalc.calculateSimpleInterest(50000,5);
    }
    public void calculateSimpleInterest(int principle,int years) {
        /*If  principal is greater than one lakh

        If number of years is greater than 10
        Simple interest = P * N *10/100
        Otherwise if number of years < 10
        Simple interest = P * N *9.5/100
*/
        int simpleinterest;
        if (principle > 100000) {
            if (years > 10) {
                simpleinterest = principle * years * 10 / 100;
                System.out.println("The interest amount for a principal " + principle+"and"+" years "+years+ " is " + simpleinterest);
            }
            else
            {
                simpleinterest = (int)(principle * years * 9.5/ 100);
                System.out.println("The interest amount for a principal " + principle+"and"+" years "+years+ " is " + simpleinterest);
            }
        }
        else
        {/*Else if amount is less than one lakh
If number of years is greater than 10
Simple interest = P * N *5/100
Otherwise if number of years < 10
Simple interest = P * N *4.5/100
*/
            if (principle < 100000)
            {
                if (years > 10)
                {
                    simpleinterest = principle * years * 5 / 100;
                    System.out.println("The interest amount for a principal " + principle + "and" + " years " +years+ " is " + simpleinterest);
                }
                else
                    {
                    simpleinterest = (int) (principle * years * 4.5 / 100);
                    System.out.println("The interest amount for a principal " + principle + "and" + " years " +years+ " is " + simpleinterest);
                   }
            }
        }

    }
}
