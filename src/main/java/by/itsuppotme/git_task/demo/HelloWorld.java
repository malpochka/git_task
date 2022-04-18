package by.itsuppotme.git_task.demo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    @EventListener(ApplicationReadyEvent.class)
    public void hello(){
        System.out.println("Hello");
    }
}
