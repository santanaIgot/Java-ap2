package br.com.fiap.bean;

import java.util.Calendar;

public class Conta {

    int agencia;
    int numero ;
    Calendar dataAbertura;
    double saldo;

     public Conta(){

     }


    public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }


//    COMEÇO METODOS
    public static double depositar(double valor){

        return valor;
    }

    public static double retirar(double valor){
        return valor;
    }
//    FIM METODOS

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
