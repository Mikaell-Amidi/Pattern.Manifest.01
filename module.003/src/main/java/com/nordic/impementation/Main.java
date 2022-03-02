package com.nordic.impementation;

public class Main {
    public static void main(String[] args) {
        EnhancedRepository<Repository> enhanced = new EnhancedRepository<>();
        enhanced.setTheKernel(RepositoryImpl::new);
        enhanced.enhancedSave();
        enhanced.decorate().save();
    }
}
