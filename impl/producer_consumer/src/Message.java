class Message{
    private static int id;
    private String content;

    Message(String content){
        this.content = content;
        id++;
    }

    public String getContent() {
        return content;
    }

    public static int getId(){
        return id;
    }
}