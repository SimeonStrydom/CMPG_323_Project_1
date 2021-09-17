package za.ac.nwu.Project1.Database.entities;


import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Address_ID", nullable = false)
    private Long addressID;

    @Column(name = "City_Town")
    private String cityORTown;

    @Column(name = "Suburb")
    private String suburb;

    @Column(name = "Street_Name")
    private String streetName;

    @Column(name = "street_number")
    private String streetNumber;


    public Long getAddressID() { return addressID; }
    public void setAddressID(Long addressID) { this.addressID = addressID; }

    public String getCityORTown() { return cityORTown; }
    public void setCityORTown(String cityORTown) { this.cityORTown = cityORTown; }

    public String getSuburb() { return suburb; }
    public void setSuburb(String suburb) { this.suburb = suburb; }

    public String getStreetName() { return streetName; }
    public void setStreetName(String streetName) { this.streetName = streetName; }

    public String getStreetNumber() { return streetNumber;    }
    public void setStreetNumber(String streetNumber) { this.streetNumber = streetNumber;    }
}
