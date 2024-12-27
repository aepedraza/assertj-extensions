package org.assertj.extension;

import com.example.exception.DetailException;
import org.assertj.core.api.ThrowableAssert;
import org.assertj.core.api.ThrowableTypeAssert;

public class DetailExceptionAssert extends ThrowableTypeAssert<DetailException> {
    public DetailExceptionAssert(Class<? extends DetailException> throwableType) {
        super(throwableType);
    }

    @Override
    public DetailExceptionAssertAlternative isThrownBy(ThrowableAssert.ThrowingCallable throwingCallable) {
        // TODO 2024-12-26 Improve this to avoid duplication
        super.isThrownBy(throwingCallable);
        DetailException throwable = (DetailException) ThrowableAssert.catchThrowable(throwingCallable);
        this.checkThrowableType(throwable);
        return new DetailExceptionAssertAlternative(throwable);
    }
}
