package za.ac.nwu.Project1.Database.entities;


import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Address_ID", nullable = false)
    private Long sddressID;

    @Column(name = "City", nullable = true)
    private String cityORtown;

    @Column(name = "Suburb", nullable = true)
    private String suburb;

    @Column(name = "Street_Name",nullable = true)
    private String streetName;

    @Column(name = "Street_Number", nullable = true)
    private Long streetNumber;
}
