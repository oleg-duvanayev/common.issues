package tutorial.web.api;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(" =============== Session is created ==================");
		se.getSession().setMaxInactiveInterval(10);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(" =============== Session is destroyed ==================");
		
	}

}
