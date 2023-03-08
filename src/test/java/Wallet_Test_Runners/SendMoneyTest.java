package Wallet_Test_Runners;

import setup.Setup;
import org.testng.annotations.Test;
import Wallet_Screens.SendMoney;

public class SendMoneyTest extends Setup {

    @Test(priority = 1)
    public void send_money_to_tp_checking() throws InterruptedException {
        SendMoney send_money = new SendMoney(driver);
        String name4 = send_money.send_money_to_tp(driver);
        System.out.println(name4);

    }
//    @Test(priority = 2)
//    public void send_money_from_recent_tran_checking(){
//        SendMoney sendmoney = new SendMoney(driver);
//        String name6 = sendmoney.send_money_from_recent_trans(driver);
//        System.out.println(name6);
//
//
//    }

    //send money by selectiong number from pb
//    @Test(priority = 3)
//    public void send_money_from_selected_number_from_pb_checking(){
//        SendMoney sendmoney = new SendMoney(driver);
//        String name7 = sendmoney.send_money_from_selected_number_from_pb(driver);
//        System.out.println(name7);
//
//
//
//    }


}
