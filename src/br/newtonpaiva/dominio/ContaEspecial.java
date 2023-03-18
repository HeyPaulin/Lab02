package br.newtonpaiva.dominio;

public class ContaEspecial extends Conta {
    private Double limite;

    @Override
    public Double sacar(Double valor) {
        if (saldo + limite - valor < 0)
            throw new IllegalArgumentException("");

        setSaldo(getSaldo() - valor);

        return getSaldo();
    }


    public Double getLimite() {
        return limite;
    }
}
