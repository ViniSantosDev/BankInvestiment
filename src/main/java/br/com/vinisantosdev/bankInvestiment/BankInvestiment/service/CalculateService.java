package br.com.vinisantosdev.bankInvestiment.BankInvestiment.service;

import br.com.vinisantosdev.bankInvestiment.BankInvestiment.model.Calculate;
import br.com.vinisantosdev.bankInvestiment.BankInvestiment.dto.CalculateResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public CalculateResponseDTO formulatesCompoundInterest(Calculate request) {
        double principal = request.getPrincipal();
        double rate = request.getRate();
        double time = request.getTime();

        double amount = principal * Math.pow((1 + rate /100), time);

        CalculateResponseDTO result = new CalculateResponseDTO();
        result.setFinalTotalValue(amount);
        return result;
    }

}
