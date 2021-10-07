package za.ac.nwu.controller;


import Database.queries.AccountTxRepository;
import dto.AccountTxDto;
import entities.AccountTx;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.GeneralResponse;
import za.ac.nwu.logic.flow.AddMilesByMemberIdFlow;
import za.ac.nwu.logic.flow.SubtractMilesByMemberIdFlow;
import za.ac.nwu.logic.flow.ViewMilesByMemberIdFlow;

@RestController
@RequestMapping("account-tx")
public class AccountTxController {
    private final ViewMilesByMemberIdFlow viewMilesByMemberIdFlow;
    private final AddMilesByMemberIdFlow addMilesByMemberIdFlow;
    private final SubtractMilesByMemberIdFlow subtractMilesByMemberIdFlow;

    @Autowired
    public AccountTxController(ViewMilesByMemberIdFlow viewMilesByMemberIdFlow, AddMilesByMemberIdFlow addMilesByMemberIdFlow, SubtractMilesByMemberIdFlow subtractMilesByMemberIdFlow) {
        this.viewMilesByMemberIdFlow = viewMilesByMemberIdFlow;
        this.addMilesByMemberIdFlow = addMilesByMemberIdFlow;
        this.subtractMilesByMemberIdFlow = subtractMilesByMemberIdFlow;
    }

    @GetMapping("/view-miles")
    @ApiOperation(value = "Gets the miles of a MemberId", notes = "Returns the miles of a member")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Amount of miles returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<AccountTxDto>> viewMilesByMemberId(Long memderId) {
        AccountTxDto accountTxs = viewMilesByMemberIdFlow.getAmountByMemberId(Long memberId);
        GeneralResponse<AccountTxDto> response = new GeneralResponse(true, accountTxs);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


        @PutMapping("/account-tx-add/{memberId}")
        @ApiOperation(value = "Creates or Add a AccountTx record.", notes = "Creates or updates a AccountTx record in DB")
        @ApiResponses(value = {
                @ApiResponse(code = 201, message = "Amount of miles returned", response = GeneralResponse.class),
                @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
                @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)})
        public ResponseEntity<AccountTx> addMilesByMemberId(@PathVariable(value = "memberId") Long memberID,
                                                            @RequestBody AccountTx accountTxBody) throws ConfigDataResourceNotFoundException{
        AccountTx accountTx = AccountTxRepository.getMilesByMemberId(memberID)
                .orElseThrow(() -> new ResourceNotFoundException("Member not found for this id :: " + memberID));

        accountTx.setAmount(accountTxBody.getAmount());
        final AccountTx addMilesByMemberId = AccountTxRepository.save(accountTx);
        return ResponseEntity.ok(addMilesByMemberId);
        }
    @PutMapping("/account-tx-subtract/{memberId}")
    @ApiOperation(value = "Subtracts from a AccountTx record.", notes = "Subtracts miles from AccountTx record in DB")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Amount of miles returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)})
    public ResponseEntity<AccountTx> subMilesByMemberId(@PathVariable(value = "memberId") Long memberID,
                                                        @RequestBody AccountTx accountTxBody) throws ConfigDataResourceNotFoundException{
        AccountTx accountTx = AccountTxRepository.getMilesByMemberId(memberID)
                .orElseThrow(() -> new ResourceNotFoundException("Member not found for this id :: " + memberID));

        accountTx.setAmount(accountTxBody.getAmount());
        final AccountTx addMilesByMemberId = AccountTxRepository.save(accountTx);
        return ResponseEntity.ok(addMilesByMemberId);
    }
}
