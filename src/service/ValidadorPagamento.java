package service;

public class ValidadorPagamento {

    public boolean validar(String usuario, double valor) {

        if (usuario == null || usuario.isEmpty()) {
            System.out.println("Usuário inválido");
            return false;
        }

        if (valor <= 0) {
            System.out.println("Valor inválido");
            return false;
        }

        System.out.println("Validação OK");
        return true;
    }
}