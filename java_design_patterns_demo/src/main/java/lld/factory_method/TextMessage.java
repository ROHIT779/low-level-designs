package lld.factory_method;

public class TextMessage extends Message{

    private String content;

    public TextMessage(String content){
        this.content = content;
    }

    @Override
    public String getContent() {
        return "Text: " + this.content;
    }
}
