package org.example.emitracker.models;

public class Loan {
    private int loanId;
    private double amount;
    private double interestRate;
    private int tenure;
    private int totalEmis;
    private int emisPaid;
    private double emiAmount;
    private double totalAmount;
    private double remainingAmount;
    public Loan(int loanId,double amount, double interestRate,int tenure){
        this.loanId=loanId;
        this.amount=amount;
        this.interestRate=interestRate;
        this.tenure=tenure;
        this.emisPaid=0;
        totalAmount=amount+((amount*tenure*interestRate)/100);
        if(tenure!=0){
            this.emiAmount=amount/(tenure*12);
        }
        totalEmis=(int)Math.ceil(totalAmount/emiAmount);
        remainingAmount=totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public int getEmisPaid() {
        return emisPaid;
    }

    public void setEmisPaid(int emisPaid) {
        this.emisPaid = emisPaid;
    }

    public double getEmiAmount() {
        return emiAmount;
    }

    public void setEmiAmount(double emiAmount) {
        this.emiAmount = emiAmount;
    }
    public void setRemainingAmount(double remainingAmount){
        this.remainingAmount=remainingAmount;
    }
    public double getRemainingAmount(){
        return remainingAmount;
    }
    public int getEmisPending(){
        return (totalEmis-emisPaid);
    }

    public String getLoanInfo(){
        return "LoanId: "+loanId+" Amount: "+amount+" Total amount: "+totalAmount+" Interest Rate: "+interestRate+" Tenure: "+tenure+" Total number of EMIs: "+totalEmis+" EMIs paid: "+emisPaid+" EMIs pending: "+getEmisPending()+" EMI amount: "+emiAmount+" Remaining amount: "+getRemainingAmount()+"\n";
    }
}
