package org.example.emitracker;

import org.example.emitracker.models.Admin;
import org.example.emitracker.models.Customer;
import org.example.emitracker.models.Loan;

public class EMITrackerMain{
    public static void main(String[] args) {
        Admin admin=new Admin("admin1");
        Customer customer=new Customer("customer1");
        Loan loan=new Loan(1,1000,15,5);
        Loan loan2=new Loan(2,5000,10,3);
        Loan loan3=new Loan(3,2000,10,5);

        admin.createLoan(customer,loan);
        admin.createLoan(customer,loan2);
        customer.getLoansInfo(); //checking loan details after the loan is created
        customer.payEMI(1);
        customer.payEMI(1);
        customer.getLoansInfo(); //checking loan details after paying 2 EMIs for loanId: 1
        Customer customer2=new Customer("customer2");
        admin.createLoan(customer2,loan3);
        customer2.payEMI(3);
        customer2.payEMI(1); //paying EMI for a different Loan which does not belong to this user. Results in error message
        customer2.getLoansInfo(); //checking loan details after paying 1 EMI for loanId: 3
        System.out.println("***********************************************");
        //for all the customers, admin can check the loan details
        for(Customer customerX:admin.getCustomerLoanMap().keySet()){
            System.out.println(customerX.getCustomerName());
            customerX.getLoansInfo();
        }
    }
}