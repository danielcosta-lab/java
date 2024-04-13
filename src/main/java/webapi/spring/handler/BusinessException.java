package webapi.spring.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String mensagem){
        super(mensagem);
    }

    public BusinessException(String mensagem, Object ... param){
        super(String.format(mensagem, param));
    }

}
