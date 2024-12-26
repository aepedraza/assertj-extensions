package com.example.thrower;

import com.example.exception.DetailException;

public class DetailExceptionThrower {

    public void throwException() {
        throw new DetailException("message", "a detailed exception explanation");
    }
}
