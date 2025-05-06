package ExercicioSenha;

public class SenhaInvalidaExeption extends RuntimeException {
    public SenhaInvalidaExeption (String mensagem) {
        super(mensagem);
    }
}
