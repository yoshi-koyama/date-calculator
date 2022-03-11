package com.raisetech.datecalculator.domain.entity;

import java.util.Objects;

public class DateCalculationFormula {
    private int id;
    private String name;
    private int yearToAdd;
    private int monthToAdd;
    private int dayToAdd;

    public DateCalculationFormula(int id, String name, int yearToAdd, int monthToAdd, int dayToAdd) {
        this.id = id;
        this.name = name;
        this.yearToAdd = yearToAdd;
        this.monthToAdd = monthToAdd;
        this.dayToAdd = dayToAdd;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearToAdd() {
        return yearToAdd;
    }

    public int getMonthToAdd() {
        return monthToAdd;
    }

    public int getDayToAdd() {
        return dayToAdd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateCalculationFormula that = (DateCalculationFormula) o;
        return id == that.id && yearToAdd == that.yearToAdd && monthToAdd == that.monthToAdd && dayToAdd == that.dayToAdd && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, yearToAdd, monthToAdd, dayToAdd);
    }
}
