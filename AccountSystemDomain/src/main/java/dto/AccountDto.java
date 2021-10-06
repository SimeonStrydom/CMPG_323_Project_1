package dto;


import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel(value = "Account", description = "A DTO that represents the Account")
public class AccountDto implements Serializable {
    private static final long serialVersionUID = -5346853203150289868L;
    private Long id;
    private Long miles;

    public AccountDto(){
    }

    public AccountDto(Long id, Long miles) {
        this.id = id;
        this.miles = miles;
    }

//    public AccountDto(Account account) {
//
//    }

}
