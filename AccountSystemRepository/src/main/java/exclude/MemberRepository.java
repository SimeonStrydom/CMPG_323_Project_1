package exclude;

import Database.entities.exclude.Member;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Member(FirstName, LastName, ContactNumber, Email, AccountID, AddressID, IsActive) VALUES(?, ?, ?, ?, ?, ?, ?)", nativeQuery = true)
    void addMember(String firstName, String lastName, Long contactNumber, String email, Long FKAccountID, Long FKAddressID, Boolean isActive);


    @Transactional
    @Query(value = "SELECT * FROM Member WHERE MemberID = ?1", nativeQuery = true)
    void findMemberByID(Long id);

    @Transactional
    @Query(value = "SELECT * FROM Member WHERE IsActive = true", nativeQuery = true)
    void isActiveMember();

    @Transactional
    @Query(value = "SELECT * FROM Member WHERE IsActive = false", nativeQuery = true)
    void isInactiveMember();

    // add more select statements?

    @Modifying
    @Transactional
    @Query(value = "UPDATE Member SET FirstName = ?2 WHERE MemberID = ?1 ", nativeQuery = true)
    void updateMemberFirstName(Long memberID, String newFirstName);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Member SET LastName = ?2 WHERE MemberID = ?1 ", nativeQuery = true)
    void updateMemberLastName(Long memberID, String newLastName);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Member SET ContactNumber = ?2 WHERE MemberID = ?1 ", nativeQuery = true)
    void updateMemberContactNumber(Long memberID, Long newContactNumber);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Member SET Email = ?2 WHERE MemberID = ?1 ", nativeQuery = true)
    void updateMemberEmail(Long memberID, String newEmail);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Member SET IsActive = ?2 WHERE MemberID = ?1 ", nativeQuery = true)
    void updateMemberIsActive(Long memberID, Boolean isActive);

    //Must there be a delete?
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Member WHERE MemberID = ?1", nativeQuery = true)
    void deleteMember(Long memberID);

}