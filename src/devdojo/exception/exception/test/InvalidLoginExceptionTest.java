package devdojo.exception.exception.test;

import devdojo.exception.exception.domain.InvalidLoginException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidLoginExceptionTest {
    public static void loginAdmin(String user, Integer pwd) throws InvalidLoginException {
        if (!user.equals("admin")){
            throw new InvalidLoginException("Usuário incorreto.");
        }

        if (!(pwd.equals(789))){
            throw new InvalidLoginException("Senha incorreta.");
        }

        System.out.println("\nLogin realizado com sucesso!✅");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("------- Painel de login ------\n");
            System.out.print("username: ");
            String username = input.nextLine();

            System.out.print("password: ");
            Integer pwd = input.nextInt(); /* Unchecked exceptions */
            loginAdmin(username, pwd); /* Checked exception */
        } catch (InvalidLoginException | InputMismatchException e) {
            if (e instanceof InputMismatchException) {
                System.out.println("A senha informada contém caracteres diferentes do permitido.");
            } else {
                e.printStackTrace();
            }
        }
    }
}
