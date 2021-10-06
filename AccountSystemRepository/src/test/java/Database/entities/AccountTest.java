package Database.entities;

import entities.Account;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account testClass;

    @BeforeEach
    void setUp() {
        testClass = new Account();
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void getAccountID() {
        assertEquals(1L, 1L);
    }

    @Test
    void setAccountID() {
    }

    @Test
    void getMiles() {
        assertEquals(100L, 100L);
    }

    @Test
    void setMiles() {
    }


}