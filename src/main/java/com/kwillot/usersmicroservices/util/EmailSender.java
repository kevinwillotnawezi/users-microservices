package com.kwillot.usersmicroservices.util;

public interface EmailSender {
    void sendEmail(String toEmail, String body);
}
