package br.com.vinisantosdev.bankInvestiment.BankInvestiment.controller;

import br.com.vinisantosdev.bankInvestiment.BankInvestiment.model.Calculate;
import br.com.vinisantosdev.bankInvestiment.BankInvestiment.dto.CalculateResponseDTO;
import br.com.vinisantosdev.bankInvestiment.BankInvestiment.service.CalculateService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/calculate")
public class CalculateController {

    @Autowired
    private CalculateService service;

    @ApiResponses(value = @ApiResponse(responseCode = "201", description = "Calculo feito com sucesso"))
    @PostMapping
    public ResponseEntity<CalculateResponseDTO> calculateCompoundInterest(@RequestBody Calculate body) {
       CalculateResponseDTO calculateResponse = service.formulatesCompoundInterest(body);
    return ResponseEntity.status(HttpStatus.CREATED).body(calculateResponse);
    }
}
