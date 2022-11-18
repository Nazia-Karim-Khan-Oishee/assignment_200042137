package assignment2.ContentCoupling;

public class CustomerAccount {
    private String name;
    private int balance;

    public CustomerAccount(String name,int balance)
    {
        this.name=name;
        this.balance=balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getName()
    {
        return this.name;
    }
    public int getbalance()
    {
        return this.balance;
    }
    public void debit(int amount)
    {
        this.setBalance(this.getbalance()-amount);
    }
    public void credit(int amount)
    {
        this.setBalance(this.getbalance()+amount);
    }
}
