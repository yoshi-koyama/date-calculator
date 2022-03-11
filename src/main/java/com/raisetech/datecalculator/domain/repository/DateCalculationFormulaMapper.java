package com.raisetech.datecalculator.domain.repository;

import com.raisetech.datecalculator.domain.entity.DateCalculationFormula;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface DateCalculationFormulaMapper {

    @Select("SELECT * FROM date_calculation_formulas")
    List<DateCalculationFormula> findAll();

    @Select("SELECT * FROM date_calculation_formulas WHERE id = #{id}")
    Optional<DateCalculationFormula> find(int id);

    @Insert("INSERT INTO date_calculation_formulas (name, year_to_add, month_to_add, day_to_add) VALUES (#{name}, #{yearToAdd}, #{monthToAdd}, #{dayToAdd})")
    void save(String name, int yearToAdd, int monthToAdd, int dayToAdd);

    @Update("UPDATE date_calculation_formulas SET name = #{name}, year_to_add = #{yearToAdd}, month_to_add = #{monthToAdd}, day_to_add = #{dayToAdd} WHERE id = #{id}")
    void update(int id, String name, int yearToAdd, int monthToAdd, int dayToAdd);

    @Delete("DELETE FROM date_calculation_formulas WHERE id = #{id}")
    void delete(int id);
}
