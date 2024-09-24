package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
    //localhost:5900/greet
    @GetMapping("/greet")
    public GreetResponse greet(){

        GreetResponse response = new GreetResponse(
                "Hello",
                List.of("Java", "Golang", "Javascript"),
                new Person("Banna", 25, 1000)
        );
        return response;
    }

    record Person (String name, int age, double savings){

    }

    record GreetResponse(
            String greeting,
            List<String> favProLanguages,
            Person person
    ){}

//    class GreetResponse{
//        private String greeting;
//
//
//        GreetResponse(String greeting) {
//            this.greeting = greeting;
//        }
//
//        public String getGreeting() {
//            return greeting;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{" +
//                    "greeting='" + greeting + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greeting, that.greeting);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hashCode(greeting);
//        }
//    }

}
