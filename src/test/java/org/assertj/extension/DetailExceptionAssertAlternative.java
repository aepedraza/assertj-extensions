package org.assertj.extension;

import com.example.exception.DetailException;
import org.assertj.core.api.ThrowableAssertAlternative;

import java.util.Objects;

public class DetailExceptionAssertAlternative extends ThrowableAssertAlternative<DetailException> {
    public DetailExceptionAssertAlternative(DetailException e) {
        super(e);
    }

    public DetailExceptionAssertAlternative withMessage(String message) {
        super.withMessage(message);
        return this;
    }

    public DetailExceptionAssertAlternative withDetail(String detail) {
        isNotNull();

        if (!Objects.equals(actual.getDetail(), detail)) {
            failWithMessage("Expected detail to be <%s> but was <%s>", detail, actual.getDetail());
        }

        return this;
    }
}
