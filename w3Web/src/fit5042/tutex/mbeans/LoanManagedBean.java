package fit5042.tutex.mbeans;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fit5042.tutex.repository.entities.Loan;
import fit5042.tutex.calculator.MonthlyPaymentCalculator;

/**
 *
 * @author: originally created by Eddie. The following code has been changed in
 * order for students to practice.
 */
@ManagedBean(name="loanManagedBean",eager=true)
@SessionScoped
public class LoanManagedBean implements Serializable {
	@EJB 
	public MonthlyPaymentCalculator calculator;

    
	private Loan loan;

    public LoanManagedBean() {
        this.loan = new Loan();

    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public String calculate() {
        
        double monthlyPayment=calculator.calculate(loan.getPrinciple(), loan.getNumberOfYears(), loan.getInterestRate());
        //You will need to modify the monthlyPayment value and set it as the monthly payment attribute value into the loan instance
        //Please complete this method starts from here
        loan.setMonthlyPayment(monthlyPayment);
        
        return "index";
    }
}
