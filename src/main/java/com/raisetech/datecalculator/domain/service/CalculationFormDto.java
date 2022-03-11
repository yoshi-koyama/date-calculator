package com.raisetech.datecalculator.domain.service;

import com.raisetech.datecalculator.domain.entity.DateCalculationFormula;

import java.util.List;

public class CalculationFormDto {

    private List<DateCalculationFormula> formulaId;

    public CalculationFormDto(List<DateCalculationFormula> formulaId) {
        this.formulaId = formulaId;
    }

    public List<DateCalculationFormula> getFormulaId() {
        return formulaId;
    }
}
