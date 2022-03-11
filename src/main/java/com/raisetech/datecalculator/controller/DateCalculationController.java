package com.raisetech.datecalculator.controller;

import com.raisetech.datecalculator.domain.service.CalculateResultDto;
import com.raisetech.datecalculator.domain.service.CalculationFormService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.Objects;

@Controller
public class DateCalculationController {

    private final CalculationFormService service;

    public DateCalculationController(CalculationFormService service) {
        this.service = service;
    }

    @GetMapping("/calculation-form")
    public String calculationForm(Model model, @ModelAttribute("result") CalculateResultDto result) {
        model.addAttribute("formulaIds", service.calculationForm().getFormulaId());
        if (Objects.nonNull(result.getName())) {
            model.addAttribute("result", result);
        }
        return "calculation-form";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date, @RequestParam("formulaId") int formulaId, RedirectAttributes redirectAttributes) {
        CalculateResultDto resultDto = service.calculate(formulaId, date);
        redirectAttributes.addFlashAttribute("result", resultDto);
        return "redirect:/calculation-form";
    }
}
