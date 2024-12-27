package com.example.thrower;

import org.junit.jupiter.api.Test;

import static org.assertj.extension.DetailExceptionAssertions.assertThatDetailException;

class DetailExceptionThrowerCustomAssertionTest {

    private final DetailExceptionThrower underTest = new DetailExceptionThrower();

    @Test
    void test_customAssertion() {
        assertThatDetailException()
                .isThrownBy(underTest::throwException)
                .withMessage("message")
                .withDetail("a detailed exception explanation");
    }
}