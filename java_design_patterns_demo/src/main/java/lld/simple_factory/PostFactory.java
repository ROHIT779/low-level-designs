package lld.simple_factory;

//Simple Factory
public class PostFactory {

    public static Post createPost(String type, String... args){
        switch (type.toLowerCase()){
            case "blog":
                if(args.length == 3){
                    return new BlogPost(args[0], args[1], args[2]);
                }
            case "news":
                if(args.length == 2){
                    return new NewsPost(args[0], args[1]);
                }
            default:
                throw new IllegalArgumentException("Invalid type of post");
        }
    }
}
