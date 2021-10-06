package za.ac.nwu.logic.flow.Impl;


import dto.AccountTypeDto;
import org.springframework.stereotype.Component;
import za.ac.nwu.logic.flow.CreateAccountTypeFlow;

import javax.transaction.Transactional;

@Transactional
@Component("createAccountTypeFlowName")

public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {

    private final AccountTypeTranslator accountTypeTranslator;

    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountType) {
        if (null == accountType.getCreationDate()) {
            accountType.setCreationDate.create(accountType);
        }
        return accountTypeTranslator.create(accountType);
    }
}
