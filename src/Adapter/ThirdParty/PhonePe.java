package Adapter.ThirdParty;

public class PhonePe {
    BankingService bankingservice;

    public PhonePe(BankingService bankingservice) {
        this.bankingservice = bankingservice;
    }

    public int getBalance() {
        bankingservice.connecttoDb();
        return bankingservice.balance();
    }
}
