package prompto.internet;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import prompto.error.ReadWriteError;
import prompto.utils.Logger;

public class Email {
	
	public static Session DEFAULT_SESSION = null;
	public static Logger logger = new Logger();
	
	String subject = "";
	InternetAddress from = null;
	List<InternetAddress> to = new ArrayList<>();
	List<InternetAddress> cc = new ArrayList<>();
	List<InternetAddress> bcc = new ArrayList<>();
	Multipart content = new MimeMultipart();
	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setFrom(String address) throws AddressException {
		this.from = new InternetAddress(address);
	}

	public void addTo(String address) throws AddressException {
		to.add(new InternetAddress(address));
	}


	public void addCC(String address) throws AddressException {
		cc.add(new InternetAddress(address));
	}

	
	public void addBCC(String address) throws AddressException {
		bcc.add(new InternetAddress(address));
	}

	public void addBody(String body, String mimeType) throws MessagingException {
		mimeType = mimeType + "; charset=\"utf-8\""; 
		BodyPart part = new MimeBodyPart();
		part.setContent(body, mimeType);
		content.addBodyPart(part);
	}
	
	public void send(String hostName, long port, boolean useTLS, String login, String password, boolean useSSL) throws ReadWriteError {
		try {
			doSend(hostName, port, useTLS, login, password, useSSL);
		} catch(Throwable t) {
			logger.error(()->"Failed to send email", t);
			throw new ReadWriteError("Failed to send email");
		}
	}
	
	public void doSend(String hostName, long port, boolean useTLS, String login, String password, boolean useSSL) throws MessagingException {
		if(DEFAULT_SESSION!=null)
			send(DEFAULT_SESSION);
		else {
			if(port==-1)
				port = useTLS ? 587 : 25;
			Properties props = new Properties();
			props.put("mail.smtp.timeout", 1000);
			props.put("mail.smtp.connectiontimeout", 1000);			
			props.put("mail.smtps.timeout", 1000);
			props.put("mail.smtps.connectiontimeout", 1000);
			props.put("mail.smtp.host", hostName);
			props.put("mail.smtp.port", (int)port);
			props.put("mail.smtp.auth", useTLS);
			if(useSSL) {
				props.put("mail.smtp.socketFactory.port", (int)port);
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); 
				
			}
			Authenticator auth = null;
			if(useTLS) {
				props.put("mail.smtp.user", login);
				props.put("mail.smtp.starttls.enable", true); 
				auth = new Authenticator() {
				 @Override protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(login, password);
				 }
				};
			}
			Session session = Session.getInstance(props, auth);
			send(session);
		}
	}

	public void send(Session session) throws MessagingException {
		MimeMessage message = new MimeMessage(session);
		message.setSubject(subject);
		message.setFrom(from);
		for(InternetAddress address : to)
			message.addRecipient(Message.RecipientType.TO, address);
		for(InternetAddress address : cc)
			message.addRecipient(Message.RecipientType.CC, address);
		for(InternetAddress address : bcc)
			message.addRecipient(Message.RecipientType.BCC, address);
		message.setContent(content);
		Transport.send(message);
	}

}
