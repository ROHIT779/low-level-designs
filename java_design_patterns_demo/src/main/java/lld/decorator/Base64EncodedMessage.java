package lld.decorator;

import java.util.Base64;

// Another decorator
public class Base64EncodedMessage implements Message{

    private Message msg;

    public Base64EncodedMessage(Message msg){
        this.msg = msg;
    }

    public String getContent(){
        // be wary of charset! this is platform dependent
        return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
    }
}
