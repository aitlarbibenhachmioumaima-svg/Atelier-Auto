package util;

import com.mysql.cj.Session;
import com.mysql.cj.protocol.Message;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import sun.rmi.transport.Transport;

public class EmailSender {

    public static void sendEmail(String toEmail, String newPassword) throws Exception {

        final String fromEmail = "najiazad2000@gmail.com";
        final String appPassword = "lqhcnxrkdzvlrrof"; 

        Properties props = new Properties();

        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
            new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, appPassword);
                }
            });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(fromEmail));
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(toEmail));

        message.setSubject("Reset Password");
        message.setText("Votre nouveau mot de passe est : " + newPassword);

        Transport.send(message);
    }
    }

   