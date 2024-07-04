package br.com.vinisantosdev.bankInvestiment.BankInvestiment.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "User")
public interface CalculateControllerOpenApi {

    @Operation(summary = "Get total value")
    String calculateCompoundInterest();
}
