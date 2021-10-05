package Database.entities;

import javax.persistence.*;

@Table(name = "Account")
@Entity
public class Account {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "AccountID", nullable = false)
   private Long accountID;

   @Column(name = "DiscoveryMiles", nullable = false)
   private Long miles;

   public Account(Long accountID, Long miles){
      this.accountID = accountID;
      this.miles = miles;
   }

   public Account(){
   }

   public Long getAccountID() { return accountID; }
   public void setAccountID(Long accountID) { this.accountID = accountID; }

   public Long getMiles() { return miles; }
   public void setMiles(Long miles) { this.miles = miles; }

   @Override
   public String toString() {
      return getClass().getSimpleName() + "(" +
              "AccountID = " + accountID + ", " +
              "miles = " + miles + ")";
   }
}
