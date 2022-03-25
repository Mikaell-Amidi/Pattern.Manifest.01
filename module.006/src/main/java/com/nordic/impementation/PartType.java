package com.nordic.impementation;


public enum PartType {

    KEY, CYLINDER;

    public static PartType extract(String input) {
        return input.equals(KEY.name()) ? KEY : input.equals(CYLINDER.name()) ? CYLINDER : null;
    }

    public String getValue(PartType type) {
        return type.name();
    }

}
