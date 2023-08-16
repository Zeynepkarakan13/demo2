//package com.example.demo.student;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository){
//        return args ->{
//
////                  Student zeynep =  new Student(
////                            1L,
////                            "Zeynep",
////                            "Zeynep.karakan@gmail.com",
////                            22,
////                            LocalDate.of(2001, Month.SEPTEMBER, 13)
////
////            );
////                  Student ayse = new Student(
////                          2L,
////                          "Ayse",
////                          "Ayse.yilmaz@gmail.com",
////                          23,
////                          LocalDate.of(2000, Month.JULY, 17)
////
////                  );
//                  repository.saveAll(
//                          List.of(zeynep, ayse)
//                  );
//        };
//    }
//}
