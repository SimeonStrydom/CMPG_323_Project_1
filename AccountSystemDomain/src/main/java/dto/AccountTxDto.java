package dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@ApiModel(value = "AccountTx", description = "aDTO that represents the transaction")
public class AccountTxDto implements Serializable {

    private Long accountTypeId;
    private Long memberId;
    private Long amount;
    private LocalDate transactionDate;

    public AccountTxDto() {
    }

    public AccountTxDto(Long accountTypeId, Long memberId, Long amount, LocalDate transactionDate) {
        this.accountTypeId = accountTypeId;
        this.memberId = memberId;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public AccountTxDto(AccountTxDto accountTx) {
        this.setAccountTypeId(accountTx.getAccountTypeId());
        this.setMemberId(accountTx.getMemberId());
        this.setAmount(accountTx.getAmount());
        this.setTransactionDate(accountTx.getTransactionDate());
    }

    @ApiModelProperty(position = 1,
            value = "AccountTx AccountTypeId",
            name = "AccountTypeId",
            notes = "Uniquely identify the account type",
            dataType = "java.lang.String",
            example = "1",
            required = true)
    public Long getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    @ApiModelProperty(position = 2,
            value = "AccountTx MemberId",
            name = "MemberId",
            notes = "Uniquely identify the member",
            dataType = "java.lang.String",
            example = "1",
            required = true)
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @ApiModelProperty(position = 3,
            value = "AccountTx Amount",
            name = "MemberId",
            notes = "Specifies the amount of a currency",
            dataType = "java.lang.String",
            example = "100",
            required = true)
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @ApiModelProperty(position = 4,
            value = "AccountTx TxDate",
            name = "TxDate",
            notes = "Specifies the date of a transaction",
            dataType = "java.lang.String",
            example = "2020-01-01",
            required = true)
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTxDto that = (AccountTxDto) o;
        return Objects.equals(accountTypeId, that.accountTypeId) && Objects.equals(memberId, that.memberId) && Objects.equals(amount, that.amount) && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountTypeId, memberId, amount, transactionDate);
    }

    @Override
    public String toString() {
        return "AccountTxDto{" +
                "accountTypeId=" + accountTypeId +
                ", memberId=" + memberId +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
