package lld.decorator;

public class Client {

    public static void main(String[] args){
        String msg = "The <Force> is strong with this one!";
        Message m = new TextMessage(msg);
        System.out.println(m.getContent());

        Message decorator = new HtmlEncodedMessage(m);
        System.out.println(decorator.getContent());

        // Decorator chaining(recursive composition),
        // possible because decorator implements interface(Message),
        // not concrete class(TextMessage)
        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.getContent());
    }
}
