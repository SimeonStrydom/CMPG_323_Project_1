package za.ac.nwu.Project1.Database.entities;

import javax.persistence.*;

@Table(name = "account")
@Entity
public class Account {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "Account_ID", nullable = false)
   private Long accountID;

   @Column(name = "Discovery_Miles", nullable = false)
   private Long miles;

   public Long getAccountID() { return accountID; }
   public void setAccountID(Long accountID) { this.accountID = accountID; }

   public Long getMiles() { return miles; }
   public void setMiles(Long miles) { this.miles = miles; }
}
