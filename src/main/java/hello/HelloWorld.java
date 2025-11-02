package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
		  System.out.println("Hi ! Im Shaheena! The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println("Hi ! Im Shaheena! The current local time is: " + currentTime);
        System.out.println(greeter.sayHello());
    }
}
