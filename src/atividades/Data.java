package atividades;

import java.util.Calendar;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    
    public Data(int dia, int mes, int ano) {
        if (isValidDate(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    
    public Data() {
        Calendar cal = Calendar.getInstance();
        this.dia = cal.get(Calendar.DAY_OF_MONTH);
        this.mes = cal.get(Calendar.MONTH) + 1; 
        this.ano = cal.get(Calendar.YEAR);
    }

    
    private boolean isValidDate(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        } else if (dia < 1 || dia > daysInMonth(mes, ano)) {
            return false;
        } else {
            return true;
        }
    }

    /
    private int daysInMonth(int mes, int ano) {
        switch (mes) {
            case 2:
                return isLeapYear(ano) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    
    private boolean isLeapYear(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (isValidDate(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (isValidDate(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (isValidDate(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    
    public void proximoDia() {
        int novoDia = this.dia + 1;
        int novoMes = this.mes;
        int novoAno = this.ano;

        if (novoDia > daysInMonth(this.mes, this.ano)) {
            novoDia = 1;
           
