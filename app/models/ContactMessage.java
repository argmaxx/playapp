package models;

public class ContactMessage 
{
    public String name;
    public String email;
    public String phone;
    public String message;
    //public boolean consent;

    public String validate() {
    	if (name.isEmpty() && email.isEmpty() && phone.isEmpty()) {
                return "Please provide your information";
        }
        if (name.isEmpty()) {
                return "Please provide your full name";
        }
        if (email.isEmpty()) {
                return "Please provide your email address";
        }
        if (phone.isEmpty()) {
                return "Please provide your phone number";
        }
        if (! email.contains("@") || ! email.contains(".") || email.endsWith("@") || email.endsWith(".")) {
                return "Please provide a valid email address";
        }
        if (email.trim().contains(" ")) {
                return "Email address has invalid spaces";
        }
        return null;
    }
    
    public String toString() {
		String content = "Name: " + name + "\n";
		content += "Email: " + email + "\n";
		content += "Phone: " + phone + "\n";
		content += "Message: \n" + message + "\n";
		//content += "Newsletter consent: " + consent + "\n";
		return content;
    }
}
