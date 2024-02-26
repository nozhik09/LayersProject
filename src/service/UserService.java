package service;

import model.User;
import repository.RepositoryUser;
import util.MyList;

public class UserService {
    private final RepositoryUser repositoryUser;

    public UserService(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
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
