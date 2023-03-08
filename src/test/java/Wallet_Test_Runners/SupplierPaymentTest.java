package Wallet_Test_Runners;

import org.testng.annotations.Test;
import Wallet_Screens.SupplierPayment;
import setup.Setup;

public class SupplierPaymentTest extends Setup {

    @Test
    public void check_supplier_payment_through_selecting_supplier() throws InterruptedException {
        SupplierPayment supplier = new SupplierPayment(driver);
        String name = supplier.supplier_payment_by_selecting_supplier(driver);
        System.out.println(name);

    }


}
