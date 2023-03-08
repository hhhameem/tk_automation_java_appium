package Wallet_Test_Runners;

import org.testng.annotations.Test;
import Wallet_Screens.MoneyOut;
import setup.Setup;

public class MoneyOutTest extends Setup {

    @Test(priority = 1)
    public void checking_money_out_to_bank_account() throws InterruptedException {
        MoneyOut moneyOut = new MoneyOut(driver);
        String name = moneyOut.money_out_from_bank(driver);


    }
    @Test(priority = 2)
    public void checking_money_out_to_nagad() throws InterruptedException {
        MoneyOut moneyOut = new MoneyOut(driver);
        String name1 = moneyOut.money_out_to_nagad(driver);
        System.out.println(name1);



    }

}
