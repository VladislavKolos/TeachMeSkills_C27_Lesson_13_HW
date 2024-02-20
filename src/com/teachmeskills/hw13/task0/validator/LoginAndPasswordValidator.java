package com.teachmeskills.hw13.task0.validator;

import com.teachmeskills.hw13.task0.consts.Consts;
import com.teachmeskills.hw13.task0.custom_exception.WrongLoginException;
import com.teachmeskills.hw13.task0.custom_exception.WrongPasswordException;

/**
 * Class with static methods to checking whether the conditions for entering login and password are met
 * the methods return true if the values are valid or false otherwise.
 */
public class LoginAndPasswordValidator {
    private LoginAndPasswordValidator() {

    }

    public static boolean checkLogin(String login) throws WrongLoginException {
        if (login.length() >= Consts.LOGIN_LENGTH) {
            throw new WrongLoginException("Error, max login length should be less " + Consts.LOGIN_LENGTH, 204);
        }
        if (login.contains(" ")) {
            throw new WrongLoginException("Error, login must not contain spaces ", 406);
        }

        int count = 0;
        for (char ch : login.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                count++;
            }
        }
        if (count > 0) {
            throw new WrongLoginException("Error, login must not contain spaces ", 406);
        }
        return true;
    }

    public static boolean checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= Consts.PASSWORD_LENGTH) {
            throw new WrongPasswordException("Error, max password length should be less " + Consts.PASSWORD_LENGTH, 204);
        }
        if (password.contains(" ")) {
            throw new WrongPasswordException("Error, password must not contain spaces ", 406);
        }

        int count1 = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                count1++;
            }
        }
        if (count1 > 0) {
            throw new WrongPasswordException("Error, password must not contains spaces ", 406);
        }

        int count2 = 0;
        for (char ch : password.toCharArray()) {
            if ((int) ch >= 48 && (int) ch <= 57) {
                count2++;
            }
        }
        if (count2 == 0) {
            throw new WrongPasswordException("Error, the password must contain at least one number ", 206);
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Error, Password and Confirm Password fields are not allowed ", 409);
        }
        return true;
    }
}
