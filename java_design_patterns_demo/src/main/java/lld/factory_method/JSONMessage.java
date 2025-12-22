package lld.factory_method;

public class JSONMessage extends Message{

    private String content;

    public JSONMessage(String content){
        this.content = content;
    }

    @Override
    public String getContent(){
        return "{\"JSON Message\": " + this.content + "}";
    }
}
