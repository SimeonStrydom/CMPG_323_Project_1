package za.ac.nwu.translator;

import dto.AccountTxDto;
import entities.AccountTx;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public interface AccountTxTranslator {
    List<AccountTxDto> viewMilesByMemberId();

    AccountTxDto addMilesByMemberId(Long memberId, Long amount);

    AccountTxDto subMilesByMemberId(Long memberId, Long amount);


}
