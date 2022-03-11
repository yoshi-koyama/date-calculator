package com.raisetech.datecalculator.domain.service;

import java.time.LocalDate;

public interface CalculationFormService {

    CalculationFormDto calculationForm();

    CalculateResultDto calculate(int formulaId, LocalDate input);
}
