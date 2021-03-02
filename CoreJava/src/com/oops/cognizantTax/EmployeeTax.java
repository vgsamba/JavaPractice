package com.oops.cognizantTax;

public class EmployeeTax {
    public static void main(String[] args) {
        /*Test Case 1:  Specify the following values and run the main method
        1.	Set  the value of citizenship as true, basicSalary as 25000.
        2.	Invoke the methods calculateTax(), deductTax(), validateTax().
            Output:  The following messages should be displayed in the console
        The Tax of the employee  for  the   25000 is 7500
        The nett salary of the employee 17500
        The salary and citizenship eligibility:  false*/

        TaxCalculator tx1 = new TaxCalculator(25000, true);
        tx1.calculateTax();
        tx1.deductTax();
        tx1.validateSalary();

        /*Test Case 2:  Specify the following values and run the main method
1.	Set  the value of citizenship as true, basicSalary as 125000.
2.	Invoke the methods calculateTax(), deductTax(), validateTax().
Output:  The following messages should be displayed in the console
The Tax of the employee  for  the   125000 is 37500
The nett salary of the employee 87500
The salary and citizenship eligibility: true  */

        TaxCalculator tx2 = new TaxCalculator(125000, true);
        tx2.calculateTax();
        tx2.deductTax();
        tx2.validateSalary();


    }
}
