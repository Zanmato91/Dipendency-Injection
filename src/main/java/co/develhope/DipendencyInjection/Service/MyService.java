package co.develhope.DipendencyInjection.Service;

import co.develhope.DipendencyInjection.Component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent myComponent;
    public MyService(MyComponent myComponent){
        this.myComponent=myComponent;
    }
    public String getName(){
        System.out.println("MyService called!");
        return myComponent.getMyComponentName();
    }
}
//define a service called MyService where you have:
//a private variable MyComponent
//a constructor where you apply constructor-based dependency injection
//a method getName() that calls and returns getMyComponentName()

