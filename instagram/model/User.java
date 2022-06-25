package instagram.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private List<Post> posts;
    private List<User> follows;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        posts = new ArrayList<>();
        follows = new ArrayList<>();
    }

    public boolean makePost(Post post){
        posts.add(post);
        return true;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Post> getLatestPost(int n){
        if(n> posts.size()) {
            List<Post> p = posts;
            Collections.reverse(p);
            return p;
        }
        List<Post> latestPosts = posts.subList(posts.size()-n,posts.size());
        Collections.reverse(latestPosts);
        return latestPosts ;
    }

    public List<Post> getLatestPostofFollowers(int n){
        List<Post> latest = new ArrayList<>();

        for(User user : follows){
            latest.addAll(user.getPosts());
        }
        Collections.sort(latest,(a,b)->b.getTime()-a.getTime());
        if(n>latest.size()){
            return  latest;
        }
        return latest.subList(0,n);
    }
    public void follow(User user){
        follows.add(user);
    }

}
