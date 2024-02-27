package view;

import model.User;
import service.UserService;
import util.MyList;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);


    public final UserService service;


    public Menu(UserService service) {
        this.service = service;
    }


    public void run() {
        showMenu();


    }

    private void showMenu() {
        while (true) {
            System.out.println("Добро пожаловать в интернет магазин Мега");
            System.out.println("1. Меню пользователя");
            System.out.println("2. Меню заказов");
            System.out.println("3. Меню админа");
            System.out.println("0. Выход");
            System.out.println("\nСделайте выбор пункта");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 0) {
                System.out.println("До свидание");
                System.exit(0);// завершеие программы
            }
            // обрабатываем пользоватский ввод

            showSubMenu(input);


        }

    }

    private void showSubMenu(int input) {
        switch (input) {

            case 1:
                showUserMenu();
                break;
            case 2:
                showOrderMenu();
                break;
            case 3:
                showAdminMenu();
                break;
            default:
                System.out.println("Ваш выбор не корректный");
                waitRead();
        }
    }

    private void showAdminMenu() {
        System.out.println("Меню админа");
    }

    private void showOrderMenu() {
        System.out.println("Меню заказов");
        //TODO написать меню
    }

    private void showUserMenu() {
        while (true) {
            System.out.println("Меню пользователя ");
            System.out.println("1 -> Авторизоваться в системе ");
            System.out.println("2 -> Регистрация нового пользователя ");
            System.out.println("3 -> Другой пункт меню");
            System.out.println("4 -> Список всех пользователей ");
            System.out.println("0 -> Возврат в предыдущее меню ");


            System.out.println("\nСделайте выбор пункта");
            int input = scanner.nextInt();
            scanner.nextLine();


            if (input == 0) break;
            handleUserMenuChoice(input);

        }
    }

    private void handleUserMenuChoice(int input) {
        switch (input) {

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4://вывести Список всех пользователей
                MyList<User> userList = service.getAllUsers();
                for (User user : userList.toArray()) {
                    System.out.println(user);
                }
                waitRead();
                break;
            case 5:
                break;
            default:
                System.out.println("\nНеправильный ввод");
                waitRead();


        }


    }


    private void waitRead() {
        System.out.println("\nДля продолжения нажмите Enter... ");
        scanner.nextLine();


    }

} // end class
