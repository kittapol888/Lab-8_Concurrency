public class BankAccount {
    private long balance ;

    public synchronized void deposit(long amuont){
        balance += amuont ;
    }

    public synchronized void withdraw(long amuont){
        if (balance>=amuont) 
            balance -= amuont ;
    }
    public long getBalance(){
        return this.balance ;
    }
}
