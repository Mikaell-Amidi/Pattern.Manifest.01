package com.nordic.rover.modular.base.adopter;

import com.nordic.rover.modular.base.enums.MachineEvent;
import com.nordic.rover.modular.base.enums.MachineState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;

@Slf4j
public class StateMachineAdopter extends StateMachineListenerAdapter<MachineState, MachineEvent> {

    @Override
    public void stateChanged(State<MachineState, MachineEvent> initState,
                             State<MachineState, MachineEvent> transitedState) {
        log.info("Machine state changed to : {}", transitedState.getId());
    }
}
