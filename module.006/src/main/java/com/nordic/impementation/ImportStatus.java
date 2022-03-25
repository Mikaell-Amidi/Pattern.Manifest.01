package com.nordic.impementation;

import java.util.Objects;

public enum ImportStatus {

    VALID(0), DUPLICATE(1);

    public static ImportStatus extract(Integer input) {
        return Objects.isNull(input) ? null :
                input.equals(VALID.getValue()) ? VALID : DUPLICATE;
    }

    public Integer getValue() {
        return this.value;
    }

    ImportStatus(Integer value) {
        this.value = value;
    }

    private final Integer value;
}
