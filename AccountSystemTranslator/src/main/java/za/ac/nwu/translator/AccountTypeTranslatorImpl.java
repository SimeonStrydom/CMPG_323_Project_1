package za.ac.nwu.translator;

import dto.AccountTypeDto;
import entities.AccountType;

public class AccountTypeTranslatorImpl {





    @Override
    public AccountTypeDto create(AccountTypeDto accountTypeDto) {
        try {
            AccountType accountType = accountTypeRepository.save(accountTypeDto.getAccountType());
            return new AccountTypeDto(accountType);
        } catch (Exception e) {
            throw new RuntimeException("Unable to save to the DB", e);
        }
    }


//    @Override
//    public AccountTypeDto getAccountTypeByMnemonicNativeQuery(String mnemonic) {            //Try not to do this
//        try {
//            AccountType accountType = accountTypeRepository.getAccountTypeByMnemonicNativeQuery(mnemonic);
//            return new AccountTypeDto(accountType);
//        } catch (Exception e) {
//            throw new RuntimeException("Unable to read from DB", e);
//        }
//    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic) {
        try {
            AccountType accountType = accountTypeRepository.getAccountTypeByMnemonicNativeQuery(mnemonic);
            return new AccountTypeDto(accountType);
        } catch (Exception e) {
            throw new RuntimeException("Unable to read from DB", e);
        }
    }

}


