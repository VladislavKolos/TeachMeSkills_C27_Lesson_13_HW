package com.teachmeskills.hw13.task0.custom_exception;

/**
 * An exception class
 * contains one field with modifiers private and final
 * contains two constructors - one by default, the second accepts the exception message and passes it to the class Exception constructor.
 */
public class WrongLoginException extends Exception {
    private final int validationExceptionCode;

    public WrongLoginException(int validationExceptionCode) {
        this.validationExceptionCode = validationExceptionCode;
    }

    public WrongLoginException(String message, int validationExceptionCode) {
        super(message);
        this.validationExceptionCode = validationExceptionCode;
    }
}
