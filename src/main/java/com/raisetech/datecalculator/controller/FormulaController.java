package com.raisetech.datecalculator.controller;

import com.raisetech.datecalculator.domain.service.FormulaService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormulaController {

    private final FormulaService formulaService;

    public FormulaController(FormulaService formulaService) {
        this.formulaService = formulaService;
    }

    @GetMapping("/formulas")
    public String formulas(Model model) {
        model.addAttribute("formulaList", formulaService.formulaList().getFormulaList());
        return "formula";
    }

    @Transactional
    @PostMapping("/formula")
    public String register(@RequestParam("name") String name, @RequestParam("yearToAdd") int yearToAdd, @RequestParam("monthToAdd") int monthToAdd, @RequestParam("dayToAdd") int dayToAdd) {
        formulaService.register(name, yearToAdd, monthToAdd, dayToAdd);
        return "redirect:/formulas";
    }
}
