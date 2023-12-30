package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

// annotation @Service é melhor para a semantica do que a @Component.
@Service
public class PensionService {

    public double discount (double amount) {
        return amount * 0.1;
    }

}
