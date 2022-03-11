package com.raisetech.datecalculator.domain.service;

import com.raisetech.datecalculator.domain.entity.DateCalculationFormula;

import java.util.List;

public class FormulaDto {

    private List<DateCalculationFormula> formulaList;

    public FormulaDto(List<DateCalculationFormula> formulaList) {
        this.formulaList = formulaList;
    }

    public List<DateCalculationFormula> getFormulaList() {
        return formulaList;
    }
}
