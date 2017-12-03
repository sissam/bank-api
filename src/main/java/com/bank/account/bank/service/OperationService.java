package com.bank.account.bank.service;

import com.bank.account.bank.dto.OperationDTO;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface OperationService {
    List<OperationDTO> getAllOperations(@NotNull Long accountId);
}
