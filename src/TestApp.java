import repository.UserRepository;
import service.UserService;
import view.Menu;

public class TestApp {


    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        UserService userService = new UserService(repository);
        Menu menu = new Menu(userService);
        menu.run();





    }
}
