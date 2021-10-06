package Database.queries;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import entities.Account;
import javax.transaction.Transactional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Account(AccountID, DiscoveryMiles) VALUES(?1, ?2)", nativeQuery = true)
    static Account insertAccount(Long miles)                        //id autogenerated, will it work? Add bridge table to link IDs of all tables
    {
        return null;
    }

    @Transactional
    @Query(value = "SELECT Miles FROM Account a WHERE a.AccountID = ?1", nativeQuery = true)
    long findMilesById(Long id);                             //? void findMilesById(Long id)

    @Modifying
    @Transactional
    @Query(value = "UPDATE Account SET DiscoveryMiles = (?2) WHERE AccountID = ?1", nativeQuery = true)
    Long updateMiles(Long id, Long miles);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Account WHERE AccountID = ?1", nativeQuery = true)
    void deleteAccount(Long id);





}
