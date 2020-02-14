package com.example.GrowthNote;

import com.example.GrowthNote.controllers.UserController;
import com.example.GrowthNote.repositories.UserRepository;
import org.springframework.boot.SpringApplication;

import java.util.Scanner;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
public class GrowthNoteApplication {

    public static void main(String[] args) {
//		SpringApplication.run(GrowthNoteApplication.class, args);

        //----------test UserRepository----------
//		UserRepository userRepository=new UserRepository();
//        String name = "xiaoming";
//        String password = "b3275960d68fda9d831facc0426c3bbc";
//        System.out.println(userRepository.getUserByNameAndPassword(name, password));

        UserController userController = new UserController();
        Boolean isPassIn = false;
        while (!isPassIn){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();
            isPassIn = userController.getUserByNameAndPassword(name, password);
            System.out.println("has user passed in:"+isPassIn);
        }
        System.out.println("进入主页");
    }
}
