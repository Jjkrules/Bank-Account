package combank;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(1000);
        account.deposit(200);

        assertEquals(1200, account.getBalance());
    }
}