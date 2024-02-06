package br.com.vinisantosdev.bankInvestiment.BankInvestiment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calculate {
    private double amount;
    private double principal;
    private double rate;
    private double time;
}
