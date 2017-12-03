package com.bank.account.bank.service;

import com.bank.account.bank.dao.OperationRepository;
import com.bank.account.bank.dto.OperationDTO;
import com.bank.account.bank.model.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    OperationRepository operationRepository;

    @Override
    public List<OperationDTO> getAllOperations(Long accountId) {
        List<OperationDTO> operationDTOList = new ArrayList<>();
        List<Operation> operationList = operationRepository.findAll();
        return operationList.stream().map(Operation::buildOperationDTO).collect(Collectors.toList());
    }
}
