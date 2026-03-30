package app;

import facade.PagamentoFacade;

public class Main {

    public static void main(String[] args) {

        PagamentoFacade facade = new PagamentoFacade();

        facade.realizarPagamento("João", 150.0);

        facade.realizarPagamento("Maria", -50.0);

        facade.realizarPagamento("", 100.0);
    }
}