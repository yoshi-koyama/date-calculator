package com.raisetech.datecalculator.domain.service;

import com.raisetech.datecalculator.domain.entity.DateCalculationFormula;
import com.raisetech.datecalculator.domain.repository.DateCalculationFormulaMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CalculationFormServiceImpl implements CalculationFormService {

    private final DateCalculationFormulaMapper mapper;

    public CalculationFormServiceImpl(DateCalculationFormulaMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public CalculationFormDto calculationForm() {
        return new CalculationFormDto(mapper.findAll());
    }

    @Override
    public CalculateResultDto calculate(int formulaId, LocalDate input) {
        DateCalculationFormula formula = mapper.find(formulaId).orElseThrow(RuntimeException::new);
        LocalDate result = input.plusYears(formula.getYearToAdd()).plusMonths(formula.getMonthToAdd()).plusDays(formula.getDayToAdd());
        return new CalculateResultDto(formula.getName(), input, result);
    }

}
