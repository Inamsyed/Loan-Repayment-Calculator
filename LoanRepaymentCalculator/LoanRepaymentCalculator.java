import java.util.Scanner;
public class LoanRepaymentCalculator {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		System.out.println("Enter loan amount? ");
		double principalAmount = input.nextFloat();
		
		System.out.println("Enter annual interest rate (e.g. 0.04)?");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 12 ;
		double interestRate = monthlyInterestRate + 1 ;
		
		
		System.out.println("Enter the term of the loan in years?");
		int termYears = input.nextInt();
		int termMonths = termYears * 12 ;
		
		double monthlyRepayments = principalAmount * monthlyInterestRate *((Math.pow(interestRate,termMonths)/((Math.pow(interestRate,termMonths)-1))));
		
		System.out.printf("The monthly repayment for a " + termYears + " year loan of %.2f at an annual interest rate of " 
		+ annualInterestRate + " would be %.2f%n" ,principalAmount, monthlyRepayments);

																						

		}
}

