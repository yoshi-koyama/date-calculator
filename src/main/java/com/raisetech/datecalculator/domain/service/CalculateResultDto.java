package com.raisetech.datecalculator.domain.service;

import java.time.LocalDate;

public class CalculateResultDto {

    private String name;

    private LocalDate input;

    private LocalDate result;

    public CalculateResultDto(String name, LocalDate input, LocalDate result) {
        this.name = name;
        this.input = input;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public LocalDate getInput() {
        return input;
    }

    public LocalDate getResult() {
        return result;
    }
}
