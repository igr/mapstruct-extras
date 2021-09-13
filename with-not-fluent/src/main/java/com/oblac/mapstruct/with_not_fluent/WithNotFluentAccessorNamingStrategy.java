package com.oblac.mapstruct.with_not_fluent;

import org.mapstruct.ap.spi.DefaultAccessorNamingStrategy;

import javax.lang.model.element.ExecutableElement;

public class WithNotFluentAccessorNamingStrategy extends DefaultAccessorNamingStrategy {

    @Override
    protected boolean isFluentSetter(final ExecutableElement method) {
        final String methodName = method.getSimpleName().toString();
        return !isWithMethod(methodName) && super.isFluentSetter(method);
    }

    protected boolean isWithMethod(final String methodName) {
        return methodName.length() > 4 && methodName.startsWith("with") && Character.isUpperCase(methodName.charAt(4));
    }
}
