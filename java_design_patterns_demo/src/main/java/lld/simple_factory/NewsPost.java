package lld.simple_factory;

import java.time.LocalDateTime;

public class NewsPost extends Post{
    private String headline;
    private LocalDateTime newsTime;
    private String content;


    public NewsPost(String headline, String content){
        this.headline = headline;
        this.content = content;
        this.newsTime = LocalDateTime.now();
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public LocalDateTime getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDateTime newsTime) {
        this.newsTime = newsTime;
    }

    public String toString() {
        return "BREAKING NEWS!!! " + "\n" +
                this.headline + "\n" +
                this.newsTime + "\n" +
                "----- ----- -----" +
                this.content;
    }
}
