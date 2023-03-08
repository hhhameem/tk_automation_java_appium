package Wallet_Test_Runners;

import org.testng.annotations.Test;
import Wallet_Screens.CreditCollectionTagada;
import setup.Setup;

public class CreditCollectionPayementlinkTest extends Setup {

    @Test(priority = 1)
    public void checking_tagada_message_sent_successfully() throws InterruptedException {
        CreditCollectionTagada collection = new CreditCollectionTagada(driver);
        String name1 = collection.credit_collection_through_msg(driver);
        System.out.println(name1);

    }
    @Test(priority = 2)
    public void checking_credit_collection_share_message(){
        CreditCollectionTagada collection = new CreditCollectionTagada(driver);
        String name2 = collection.share_credit_collection_message(driver);
        System.out.println(name2);

    }
}
