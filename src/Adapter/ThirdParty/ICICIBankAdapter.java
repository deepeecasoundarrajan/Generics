package Adapter.ThirdParty;

public class ICICIBankAdapter implements BankingService{
    int accountNo;
    ICICIBankAPI iapi;

    public ICICIBankAdapter(int acctNo) {
        this.accountNo = acctNo;
        iapi = new ICICIBankAPI(accountNo);
    }

    public void connecttoDb() {
        iapi.getDBConnection();
    }

    public int balance() {
        return iapi.balanceForAccount();
    }
}
