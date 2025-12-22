package lld.factory_method;

// abstract creator
public abstract class MessageCreator {

    public Message getMessage(String content){
        //Actual Implementation will be given by subclasses
        Message msg = createMessage(content);

        // Additional Operations
        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //Factory Method
    public abstract Message createMessage(String content);
}
