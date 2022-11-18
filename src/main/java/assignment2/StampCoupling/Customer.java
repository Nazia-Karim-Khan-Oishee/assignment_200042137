package assignment2.StampCoupling;

public class Customer {
    private String name,address,mobilenumber,accountnumber;
    private int balance;

    public void setName(String name)
    {
        this.name=name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setMobilenumber(String mobilenumber)
    {
        this.mobilenumber=mobilenumber;
    }
    public void setAccountnumber(String accountnumber)
    {
        this.accountnumber=accountnumber;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getMobilenumber(){
        return this.mobilenumber;
    }
    public String getAccountnumber(){
        return this.accountnumber;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void debit(int amount)
    {
        this.setBalance(this.getBalance()-amount);
    }
    public void credit(int amount)
    {
        this.setBalance(this.getBalance()+amount);
    }
}
