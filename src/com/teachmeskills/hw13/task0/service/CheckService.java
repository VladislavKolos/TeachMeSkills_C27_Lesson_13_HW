package com.teachmeskills.hw13.task0.service;

import com.teachmeskills.hw13.task0.custom_exception.WrongLoginException;
import com.teachmeskills.hw13.task0.custom_exception.WrongPasswordException;
import com.teachmeskills.hw13.task0.validator.LoginAndPasswordValidator;

/**
 * Class with static method to login and password checks (input parameters - login, password and confirmPassword) and informing the user if an error occurs.
 */
public class CheckService {
    private CheckService() {
    }

    public static void loginAndPasswordCheck(String login, String password, String confirmPassword) {
        try {
            LoginAndPasswordValidator.checkLogin(login);
            LoginAndPasswordValidator.checkPassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other error");
        }
    }
}
