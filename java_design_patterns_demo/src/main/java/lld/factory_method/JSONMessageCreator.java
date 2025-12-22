package lld.factory_method;

public class JSONMessageCreator extends MessageCreator{

    @Override
    public Message createMessage(String content) {
        return new JSONMessage(content);
    }
}
