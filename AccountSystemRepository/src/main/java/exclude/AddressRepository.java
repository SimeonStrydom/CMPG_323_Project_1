package exclude;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Database.entities.exclude.Address;

import javax.transaction.Transactional;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Address(CityTown, Suburb, StreetName, StreetNumber) VALUES(?1, ?2, ?3, ?4)", nativeQuery = true)
    void addAddress(String cityTown, String suburb, String streetName, Long streetNumber);

    @Transactional
    @Query(value = "SELECT * FROM Address WHERE AddressID = ?1", nativeQuery = true)
    void findAddressByID(Long addressID);
    // Is more SELECT's necessary?

    @Modifying
    @Transactional
    @Query(value = "UPDATE Address SET CityTown = ?2 WHERE AddressID = ?1", nativeQuery = true)
    void updateCityTown(Long addressID, String newCityName);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Address SET Suburb = ?2 WHERE AddressID = ?1", nativeQuery = true)
    void updateSuburb(Long addressID, String newSuburb);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Address SET StreetName = ?2 WHERE AddressID = ?1", nativeQuery = true)
    void updateStreetName(Long addressID, String newStreetName);

    @Modifying
    @Transactional
    @Query(value = "UPDATE Address SET StreetNumber = ?2 WHERE AddressID = ?1", nativeQuery = true)
    void updateStreetNumber(Long addressID, String newStreetNumber);

}