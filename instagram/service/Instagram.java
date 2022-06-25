package instagram.service;

import instagram.model.Post;
import instagram.model.User;

import java.util.ArrayList;
import java.util.List;

public class Instagram{
    private List<User> users;

    public Instagram(List<User> users) {
        this.users = users;
    }

    public User getUser(int id){
        return users.get(id);
    }
    public List<Post> getAllFeeds(){
        List<Post> allFeeds = new ArrayList<>();

        for(User user : users){
            allFeeds.addAll(user.getPosts());
        }
        return allFeeds;
    }
}
