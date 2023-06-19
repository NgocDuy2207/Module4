package com.example.managerbook.utils.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

@Aspect
@Component
public class BorrowAspect {
    private int count = 0;

    @After("execution(* com.example.managerbook.controller.ControllerBorrow.BorrowBookCreate(..))")
    public void logAfterMethodController(JoinPoint joinPoint){
        String nameMethod = joinPoint.getSignature().getName();
        count++;
        System.out.println(nameMethod +": "+ "  date: " + LocalDate.now()+ "  count: " + count);

    }

//    private int visitCount = 0;
//    private static final String LOG_FILE_PATH = "resources/to/logfile";
//
//    @Pointcut("execution(* com.example.managerbook.controller.ControllerBorrow.*(..))")
//    public void logAfterMethodController() {}
//
//    @After("logAfterMethodController()")
//    public void setLogFilePath(JoinPoint joinPoint) {
//        visitCount++;
//        writeLogToFile();
//    }
//
//    private void writeLogToFile() {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.getClass().getClassLoader().getResource(LOG_FILE_PATH).toString()))) {
//            writer.write("Borrow visit logged. Total visits: " + visitCount);
//            writer.newLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


}
