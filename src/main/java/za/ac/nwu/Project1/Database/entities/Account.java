package za.ac.nwu.Project1.Database.entities;

import javax.persistence.*;

@Entity
public class Account {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "Account_ID", nullable = false)
   private Long accountID;

   @Column(name = "Discovery_Miles", nullable = false)
   private Long miles;
}
