package com.example.exception;

/**
 * Custom sample exception
 *
 * @author Alvaro Pedraza
 */
public class DetailException extends RuntimeException {

    private String detail;

    public DetailException(String message, String detail) {
        super(message);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
