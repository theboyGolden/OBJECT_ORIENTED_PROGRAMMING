// Create a class called User with the following attributes:

// userId (String)
// username (String)
// email (String)
// friends (List of User) - to store a list of friends.
// Implement a constructor to initialize the attributes when a User object is created.

// Create methods in the User class for the following operations:

// addFriend(User friend) - to add a user as a friend.
// removeFriend(User friend) - to remove a user from the friend list.
// getFriends() - to retrieve the list of friends.
// Create a class called Post with the following attributes:

// postId (String)
// content (String)
// author (User)
// timestamp (Date or String)
// Implement a constructor to initialize the attributes when a Post object is created.

// Create a method in the Post class to display information about the post, including the author and timestamp.

// In the main method, create instances of the User and Post classes, perform operations like adding/removing friends, and create posts with comments.




import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String userId;
    private String username;
    private String email;
    private List<User> friends; 

    // Constructor
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.friends = new ArrayList<>(); // Initialize the list
    }


    public void addFriend(User friend) {
        friends.add(friend);
    }

    public void removeFriend(User friend) {
        friends.remove(friend);
    }

    public List<User> getFriends() {
        return friends;
    }

    public class Post {
        private String postId;
        private String content; 
        private User author; 
        private Date timestamp;

        // Constructor for Post
        public Post(String content, User author, Date timestamp) {
            this.content = content;
            this.author = author;
            this.timestamp = timestamp;
        }

        public void displayInfo() {
            System.out.println("Post ID: " + postId);
            System.out.println("Content: " + content);
            System.out.println("Author: " + author.getUsername()); // Access the username through getter
            System.out.println("Timestamp: " + timestamp);
        }
    }

    public void displayInfo() {
        System.out.println("User Id: " + userId);
        System.out.println("User Name: " + username);
        System.out.println("Email: " + email);

        // Display friends
        System.out.println("Friends:");
        for (User friend : friends) {
            System.out.println("- " + friend.getUsername());
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Golden Boy", "theboygolden@gmail.com");

        user1.displayInfo();
    }

    // Getter for username
    public String getUsername() {
        return username;
    }
}



