package program;

import DAO.UserDAO;
import entities.User;

public class Main {
    public static void main(String[] args){

        User user = new User();
        user.setName("Gabriel");
        user.setPassword("1234");
        user.setEmail("Gab@teste.com");
        user.setLogin("gabs");

        new UserDAO().registerUser(user);
    }
}
