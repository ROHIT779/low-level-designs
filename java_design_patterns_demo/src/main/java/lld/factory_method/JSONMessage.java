package lld.factory_method;

public class JSONMessage extends Message{

    private String content;

    private String json;

    public JSONMessage(String content){
        this.content = content;
        convertToJSON();
    }

    @Override
    public String getContent(){
        return json;
    }

    private void convertToJSON(){
        this.json = "{\"JSON Message\": \"" + this.content + "\"}";
    }
}
