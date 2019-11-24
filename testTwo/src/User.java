import java.util.ArrayList;
import java.util.List;

/**
 * @Auther Administrator
 * @Date 2019/11/23 22:33
 * @Description
 */
public class User {

    String name;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<User> users(){
        User user = new User("renxu","123qwe");
        User user2 = new User("lisi","123qwe");
        User user1 = new User("wangwu","123qwe");
        User user3 = new User("zhaoliu","123qwe");
        User user4 = new User("zhanger","123qwe");
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }
}
