package service;

public class Auditoria {

    public void registrar(String usuario, double valor) {
        System.out.println("Auditoria: pagamento de R$ " + valor + " para " + usuario);
    }
}