package org.example.emitracker.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin {
    private String adminUserName;
    private Map<Customer, List<Loan>> customerLoanMap;
    public Admin(String name){
        this.adminUserName=name;
        customerLoanMap=new HashMap<>();
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }
    public void createLoan(Customer customer, Loan loan){
        if(loan==null){
            System.out.println("Null loan object is passed");
        }else{
            if(customerLoanMap.containsKey(customer)){
                List<Loan> loans=customer.getLoans();
                loans.add(loan);
                customer.setLoans(loans);
                customerLoanMap.put(customer,customer.getLoans());
            }else{
                List<Loan> loans=new ArrayList<>();
                loans.add(loan);
                customer.setLoans(loans);
                customerLoanMap.put(customer,loans);
            }
        }
    }

    public Map<Customer, List<Loan>> getCustomerLoanMap() {
        return customerLoanMap;
    }
}
