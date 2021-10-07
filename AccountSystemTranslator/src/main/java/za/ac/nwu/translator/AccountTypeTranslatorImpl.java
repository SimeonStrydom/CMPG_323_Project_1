package za.ac.nwu.translator;

import Database.queries.AccountTypeRepository;
import dto.AccountTypeDto;
import entities.AccountType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AccountTypeTranslatorImpl {

    private final AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeTranslatorImpl(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes() {
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        try {
            for (AccountType accountType : AccountTypeRepository.findAll()) {
                accountTypeDtos.add(new AccountTypeDto(accountType));
            }
        }
        catch (Exception e) {
            throw new RuntimeException("Unable to run from DB", e);
        }
        return accountTypeDtos;
    }

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
            AccountType accountType = accountTypeRepository.getAccountTypeByMnemonic(mnemonic);
            return new AccountTypeDto(accountType);
        } catch (Exception e) {
            throw new RuntimeException("Unable to read from DB", e);
        }
    }

}


