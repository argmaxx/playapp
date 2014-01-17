package utils;

import com.typesafe.plugin.*;

import controllers.Application;
import models.ContactMessage;

public class SMTPMailer 
{
	public static void sendContactEmail(ContactMessage contact) 
	{
		MailerAPI mail = play.Play.application().plugin(MailerPlugin.class).email();
		
		mail.setSubject("Contact message from argmaxx.com");
		mail.addFrom("www@argmaxx.com");
		mail.addRecipient("ppr@argmaxx.com");
		mail.addCc(contact.email);
		//mail.setReplyTo(message.email);
		
		Application.log("SMTPMailer: Sending contact email: \n" + contact.toString());
		mail.send(contact.toString());
	}
}

