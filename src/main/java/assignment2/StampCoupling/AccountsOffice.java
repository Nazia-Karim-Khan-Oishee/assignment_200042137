package assignment2.StampCoupling;

import assignment2.ContentCoupling.CustomerAccount;

import java.util.ArrayList;
import java.util.List;

public class AccountsOffice {
    List<Customer> customerList=new ArrayList<>();
    public int checkBalance(Customer customer)
    {
        return customer.getBalance();
    }
    //StampCoupling
    public int Debitfromaccount(CustomerAccount account,int amount)
    {
        account.debit(amount);
        return account.getbalance();
    }
    //SolutiontoStampCoupling often leads to data coupling
    public int Debitfromaccount(String accountid,int amount)
    {
        for (Customer customer: customerList ) {
            if(customer.getAccountnumber()==accountid)
            {
                customer.debit(amount);
                return customer.getBalance();
            }
        }
        return 0;
    }
}
