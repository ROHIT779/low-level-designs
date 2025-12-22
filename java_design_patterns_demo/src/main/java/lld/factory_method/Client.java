package lld.factory_method;

public class Client {

    public static void main(String[] args){
        String jsonContent = "{\"message\": \"Hi, this is Rohit\"}";
        String textContent = "Hi, this is Rohit";
        printMessage(new JSONMessageCreator(), jsonContent);
        printMessage(new TextMessageCreator(), textContent);
    }

    private static void printMessage(MessageCreator creator, String content){
        Message msg = creator.getMessage(content);
        System.out.println(msg.getContent());
    }
}
