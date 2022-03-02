package com.nordic.impementation;

import com.nordic.validator.Validator;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Validator<Entity> validator = Validator.validate(Objects::nonNull);
        validator.thenValidate(o -> StringUtils.isNotBlank(o.getName())).on(new Entity(""));
    }
}
