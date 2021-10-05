package Project1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    Application appTest;

    @BeforeEach
    void setUp() {
        appTest = new Application();
    }

    @AfterEach
    void tearDown() {
        appTest = null;
    }

    @Test
    void addAccount() {
        assertNotNull(appTest, "Test failed. No new account created.");
    }

    @Test
    void viewMiles() {

    }

    @Test
    void addMiles() {
    }

    @Test
    void subtractMiles() {
    }
}