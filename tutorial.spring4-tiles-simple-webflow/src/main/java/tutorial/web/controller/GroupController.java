package tutorial.web.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tutorial.web.domain.ContactForm;
import tutorial.web.domain.EmailGroupForm;

@Controller
public class GroupController {
	
	private Map<String, List<ContactForm>> cache = new HashMap<>();
	
	@Autowired
	private HttpServletRequest request;
	
	public EmailGroupForm initializeForm(){
		EmailGroupForm emailGroupForm = new EmailGroupForm();
		return emailGroupForm;
	}

	public ContactForm createNewContact(){
		ContactForm contactForm = new ContactForm();
		System.out.println("the contact has an hash=["+contactForm.hashCode()+"]");
		return contactForm;
	}
	
	public EmailGroupForm addContactToGroup(EmailGroupForm form, ContactForm contactForm){
		System.out.println("groupHash is ["+form.hashCode()+"], the contact's hash=["+contactForm.hashCode()+"]");
		System.out.println("the contact to save is ["+contactForm+"]");
		String sessionId = request.getSession().getId();
		System.out.println("session is active ["+sessionId+"]");
		if(cache.containsKey(sessionId)){
			List<ContactForm> lost = cache.get(sessionId);
			lost.add(contactForm);
		}else{
			List<ContactForm> theContactFormList = new ArrayList<>();
			theContactFormList.add(contactForm);
			cache.put(sessionId, theContactFormList);
		};
		form.getContacts().add(contactForm);
		return form;
	}
	
	public void saveEmailGroup(EmailGroupForm group){
		System.out.println("groupHash is ["+group.hashCode()+"], the contact's hash=["+group.getContacts().toArray(new ContactForm[]{})[0].hashCode()+"]");
		System.out.println();
		String sessionId = request.getSession().getId();
		if(cache.containsKey(sessionId)){
			System.out.println("cache contains the datas");
			for(ContactForm theContactForm: cache.get(sessionId)){
				System.out.println(theContactForm);
			}
			cache.clear();
		}
		
		System.out.println("the webflow cache contains the followes datas");
		for(ContactForm contact: group.getContacts()){
			System.out.println(contact);
		}
		System.out.println("save new group: "+group + "]");
	}
}
