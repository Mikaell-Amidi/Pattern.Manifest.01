package com.nordic.rover.modular.base.config.machine;


import com.nordic.rover.modular.base.adopter.StateMachineAdopter;
import com.nordic.rover.modular.base.config.inspector.ApplicationContextInspector;
import com.nordic.rover.modular.base.enums.MachineEvent;
import com.nordic.rover.modular.base.enums.MachineState;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import java.util.EnumSet;


@Configuration
@EnableStateMachine
public class StateMachineConfig extends StateMachineConfigurerAdapter<MachineState, MachineEvent> {

    private final ApplicationContextInspector contextInspector;

    public StateMachineConfig(ApplicationContextInspector contextInspector) {
        this.contextInspector = contextInspector;
    }

    @Override
    public void configure(StateMachineStateConfigurer<MachineState, MachineEvent> states) throws Exception {
        states.withStates()
                .initial(MachineState.SMC_INITIALIZED)
                .states(EnumSet.allOf(MachineState.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<MachineState, MachineEvent> transitions) throws Exception {
        transitions
                .withExternal()
                .source(MachineState.SMC_INITIALIZED)
                .target(MachineState.SMC_PREPARED)
                .event(MachineEvent.SMC_PREPARE_EVENT)
                .and()
                .withExternal()
                .source(MachineState.SMC_INITIALIZED)
                .target(MachineState.SMC_PURGED)
                .event(MachineEvent.SMC_PURGE_EVENT)
                .action(o -> contextInspector.destroy());

    }

    @Override
    public void configure(StateMachineConfigurationConfigurer<MachineState, MachineEvent> config) throws Exception {
        config.withConfiguration()
                .autoStartup(true)
                .listener(new StateMachineAdopter());
    }


}
