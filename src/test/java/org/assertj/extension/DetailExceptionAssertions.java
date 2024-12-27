package org.assertj.extension;

import com.example.exception.DetailException;

public class DetailExceptionAssertions {

    public static DetailExceptionAssert assertThatDetailException() {
        return new DetailExceptionAssert(DetailException.class);
    }
}
