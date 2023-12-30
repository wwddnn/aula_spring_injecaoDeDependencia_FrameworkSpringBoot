package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// annotation @Service é melhor para a semantica do que a @Component.
@Service
public class SalaryService {

    // atencao. como uma outra forma de registrar o componente que esse SalaryService depende que no caso sao os 2 (TaxService e PensionService)
    // podemos fazer colocando o annotation @AutoWired em cima de cada uma das dependencias(TaxService e PensionService).
    // entao pra isso temos que excluir o construtor abaixo que foi comentado.
    // autowired quer dizer na traducao ''com fio automatico'' ou seja faz o registro da dependencia dos outros 2 componentes que a classe SalaryService depende.
    @Autowired
    private TaxService taxService;
    @Autowired
    private PensionService pensionService;

    /*
    public SalaryService (TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }
     */


    public double netSalary (Employee employee) {
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }

}
