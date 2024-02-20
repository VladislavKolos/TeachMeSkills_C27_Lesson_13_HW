package com.teachmeskills.hw13.task0.runner;

import com.teachmeskills.hw13.task0.service.CheckService;

/**
 * Class with method main to run the program
 * method is called in this class (input parameters - login, password and confirmPassword).
 */
public class Runner {
    public static void main(String[] args) {
        CheckService.loginAndPasswordCheck("Vladislav", "123123tmstms", "123123tmstms");
    }
}
