package Adapter.ThirdParty;

public class yesBankAdapter implements BankingService{
    int accountNo;
    YesBankAPI yapi;

    public yesBankAdapter(int acctNo) {
      this.accountNo = acctNo;
      yapi = new YesBankAPI(accountNo);
    }

    public void connecttoDb() {
        yapi.connectToDB();
    }

    public int balance() {
        return yapi.checkBalance();
    }
}
