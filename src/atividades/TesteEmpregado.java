package atividades;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Cleuber", "Henrique", 2200);
        Empregado empregado2 = new Empregado("Lyorraine", "Ferreira", 1800);
        
        
        System.out.printf("%s %s - Salário anual: %.2f%n", empregado1.getPrimeiroNome(), empregado1.getSobrenome(), empregado1.calcularSalarioAnual());
        System.out.printf("%s %s - Salário anual: %.2f%n", empregado2.getPrimeiroNome(), empregado2.getSobrenome(), empregado2.calcularSalarioAnual());
        
        
        empregado1.aumentarSalario();
        empregado2.aumentarSalario();
        
       
        System.out.printf("%s %s - Salário anual após aumento: %.2f%n", empregado1.getPrimeiroNome(), empregado1.getSobrenome(), empregado1.calcularSalarioAnual());
        System.out.printf("%s %s - Salário anual após aumento: %.2f%n", empregado2.getPrimeiroNome(), empregado2.getSobrenome(), empregado2.calcularSalarioAnual());
    }
}
