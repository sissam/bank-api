package com.bank.account.bank.rest;

import com.bank.account.bank.config.EndPoints;
import com.bank.account.bank.dto.OperationDTO;
import com.bank.account.bank.service.OperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("api/bank")
public class OperationController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    OperationService operationService;
    /*
    @RequestMapping(LIST_OPERATIONS)
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseBody generateHistory(@RequestParam String clientId, @RequestParam Long accountId){
        log.info("start api operations");
        List<OperationDTO> operations = operationService.getAllOperations(accountId);
        return null;
    }
    */
    @RequestMapping(value = EndPoints.WITHDRAW+"/{accountId}", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Collection<OperationDTO>> getOperations(@PathVariable("accountId") Long accountId){
        log.info("start api operations");
        List<OperationDTO> operations = operationService.getAllOperations(accountId);
        return new ResponseEntity<Collection<OperationDTO>>(operations, HttpStatus.OK);
    }
}
