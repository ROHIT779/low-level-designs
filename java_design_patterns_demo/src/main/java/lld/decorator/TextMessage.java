package lld.decorator;

// Concrete component, object to be decorated
public class TextMessage implements Message{

    private String msg;

    public TextMessage(String msg){
        this.msg = msg;
    }

    public String getContent(){
        return msg;
    }
}
