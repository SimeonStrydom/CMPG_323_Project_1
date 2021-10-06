package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Table(name = "account_tx")
@Entity
public class AccountTx implements Serializable {


    @Id
    @SequenceGenerator(name = "GENERIC_SEQ", sequenceName = "323PROJECT1.GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENERIC_SEQ")
    @Column(name = "ACCOUNT_TX_ID", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ACCOUNT_TYPE_ID", nullable = false)
    private AccountType accountType;

    @Column(name = "MEMBER_ID", nullable = false)
    private Integer memberId;

    @Column(name = "AMOUNT", nullable = false)
    private Integer amount;

    @Column(name = "TX_DATE", nullable = false)
    private LocalDate txDate;

    public AccountTx(Integer id, AccountType accountType, Integer memberId, Integer amount, LocalDate txDate) {
        this.id = id;
        this.accountType = accountType;
        this.memberId = memberId;
        this.amount = amount;
        this.txDate = txDate;
    }

    public AccountTx() {
    }

    public LocalDate getTxDate() {
        return txDate;
    }

    public void setTxDate(LocalDate txDate) {
        this.txDate = txDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTx accountTx = (AccountTx) o;
        return Objects.equals(id, accountTx.id) && Objects.equals(accountType, accountTx.accountType) && Objects.equals(memberId, accountTx.memberId) && Objects.equals(amount, accountTx.amount) && Objects.equals(txDate, accountTx.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountType, memberId, amount, txDate);
    }

    @Override
    public String toString() {
        return "AccountTx{" +
                "id=" + id +
                ", accountType=" + accountType +
                ", memberId=" + memberId +
                ", amount=" + amount +
                ", txDate=" + txDate +
                '}';
    }
}