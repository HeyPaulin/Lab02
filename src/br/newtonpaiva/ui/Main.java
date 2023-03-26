package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(10);
        //       c.setNumero(10);
        c.setSaldo(100.0);

        c.depositar(50.0);
        //       c.depositar(20.0);

        Conta c2 = new Conta();
        c2.setNumero(10);
        c2.setSaldo(500.0);


        Conta c3 = new Conta();

        if (c.equals(c2)) {
            System.out.println("Mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }

        System.out.println(c.getSaldo());
        Pessoa pessoas[] = new Pessoa[4];
        pessoas[0] = new PessoaFisica();
        pessoas[1] = new PessoaJuridica();
        pessoas[2] = new PessoaJuridica();
        pessoas[3] = new PessoaFisica();

        for (Pessoa p : pessoas)
            p.validarDocumento();

        Conta conta = new ContaPoupanca();
        conta.setNumero(11110009);
        conta.setSaldo(5000.0);

        Pessoa paulo = new PessoaFisica();
        paulo.setNome("Paulo");
        paulo.getContas().add(conta);

        conta.setPessoa(paulo);

        for(Conta c: paulo.getContas())
            c.depositar(100.0);

        conta.getPessoa().add;

        //paulo.setConta(conta);

        conta.setPessoa(paulo);

    }
}
