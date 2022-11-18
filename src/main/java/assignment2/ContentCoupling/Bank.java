package assignment2.ContentCoupling;

import assignment2.ContentCoupling.CustomerAccount;

public class Bank {
    //TightCoupling
    public int DebitfromBalance(CustomerAccount account, int amount)
    {
        int balance=account.getbalance()-amount;
        account.setBalance(balance);
        return account.getbalance();
    }
    public int CreitfromBalance(CustomerAccount account,int amount)
    {
        int balance=account.getbalance()+amount;
        account.setBalance(balance);
        return account.getbalance();
    }

    //LooseCoupling
    public int Debitfromaccount(CustomerAccount account,int amount)
    {
        account.debit(amount);
        return account.getbalance();
    }
    public int Creitfromaccount(CustomerAccount account,int amount)
    {
        account.credit(amount);
        return account.getbalance();
    }

}
