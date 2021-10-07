package Database.queries;

import entities.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {

//    @Query(value = "SELECT ACCOUNT_TYPE_ID, ACCOUNT_TYPE_NAME, CREATION_DATE, MNEMONIC FROM 323Project1.ACCOUNT_TYPE WHERE MNEMONIC = :MNEMONIC", nativeQuery = true)
//    AccountType getAccountTypeByMnemonicNativeQuery(String mnemonic);

    @Query(value = "SELECT at FROM AccountType at WHERE at.mnemonic = :mnemonic ")
    AccountType getAccountTypeByMnemonic(String mnemonic);

}