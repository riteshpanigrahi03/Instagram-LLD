package instagram.model;

public class Post {
    int postId;
    String content;
    int time;

    public Post(int postId, String content,int time) {
        this.postId = postId;
        this.content = content;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "instagram.model.Post{" +
                "postId=" + postId +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
