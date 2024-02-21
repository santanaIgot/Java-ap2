package br.com.fiap.bean;

public class ContaCorrente extends Conta{

    TipoConta tipo;


    public void depositar(Double valor){
        Double saldo = getSaldo();
        saldo+=valor;
        setSaldo(saldo);
    }


    public void retirar(){

    }
}
