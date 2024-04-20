package com.example.Securitate.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{

              Student Mariam   =    new Student(
                                "Mariam",
                                "mariam.jamal@gmail.com",
                                LocalDate.of(2000, Month.AUGUST,20));

            Student Ionel   =  new Student("Ionel",
                    "Ionel.Cazacu@gmail.com",
                    LocalDate.of(2002, Month.AUGUST,1));


//            repository.saveAll(
//                    List.of(Mariam, Ionel)
//            );

        };

    }
}
