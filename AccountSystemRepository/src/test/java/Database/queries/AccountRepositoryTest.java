package Database.queries;

import entities.exclude.Account;
import Database.entities.RepositoryTestConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = {RepositoryTestConfig.class})
class AccountRepositoryTest {

    @Autowired
    AccountRepository repoTest;

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void insertAccount() {
        Account repoTest = AccountRepository.insertAccount(100L);
        assertNotNull(repoTest);
        assertEquals(100, 100);                 // not necessary?
    }

    @Test
    void findMilesById() {
        //Account repoTest = AccountRepository.findMilesById(1L);
        assertNotNull(repoTest);
        assertEquals(100, repoTest.findMilesById(1L));
    }

    @Test
    void updateMiles() {
        //Account repoTest = AccountRepository.updateMiles(50L);                //?????????
        assertNotNull(repoTest);
        assertEquals(100, repoTest.updateMiles(1L,50L));
    }
}