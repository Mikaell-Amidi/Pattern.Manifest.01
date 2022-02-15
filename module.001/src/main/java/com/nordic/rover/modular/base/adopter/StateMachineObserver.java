package com.nordic.rover.modular.base.adopter;

import com.nordic.rover.modular.base.enums.MachineEvent;
import com.nordic.rover.modular.base.enums.MachineState;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class StateMachineObserver {

    private final StateMachine<MachineState, MachineEvent> stateMachine;

    public void changeState(){
        stateMachine.sendEvent(
                        Mono.just(MessageBuilder
                                .withPayload(MachineEvent.SMC_PREPARE_EVENT).build())).subscribe();
    }
}
