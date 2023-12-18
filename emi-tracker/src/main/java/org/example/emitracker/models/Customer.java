package org.example.emitracker.models;

import java.util.List;

public class Customer {
    private String customerName;
    private List<Loan> loans;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public Customer(String name){
        this.customerName=name;
    }
    public void payEMI(int loanId){
        Loan loan=validateLoan(loanId);
        if(loan != null){
            if(loan.getRemainingAmount()>loan.getEmiAmount()){
                loan.setRemainingAmount(loan.getRemainingAmount()-loan.getEmiAmount());
            }else{
                loan.setRemainingAmount(0);
            }
            loan.setEmisPaid(loan.getEmisPaid()+1);
        }else{
            System.out.println("Invalid loanId passed: "+loanId);
        }
    }
    public void getLoansInfo(){
        if(loans!=null){
            for(Loan loan:loans){
                if(loan!=null){
                    System.out.println(loan.getLoanInfo());
                }else{
                    System.out.println("No Loan exists for the customer");
                }
            }
        }
    }
    private Loan validateLoan(int loanId){
        for(Loan loan: loans){
            if(loan!=null){
                if(loan.getLoanId()==loanId){
                    return loan;
                }
            }
        }
        return null;
    }
}
