package herancaMultipla;

/*  A classe deve possuir como atributos: nome do(a) usuario(a), e-mail e senha. Como metodos, deve possuir o metodo verificaSenha(senha), mensagemSucesso() e mensagemFracasso() para infor11
mar do sucesso/fracasso do acesso. */

public class Email implements Seguranca{

    String usuario;
    String email;
    String senha;


    @Override
    public boolean verificarSenha(String senha) {
        if (senha.equals(this.senha)) {
            return true;
        }
        return false;
    }

    @Override
    public void mensagemSucesso() {
        System.out.println("Operação realizada com sucesso !!!!");
    }

    @Override
    public void mensagemFalha() {
        System.out.println("Erro na operacao, tente novamente.");
    }
}
