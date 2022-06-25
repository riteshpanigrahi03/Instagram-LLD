package instagram;

import instagram.model.Post;
import instagram.model.User;
import instagram.service.Instagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dunzo {
    public static void main(String[] args) {
        User u1 = new User(1,"user 1");
        User u2 = new User(2,"user 2");
        User u3 = new User(3,"user 3");
        User u4 = new User(4,"user 4");

        List<User> users = new ArrayList<>(Arrays.asList(u1,u2,u3,u4));
        Instagram instagram = new Instagram(users);

        instagram.getUser(0).makePost(new Post(1,"user 1 post1",1));
        instagram.getUser(0).makePost(new Post(2,"user 1 post2",2));
        instagram.getUser(0).follow(u2);
        instagram.getUser(0).follow(u3);

        instagram.getUser(1).follow(u3);
        instagram.getUser(2).follow(u4);

        instagram.getUser(1).makePost(new Post(3,"user 2 post1",3));
        instagram.getUser(2).makePost(new Post(4,"user 3 post1",4));
        instagram.getUser(1).makePost(new Post(5,"user 2 post2",5));
        instagram.getUser(0).makePost(new Post(6,"user 1 post3",6));

        System.out.println(instagram.getUser(0).getLatestPost(10));
        System.out.println(instagram.getUser(0).getLatestPostofFollowers(2));
        System.out.println(instagram.getAllFeeds());


    }
}
