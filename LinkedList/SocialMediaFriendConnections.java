import java.util.ArrayList;
import java.util.List;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    User next;

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class FriendList {
    User head;

    void addUser(User newUser) {
        newUser.next = head;
        head = newUser;
    }

    User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    User findUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null && userId1 != userId2) {
            if (!user1.friendIds.contains(userId2)) user1.friendIds.add(userId2);
            if (!user2.friendIds.contains(userId1)) user2.friendIds.add(userId1);
        }
    }

    void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove((Integer) userId2);
            user2.friendIds.remove((Integer) userId1);
        }
    }

    void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ":");
            for (int id : user.friendIds) {
                User friend = findUserById(id);
                if (friend != null) {
                    System.out.println(friend.name);
                }
            }
        }
    }

    void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            System.out.println("Mutual Friends:");
            for (int id : user1.friendIds) {
                if (user2.friendIds.contains(id)) {
                    User mutual = findUserById(id);
                    if (mutual != null) {
                        System.out.println(mutual.name);
                    }
                }
            }
        }
    }

    void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }
}

public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        FriendList list = new FriendList();

        list.addUser(new User(1, "Alice", 22));
        list.addUser(new User(2, "Bob", 24));
        list.addUser(new User(3, "Charlie", 21));
        list.addUser(new User(4, "Daisy", 23));

        list.addFriendConnection(1, 2);
        list.addFriendConnection(1, 3);
        list.addFriendConnection(2, 3);
        list.addFriendConnection(3, 4);

        list.displayFriends(1);
        list.findMutualFriends(1, 2);
        list.countFriends();

        list.removeFriendConnection(1, 2);
        System.out.println("\nAfter removing connection between Alice and Bob:");
        list.displayFriends(1);
        list.displayFriends(2);
    }
}
