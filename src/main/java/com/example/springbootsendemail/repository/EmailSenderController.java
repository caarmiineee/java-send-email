package com.example.springbootsendemail.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootsendemail.service.EmailSenderService;

@RestController
@RequestMapping("/send")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @GetMapping("/email")
    public void sendEmail(){
    	String email = "";
        emailSenderService.sendEmail(email,"Hey there!", "Test");
    }

}