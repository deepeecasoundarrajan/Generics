package Adapter.ThirdParty;

public class Main {
    public static void main(String[] args) {
        BankingService adapter = new ICICIBankAdapter(12345);
        PhonePe p = new PhonePe(adapter);

        p.getBalance();
    }
}
