import java.util.List;
import java.util.ArrayList;

class MessageCreator{
    private static List<String> messages = new ArrayList<>();
    private static int index = 0;

    public static void addMessage(String message){
        messages.add(message);
    }

    public void removeMessage(int location){
        messages.remove(location);
    }

    public static String getMessage(){
        if(!messages.isEmpty()){
            index++;
            return messages.get(index % messages.size());
        }
        return "";
    }
}