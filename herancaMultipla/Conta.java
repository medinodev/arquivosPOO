package herancaMultipla;

/* Implemente a classe Conta. A classe deve possuir como atributos: CPF,
senha e saldo do(a) usu´ario(a). Como metodos, deve possuir “saca(valor,
senha)” e “deposita(valor, senha)”. O ato de sacar ou depositar o valor so e
realizado se a senha estiver correta. Portanto, a classe deve possuir o metodo
verificaSenha(senha) para tal tarefa e mensagemSucesso() e mensagemFracasso() para informar do sucesso/fracasso da operacao.
*/

public class Conta implements Seguranca{

    String cpf;
    String senha;
    float saldoConta;

    public void sacar(float valor, String senha){
        if(verificarSenha(senha)){
            mensagemSucesso();
        } else {
            mensagemFalha();
        }
    }

    public void depositar(float valor, String senha){
        if(verificarSenha(senha)){
            mensagemSucesso();
        } else {
            mensagemFalha();
        }
    }

    @Override
    public boolean verificarSenha(String senha) {
        if(senha.equals(this.senha)){
            return true;
        }
        return false;
    }

    @Override
    public void mensagemSucesso() {
        System.out.println("Operacao realizada.");
    }

    @Override
    public void mensagemFalha() {
        System.out.println("Erro na operacao, tente novamente.");
    }
}
