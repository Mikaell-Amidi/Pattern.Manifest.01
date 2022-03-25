package com.nordic.csf;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConditionalStrategyFactory<U> {

    private final Map<U, Strategy> conditions;

    public ConditionalStrategyFactory() {
        this.conditions = new HashMap<>();
    }

    public Optional<? extends Strategy> getStrategy(U u) {
        return Optional.ofNullable(conditions.get(u));
    }

    public ConditionalStrategyFactory<U> setStrategy(U u, Strategy strategy) {
        this.conditions.put(u, strategy);
        return this;
    }
}
