package tutorial.web.controller;
import org.springframework.stereotype.Controller;

import tutorial.web.domain.ContactForm;
import tutorial.web.domain.EmailGroupForm;

@Controller
public class GroupController {
	
	public EmailGroupForm initializeForm(){
		EmailGroupForm emailGroupForm = new EmailGroupForm();
		return emailGroupForm;
	}
	
	public ContactForm createNewContact(EmailGroupForm form){
		ContactForm contactForm = new ContactForm();
		System.out.println("the contact has an hash=["+contactForm.hashCode()+"]");
		return contactForm;
	}
	
	public EmailGroupForm addContactToGroup(EmailGroupForm form, ContactForm contactForm){
		System.out.println("the target contact has an hash=["+contactForm.hashCode()+"]");
		System.out.println("the contact to save is ["+contactForm+"]");
		form.getContacts().add(contactForm);
		return form;
	}
	
	public void saveEmailGroup(EmailGroupForm group){
		System.out.println("the target contact has an hash=["+group.getContacts().toArray(new ContactForm[]{})[0].hashCode()+"]");
		for(ContactForm contact: group.getContacts()){
			System.out.println(contact);
		}
		System.out.println("save new group: "+group + "]");
	}
}
