package repository;

import model.Role;
import model.User;
import util.MyArrayList;
import util.MyLinkedList;
import util.MyList;

import java.util.concurrent.atomic.AtomicInteger;

public class RepositoryUser {

    private final MyList<User> users;
    // объект для генерации последовательных и уникальных ID
    private final AtomicInteger currentId = new AtomicInteger(1);

    public RepositoryUser() {


        this.users = new MyArrayList<>();

    }

    private void init(){
        User user1 = new User(currentId.getAndIncrement() , "test@email.net" , "qweqwrq1@WW");
        User user2 = new User(currentId.getAndIncrement() , "test1@email.net" , "qweqwrq1@WW");
        User user3 = new User(currentId.getAndIncrement() , "test2@email.net" , "qweqwrq1@WW");
        User user4 = new User(currentId.getAndIncrement() , "test3@email.net" , "qweqwrq1@WW");
        User user5 = new User(currentId.getAndIncrement() , "test4@email.net" , "qweqwrq1@WW");
        User user6 = new User(currentId.getAndIncrement() , "test5@email.net" , "qweqwrq1@WW");
        user1.setRole(Role.ADMIN);
        users.addAll(user1,user2,user3,user4,user5,user6);
    }






    public MyList<User> getAllUsers() {
        return users;
    }


    public boolean isUserEmailExist(String email) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(email)) return true;
        }





        return false;
    }

    public User createUser(String email, String password) {
        User user = new User(currentId.getAndIncrement() , email, password);
        if (user.getEmail()==null || user.getPassword()==null) return null;
        users.add(user);




        return user;
    }
}
