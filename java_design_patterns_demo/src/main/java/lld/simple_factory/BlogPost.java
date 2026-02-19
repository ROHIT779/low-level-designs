package lld.simple_factory;

import java.util.Arrays;

public class BlogPost extends Post{
    private String author;
    private String title;
    private String content;
    private String[] tags;

    public BlogPost(String author, String title, String content){
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return "A blog on " + this.title + "\n" +
                " - by " + this.author + "\n" +
                "***** ***** *****" + "\n" +
                this.content + "\n" +
                "tags: " + Arrays.toString(this.tags);
    }
}
