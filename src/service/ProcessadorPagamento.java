package service;

public class ProcessadorPagamento {

    public boolean processar(double valor) {

        System.out.println("Processando pagamento de R$ " + valor);
        return true;
    }
}