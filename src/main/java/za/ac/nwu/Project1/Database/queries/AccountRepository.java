package za.ac.nwu.Project1.Database.queries;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.Project1.Database.entities.Account;

import javax.transaction.Transactional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    @Modifying
    @Transactional
//@Query(value = "INSERT INTO Account(Discovery_Miles) VALUES(?)", nativeQuery = true)
//    void insertMiles();


    @Query(value = "INSERT INTO Account(Discovery_Miles) VALUES(?)", nativeQuery = true)
    void insertMiles();

}
