package za.ac.nwu.Project1.Database.entities;


import javax.persistence.*;

@Table(name = "member")
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Member_ID", nullable = false)
    private Long memberID;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "Last_Name", nullable = false)
    private String lastName;

    @Column(name = "Contact_Number", nullable = false)
    private Long contactNumber;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Account_ID", nullable = false)
    private Long FKAccountID;

    @Column(name = "Address_ID", nullable = false)
    private Long FKAddressID;

    @Column(name = "is_active")
    private Boolean isActive;


    public Long getMemberID() { return memberID;}
    public void setMemberID(Long memberID) { this.memberID = memberID; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Long getContactNumber() { return contactNumber; }
    public void setContactNumber(Long contactNumber) { this.contactNumber = contactNumber; }

    public String getEmail() { return email; }
    public void  setEmail(String email) { this.email = email; }

    public Long getFKAccountID() { return FKAccountID; }
    public void setFKAccountID(Long FKAccountID) { this.FKAccountID = FKAccountID; }

    public Long getFKAddressID() { return FKAddressID; }
    public void setFKAddressID(Long FKAddressID) { this.FKAddressID = FKAddressID; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "memberID = " + memberID + ", " +
                "firstName = " + firstName + ", " +
                "lastName = " + lastName + ", " +
                "contactNumber = " + contactNumber + ", " +
                "email = " + email + ", " +
                "FKAccountID = " + FKAccountID + ", " +
                "FKAddressID = " + FKAddressID + ", " +
                "isActive" + isActive + ")";
    }
}