package com.raisetech.datecalculator.domain.service;

public interface FormulaService {

    FormulaDto formulaList();

    void register(String name, int yearToAdd, int monthToAdd, int dayToAdd);
}
