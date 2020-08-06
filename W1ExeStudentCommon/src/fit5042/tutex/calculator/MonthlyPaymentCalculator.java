 package fit5042.tutex.calculator;

import javax.ejb.Remote;

@Remote
public interface MonthlyPaymentCalculator {
  /**
* Calculate the amount of a monthly payment
*
* @param principle - the amount of money borrowed
* @param year - the number of years needed to pay off the loan * @param interestRate - the interest rate for the loan
*/
	double calculate(double principle, int year, double interestRate);
} 