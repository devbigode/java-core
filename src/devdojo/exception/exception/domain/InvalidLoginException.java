package devdojo.exception.exception.domain;

public class InvalidLoginException extends Exception {
        public InvalidLoginException(){
            super("Erro ao realizar login.");
        }

        public InvalidLoginException(String message){
            super(message);
        }
}
