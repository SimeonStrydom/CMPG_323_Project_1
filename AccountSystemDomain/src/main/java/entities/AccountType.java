package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Table(name = "account_type")
@Entity
public class AccountType implements Serializable {

    private Set<AccountTx> accountTransactions;

    @Id
    @SequenceGenerator(name = "GENERIC_SEQ", sequenceName = "323PROJECT1.GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENERIC_SEQ")
    @Column(name = "ACCOUNT_TYPE_ID", nullable = false)
    private Long id;

    @Column(name = "MNEMONIC", nullable = false, length = 50)
    private String mnemonic;

    @Column(name = "ACCOUNT_TYPE_NAME", nullable = false, length = 50)
    private String accountTypeName;

    @Column(name = "CREATION_DATE", nullable = false)
    private LocalDate creationDate;

    @OneToMany(targetEntity = AccountTx.class, fetch = FetchType.LAZY, mappedBy = "accountType", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<AccountTx> getAccountTransactions() {
        return accountTransactions;
    }

    public void setAccountTransactions(Set<AccountTx> accountTransactions) {
        this.accountTransactions = accountTransactions;
    }

    public AccountType(Long id, String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.id = id;
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountType(String mnemonic, String accountTypeName, LocalDate creationDate) {
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(id, that.id) && Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mnemonic, accountTypeName, creationDate);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "id=" + id +
                ", mnemonic='" + mnemonic + '\'' +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}