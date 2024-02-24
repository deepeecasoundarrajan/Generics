package Adapter.ThirdParty;

public class ICICIBankAPI {
    int accountNo;

    public ICICIBankAPI(int acctNo) {
        this.accountNo = acctNo;
    }

    public void getDBConnection() {
        System.out.println("Connecting to ICICI DB ");
    }

    public int balanceForAccount() {
        System.out.println("Finding balance for acctNo in ICICI" + this.accountNo);
        return 200;
    }
}
