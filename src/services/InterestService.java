package services;

// Utilizar o Default Methods (a partir do JAVA 8) para simplificar quando os serviços são parecidos
// evitar repetição de código
public interface InterestService {
    double getInterestRate();
    double payment(double amount, int months);
}
