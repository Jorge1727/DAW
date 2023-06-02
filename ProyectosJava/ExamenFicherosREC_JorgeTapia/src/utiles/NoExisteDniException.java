package utiles;

public class NoExisteDniException extends Exception{
    String message;
    public NoExisteDniException(String nombre){
        message="El alunmno "+nombre+"  no tiene dni";
    }
    @Override
    public String getMessage() {
        return message;
    }
    @Override
    public String toString() {
        return getMessage();
    }

}   
