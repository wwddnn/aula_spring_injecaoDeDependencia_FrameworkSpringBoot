package com.devsuperior.aula;

import com.devsuperior.aula.entities.Employee;
import com.devsuperior.aula.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// essa annotation vai preparar essa aplicação java para ser uma aplicação spring boot.
@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	// vou declarar uma dependência do meu AulaApplication para o SalaryService.
	// a injecao de dependencia é feita aqui pelo framework atraves do construtor abaixo.
	// e vou declarar o meu construtor somente com o parametro sendo o SalaryService
	// obs. la na classe SalaryService eu mantenho o metodo construtor que tem os parametros TaxService e PensionService.
	//** obs2. para nao precisar fazer esse construtor abaixo que ficara a partir de agora como um comentario, usamos a annotation @Autowired
	// ... em cima do atributo aqui que é a minha dependencia SalaryService
	@Autowired
	private SalaryService salaryService;
	
	/*
	public AulaApplication (SalaryService salaryService) {
		this.salaryService = salaryService;
	}
	*/

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria", 4000.0);
		System.out.println("Net Salary: $ " + salaryService.netSalary(employee));
	}

}
