package com.example.springbootsendemail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

	@Autowired
    private final JavaMailSender javaMailSender;

    public EmailSenderService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(String to, String subject, String text){
        System.out.println("sending email...");
        String email = "";
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom(email);
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(text);
        javaMailSender.send(message);

        System.out.println("email successfully sent.");
    }
}