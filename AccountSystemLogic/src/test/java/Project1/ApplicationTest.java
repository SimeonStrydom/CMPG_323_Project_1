package Project1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Should not be null")
    void addAccount() {
        assertNotNull(appTest, "Test failed. No new account created.");
    }

    @Test
    @DisplayName("Should display miles of the given id")
    void viewMiles() {
        assertEquals(100,appTest.viewMiles(1L), "id = 1 does not have 100 miles");
    }

    @Test
    @DisplayName("Should show the new total after adding new miles")
    void addMiles() {
        assertEquals(120, appTest.addMiles(1L, 20L), "Did not add 20 miles to id 1");
    }

    @Test
    @DisplayName("Should show the new total after subtracting new miles")
    void subtractMiles() {
        assertEquals(50, appTest.subtractMiles(1L, 50L));
    }
}