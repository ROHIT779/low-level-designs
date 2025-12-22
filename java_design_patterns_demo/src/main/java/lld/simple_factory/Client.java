package lld.simple_factory;

public class Client {

    public static void main(String[] args){
        Post post1 = PostFactory.createPost("BLog");
        Post post2 = PostFactory.createPost("news");
        System.out.println(post1);
        System.out.println(post2);

        try{
            Post post3 = PostFactory.createPost("Facebook");
        } catch (IllegalArgumentException e1){
            System.out.println(e1.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
