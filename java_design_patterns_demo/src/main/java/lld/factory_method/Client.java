package lld.factory_method;

public class Client {

    public static void main(String[] args){
        String message = "The Statue of Unity of India is the world's tallest statue, " +
                "standing at 182 meters(597 feet).";
        printMessage(new JSONMessageCreator(), message);
        printMessage(new TextMessageCreator(), message);
    }

    private static void printMessage(MessageCreator creator, String content){
        Message msg = creator.getMessage(content);
        System.out.println(msg.getContent());
    }
}
