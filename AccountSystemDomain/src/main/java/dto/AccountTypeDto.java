package dto;


import entities.AccountType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDate;

@ApiModel(value = "AccountType", description = "A DTO that represents the Account")
public class AccountTypeDto implements Serializable {
    private static final long serialVersionUID = -5346853203150289868L;
    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    public AccountTypeDto(){
    }


    public AccountTypeDto(String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountTypeDto(AccountType accountType) {
        this.setAccountTypeName(accountType.getAccountTypeName());
        this.setCreationDate(accountType.getCreationDate());
        this.setMnemonic(accountType.getMnemonic());
    }

    @ApiModelProperty(position = 1, value = "AccountType Mnemonic", name = "Mnemonic", notes = )
}
