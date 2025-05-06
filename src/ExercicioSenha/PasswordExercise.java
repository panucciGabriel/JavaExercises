package ExercicioSenha;

import java.util.Scanner;

public class PasswordExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha  = scan.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido! ");
        } catch (SenhaInvalidaExeption e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8 ) {
            throw new SenhaInvalidaExeption("A senha deve ter pelo menos 08 caracteres!");
        }
    }
}
