package service;

import model.User;
import repository.UserRepository;
import util.MyList;

public class UserService {
    private final UserRepository repositoryUser;

    public UserService(UserRepository userRepository) {
        this.repositoryUser = userRepository;
    }

    public MyList<User> getAllUsers() {


        return repositoryUser.getAllUsers();
    }

    public User createUser(String email, String password) {
        boolean isExist = repositoryUser.isUserEmailExist(email);
        if (isExist) {
            return null;
        }
        // мне нужно провалидировать мой емеил и пароль
        User user = repositoryUser.createUser(email, password);
        return user;

    }


}
