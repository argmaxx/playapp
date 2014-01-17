package controllers;

import static play.data.Form.form;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import utils.*;
import models.ContactMessage;

public class Application extends Controller 
{
    public static Result index() {
        return ok(index.render(form(ContactMessage.class)));
    }

    public static Result contact() {
    	Form<ContactMessage> contactForm = form(ContactMessage.class).bindFromRequest();
    	if (contactForm.hasErrors()) {
        	Application.log("Bad contact request: " + contactForm.globalError() + "; data = " + contactForm.data());
            return Application.badRequest(index.render(contactForm));
        } 
    	SMTPMailer.sendContactEmail(contactForm.get());
    	return redirect(routes.Application.index());
    }
    
    public static void log(String logMessage) {
    	System.out.println("Argmaxx: " + logMessage);
    }
}
