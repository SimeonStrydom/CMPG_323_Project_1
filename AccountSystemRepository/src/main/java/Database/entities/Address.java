package Database.entities;


import javax.persistence.*;

@Table(name = "address")
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Address_ID", nullable = false)
    private Long addressID;

    @Column(name = "CityTown")
    private String cityORTown;

    @Column(name = "Suburb")
    private String suburb;

    @Column(name = "Street_Name")
    private String streetName;

    @Column(name = "street_number")
    private Long streetNumber;

    public Address(String cityORTown, String suburb, String streetName, Long streetNumber) {
        this.cityORTown = cityORTown;
        this.suburb = suburb;
        this.streetName = streetName;
        this.streetNumber =streetNumber;
    }

    public Address() {
    }

    public Long getAddressID() { return addressID; }
    public void setAddressID(Long addressID) { this.addressID = addressID; }

    public String getCityORTown() { return cityORTown; }
    public void setCityORTown(String cityORTown) { this.cityORTown = cityORTown; }

    public String getSuburb() { return suburb; }
    public void setSuburb(String suburb) { this.suburb = suburb; }

    public String getStreetName() { return streetName; }
    public void setStreetName(String streetName) { this.streetName = streetName; }

    public Long getStreetNumber() { return streetNumber;    }
    public void setStreetNumber(Long streetNumber) { this.streetNumber = streetNumber;    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "addressID = " + addressID + ", " +
                "cityORTown = " + cityORTown + ", " +
                "suburb = " + suburb + ", " +
                "streetName = " + streetName + ", " +
                "streetNumber = " + streetNumber + ")";
    }
}
