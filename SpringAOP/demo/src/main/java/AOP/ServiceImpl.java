package AOP;

import org.springframework.stereotype.Component;

@Component
public class ServiceImpl {

    public void Speak(){
        System.out.println("Hello World");
    }

}
