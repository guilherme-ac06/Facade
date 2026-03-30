package facade;

import service.ValidadorPagamento;
import service.ProcessadorPagamento;
import service.Notificador;
import service.Auditoria;

public class PagamentoFacade {

    private ValidadorPagamento validador;
    private ProcessadorPagamento processador;
    private Notificador notificador;
    private Auditoria auditoria;

    public PagamentoFacade() {
        validador = new ValidadorPagamento();
        processador = new ProcessadorPagamento();
        notificador = new Notificador();
        auditoria = new Auditoria();
    }

    public void realizarPagamento(String usuario, double valor) {

        System.out.println("\n=== INICIANDO PAGAMENTO ===");
        if (!validador.validar(usuario, valor)) {
            System.out.println("Pagamento cancelado");
            return;
        }

        boolean sucesso = processador.processar(valor);

        if (sucesso) {
            notificador.enviar(usuario);
            auditoria.registrar(usuario, valor);
            System.out.println("Pagamento realizado com sucesso");
        } else {
            System.out.println("Falha no pagamento");
        }
    }
}