package io.pivotal.springboot.controller;

/**
 * Created by lei_xu on 5/26/16.
 */
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.stereotype.Controller;
import io.pivotal.springboot.domain.*;


@Controller
public class GreetingController {

	@CrossOrigin
    @MessageMapping("/jsongreet")
    @SendTo("/topic/jsongreetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + message.getName() + "!");
    }

}