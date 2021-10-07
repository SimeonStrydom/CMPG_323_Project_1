package za.ac.nwu.translator;

import Database.queries.AccountTxRepository;
import entities.AccountTx;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountTxTranslatorImpl {

    private final AccountTxRepository accountTxRepository;

    @Autowired
    public AccountTxTranslatorImpl(AccountTxRepository accountTxRepository) {
        this.accountTxRepository = accountTxRepository;
    }

    public AccountTx viewMilesByMemberId(Long memberId) {
        try {
            AccountTx accountTx = AccountTxRepository.getMilesByMemberId(memberId);
        }
        catch (Exception e) {
            throw new RuntimeException("Unable to run from DB", e);
        }
        return AccountTxRepository.getMilesByMemberId(memberId);
    }

}
