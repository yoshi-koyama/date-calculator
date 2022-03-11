package com.raisetech.datecalculator.domain.service;

import com.raisetech.datecalculator.domain.repository.DateCalculationFormulaMapper;
import org.springframework.stereotype.Service;

@Service
public class FormulaServiceImpl implements FormulaService {

    private DateCalculationFormulaMapper mapper;

    public FormulaServiceImpl(DateCalculationFormulaMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public FormulaDto formulaList() {
        return new FormulaDto(mapper.findAll());
    }

    @Override
    public void register(String name, int yearToAdd, int monthToAdd, int dayToAdd) {
        mapper.save(name, yearToAdd, monthToAdd, dayToAdd);
    }
}
