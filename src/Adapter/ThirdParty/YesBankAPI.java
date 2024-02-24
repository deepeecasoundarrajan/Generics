package Adapter.ThirdParty;

public class YesBankAPI {
    int accountNo;

    public YesBankAPI(int acctNo) {
        this.accountNo = acctNo;
    }

    public void connectToDB() {
        System.out.println("Connecting to YesBank db ");
    }

    public int checkBalance() {
        System.out.println("Checking balance for acctNo " + accountNo);
        return 100;
    }
}
