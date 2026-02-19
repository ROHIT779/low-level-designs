package lld.simple_factory;

public class Client {

    public static void main(String[] args){
        String blogContent = "According to the National Crime Records Bureau (NCRB) " +
                "2023 report, the crime rate in India (cases per lakh population) rose " +
                "to 448.3 in 2023, up from 422.2 in 2022, with 6.24 million total " +
                "cognizable crimes recorded. While thefts remain the most common, " +
                "cyber-crimes are rising, and urban areas report higher, more volatile " +
                "crime rates.";
        String newsHeadline = "Lost and found in 24 hours: Startup devices stolen from AI Summit recovered";
        String newsContent = "A Bengaluru-based AI startup founder who alleged that " +
                "his company's wearable devices were stolen from inside a “high-security " +
                "zone” at the India AI Impact Summit in Delhi has confirmed that the devices " +
                "have been recovered — nearly 24 hours after he first flagged the incident.\n" +
                "\n" +
                "According to police sources, two individuals have been identified who were " +
                "present at the AI Summit to work. They are investigating whether this is a case " +
                "of theft or if the wearables were mistakenly taken away.";
        Post post1 = PostFactory.createPost("BLog", "Ravi Shankar Dutta", "Crime rates in India", blogContent);
        Post post2 = PostFactory.createPost("news", newsHeadline, newsContent);

        System.out.println("\n- A blog post -");
        System.out.println(post1.toString());
        System.out.println("\n- A news post -");
        System.out.println(post2.toString());

        try{
            Post post3 = PostFactory.createPost("Facebook");
        } catch (IllegalArgumentException e1){
            System.out.println(e1.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
