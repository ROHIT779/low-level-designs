package lld.factory_method;

public class TextMessage extends Message{

    private String content;

    private String text;

    public TextMessage(String content){
        this.content = content;
        convertToText();
    }

    private void convertToText(){
        this.text = "Text: " + this.content;
    }

    @Override
    public String getContent() {
        return text;
    }
}
