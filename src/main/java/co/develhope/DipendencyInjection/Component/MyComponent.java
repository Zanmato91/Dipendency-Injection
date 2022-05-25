package co.develhope.DipendencyInjection.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
        private String myComponentName;
        @Autowired
        public void MyComponent(){
            this.myComponentName="Alessandro Marinelli dattebayo!";
        }
        public String getMyComponentName() {
            System.out.println("MyComponent Called!");
        return myComponentName;
    }
}
//define a component called MyComponent where you have:
//an instance string variable called myComponentName
//a constructor that assigns your name to the instance variable
//a method getMyComponentName() that returns the value of myComponentImmutableName

