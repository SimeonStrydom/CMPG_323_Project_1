package za.ac.nwu.Project1.Database.entities;


import javax.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Member_ID", nullable = false)
    private Long memberID;

    @Column(name = "FirstName", nullable = false)
    private Long firstName;

    @Column(name = "Last_Name", nullable = false)
    private Long lastName;

    @Column(name = "Contact_Number", nullable = false)
    private Long contactNumber;

    @Column(name = "Email", nullable = false)
    private Long email;

    @Column(name = "Account_ID", nullable = false)
    private Long FKAccountID;

    @Column(name = "Address_ID", nullable = false)
    private Long FKAddressID;
}
