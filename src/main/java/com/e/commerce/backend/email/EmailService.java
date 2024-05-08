package com.e.commerce.backend.email;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService implements EmaillSender{
    private final JavaMailSender mailSender;
    private  final static Logger LOGGER = LoggerFactory.getLogger(EmailService.class);
    @Override
    @Async
    public void send(String to, String email) throws IllegalAccessException {
        try{
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
            helper.setText(email,true);
            helper.setTo(to);
            helper.setSubject("Confirm you email.");
            helper.setFrom("brewihogora23@gmail.com");
            mailSender.send(mimeMessage);
        }catch (MessagingException e){
            LOGGER.error("Failed to send email,", e);
            throw new IllegalAccessException("failed to send email");
        }
    }
}
