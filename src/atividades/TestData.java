package atividades;

public class TestData {
    public static void main(String[] args) {
        
        Data data1 = new Data(9, 3, 2023);
        System.out.println("Data1: " + data1); 

       
        Data data2 = new Data();
        System.out.println("Data2: " + data2); /

        // Teste dos métodos setters
        data1.setDia(10);
        data1.setMes(4);
        data1.setAno(2024);
        System.out.println("Data1 após alterações: " + data1); 

        // Teste do método proximoDia
        data1.proximoDia();
        System.out.println("Data1 após avançar um dia: " + data1);
    }
}
