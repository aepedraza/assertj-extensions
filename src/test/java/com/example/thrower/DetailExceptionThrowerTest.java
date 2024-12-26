package com.example.thrower;

import com.example.exception.DetailException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class DetailExceptionThrowerTest {

    private final DetailExceptionThrower underTest = new DetailExceptionThrower();

    @Test
    void test_builtinExceptionAssert() {
        assertThatExceptionOfType(DetailException.class)
                .isThrownBy(underTest::throwException)
                .withMessage("message");
    }
}