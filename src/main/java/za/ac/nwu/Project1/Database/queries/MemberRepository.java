package za.ac.nwu.Project1.Database.queries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.ac.nwu.Project1.Database.entities.Member;

import javax.transaction.Transactional;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Member(FirstName, LastName, ContactNumber, Email, AccountID, AddressID, IsActive) VALUES(?, ?, ?, ?, ?, ?, ?)")
    void addMember(String firstName, String lastName, Long contactNumber, String email, Long FKAccountID, Long FKAddressID, Boolean isActive);


    @Transactional
    @Query(value = "SELECT * FROM Member WHERE MemberID = ?1")
    void findMemberByID(Long id);

    @Transactional
    @Query(value = "SELECT * FROM Member WHERE IsActive = true")
    void isActiveMember();

    @Transactional
    @Query(value = "SELECT * FROM Member WHERE IsActive = false")
    void isInactiveMember();

    // add more select statements?

    @Modifying
    @Transactional
    @Query(value = "UPDATE Member SET FirstName = ?2 WHERE MemberID = ?1 ")
    void updateMemberFirstName(Long memberID, String newFirstName);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Member SET LastName = ?2 WHERE MemberID = ?1 ")
    void updateMemberLastName(Long memberID, String newLastName);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Member SET ContactNumber = ?2 WHERE MemberID = ?1 ")
    void updateMemberContactNumber(Long memberID, Long newContactNumber);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Member SET Email = ?2 WHERE MemberID = ?1 ")
    void updateMemberEmail(Long memberID, String newEmail);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Member SET IsActive = ?2 WHERE MemberID = ?1 ")
    void updateMemberIsActive(Long memberID, Boolean isActive);

    //Must there be a delete?
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Member WHERE MemberID = ?1")
    void deleteMember(Long memberID);

}