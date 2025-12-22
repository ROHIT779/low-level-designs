package lld.factory_method;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage(String content) {
        return new TextMessage(content);
    }
}
