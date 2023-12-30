package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

// a annotation @Component faz o registro dessa classe TaxService no sistema do spring como sendo um componente.
// annotation é quando voce decora um pedaço de código para que seja feito um pré processamento quando esse programa rodar.
// ... e nesse caso a função dessa annotation é registrar um componente.
// obs nesse caso ele passa a usar a annotation @Service, e deixa de usar a annotation @Component. objetivo é dar melhor semântica.
@Service
public class TaxService {

    public double tax (double amount) {
        return amount * 0.2;
    }

}
