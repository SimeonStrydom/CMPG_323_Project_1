package Database.queries;

import entities.AccountTx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountTxRepository extends JpaRepository<AccountTx, Long> {

    @Query(value = "SELECT at FROM AccountTx at WHERE at.memberId = :memberId")
    static AccountTx getMilesByMemberId(Long id);

}
