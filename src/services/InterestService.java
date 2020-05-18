package services;

import java.security.InvalidParameterException;

// interfaces não possuem construtores e atributos

// Utilizar o Default Methods (a partir do JAVA 8) para simplificar quando os serviços são parecidos
// evitar repetição de código
public interface InterestService {
    // o método abaixo não pode virar default, porque este método depende do valor da variável que
    // está armazenada no serviço. Como a interface não pode armazenar estado, eu não posso colocar o valor aqui
    double getInterestRate();

    // implementação do método default
    //double payment(double amount, int months);
    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero.");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months); // interestRate
    }
}
