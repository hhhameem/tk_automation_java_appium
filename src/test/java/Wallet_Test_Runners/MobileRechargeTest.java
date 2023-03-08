package Wallet_Test_Runners;

import org.testng.annotations.Test;
import Wallet_Screens.MobileRecharge;
import setup.Setup;

public class MobileRechargeTest extends Setup {

    @Test
    public void checking_mobile_recharge_by_giving_mobile_number() throws InterruptedException {
        MobileRecharge recharge = new MobileRecharge(driver);
        String name1 = recharge.mobile_recharge_by_giving_mobile_number(driver);
        System.out.println(name1);



    }
}
