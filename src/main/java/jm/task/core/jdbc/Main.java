package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь

        User user = new User();
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        System.out.println();
        userService.saveUser("Andrey", "Malahov", (byte) 30);
        userService.saveUser("John", "Smith", (byte) 35);
        userService.saveUser("Vasya", "Pupkin", (byte) 25);
        userService.saveUser("Denis", "Kovalov", (byte) 27);
        System.out.println();
        List<User> userList = userService.getAllUsers();
        for (User u : userList) {
            System.out.println(u);
        }
        System.out.println();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
