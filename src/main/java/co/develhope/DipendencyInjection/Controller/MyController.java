package co.develhope.DipendencyInjection.Controller;

import co.develhope.DipendencyInjection.Service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService myService;
    public MyController(MyService myService){
        this.myService=myService;
    }
    @GetMapping()
    public String hello(){
        return "Welcome!";
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyController Called!");
        return myService.getName();
    }
}
//define a controller called MyController where you have:
//a private variable MyService
//a constructor
//a mapping to /getName in order to return the result of the getName() method of the MyService variable
//a mapping to default root / that prints a welcome message
//notify the user through the console when a constructor or a method has been called:
//e.g. MyService.getName() has been called
//when you launch and test your application on your localhost, you should see the following calls stack (in this order):
//before calling localhost:[portnumber]:
//MyComponent constructor
//MyService constuctor
//MyController constructor
//after calling localhost:[portnumber]/getName
//MyService.getName()
//MyComponent.getMyComponentName()