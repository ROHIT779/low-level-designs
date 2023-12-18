Problem Statement: Design an Loan EMI Tracker  
Requirements: 1. There are 2 types of users: Admin and Customer
2. Admin has admin_name and he can create loan for a customer  
3. Customer has customer_name and can repay for only his loans  
4. Customer can fetch his loan details like EMIs paid, remaining_balance etc
5. Admin can check all the customers and their loans  
6. A loan has loan_id, principal_amount, interest_rate, tenure, total_number_of_emis, monthly_emi_amount  
7. Total repayable amount is A=P+I where P=Principal amount and I=Interest amount, I=P*N*R/100 where N=tenure in years and R=Rate of Interest  
8. Monthly EMI amount=total repayable amount/(tenure*12)  
  
Design:
Loan(loanId,amount,interestRate,tenure,totalEmis,emisPaid,emiAmount,totalAmount,remainingAmount,getLoanInfo())  
Customer(customerName,LoanList,payEMI(),getLoansInfo())  
Admin(adminName,Map of Customer->LoanList,createLoan())  
EMITrackerMain(creates admin, customers, loans)  
  
Workflow:
1. Create Admin first  
2. Create Customers and Loans objects  
3. call createLoan() on admin object using customer and loan to create a loan for the customer  
4. payEMI() can be called by the customer to pay monthly EMI  
5. getLoansInfo() can be called by the customer to check loan details
