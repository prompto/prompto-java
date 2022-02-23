package prompto.internet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.internet.InternetAddress;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.icegreen.greenmail.util.GreenMail;

import prompto.declaration.DeclarationList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Interpreter;
import prompto.utils.BaseParserTest;

public class TestEmail extends BaseParserTest {

	GreenMail greenMail;
	
	@Before
	public void before() throws Exception {
		greenMail = new GreenMail();
		greenMail.start();
		Email.DEFAULT_SESSION = greenMail.getSmtp().createSession();
	}
	
	@After
	public void after() {
		greenMail.stop();
	}
	
	@Test
	public void nativeEmailIsSent() throws Exception {
		Email email = newEmail();
		email.send(Email.DEFAULT_SESSION);
		receiveEmail("abc@xyz.com", received -> {
			assertNotNull(received);
			assertEquals("Hi there général!", received.getSubject());
			Address address = received.getFrom()[0];
			assertEquals("xyz@abc.com", ((InternetAddress)address).getAddress());
			assertEquals("Alain Térieur", ((InternetAddress)address).getPersonal());
			address = received.getRecipients(RecipientType.TO)[0];
			assertEquals("abc@xyz.com", ((InternetAddress)address).getAddress());
			address = received.getRecipients(RecipientType.TO)[1];
			assertEquals("def@xyz.com", ((InternetAddress)address).getAddress());
			address = received.getRecipients(RecipientType.CC)[0];
			assertEquals("cc@xyz.com", ((InternetAddress)address).getAddress());
		});
		receiveEmail("bcc@xyz.com", received -> {
			assertEquals("Hi there général!", received.getSubject());
			// check content
			String contentType = received.getContentType();
			assertTrue(contentType.toLowerCase().startsWith("multipart/mixed;"));
			Multipart content = (Multipart)received.getContent();
			Part body = content.getBodyPart(0);
			contentType = body.getContentType();
			assertTrue(contentType.toLowerCase().startsWith("text/plain"));
			assertEquals("Hello général", body.getContent());
			body = content.getBodyPart(1);
			contentType = body.getContentType();
			assertTrue(contentType.toLowerCase().startsWith("text/html"));
			assertEquals("<html><body>Hello général</body></html>", body.getContent());
		});
	}

	@Test
	public void promptoEmailIsSent() throws Exception {
		Context context = Context.newGlobalsContext();
		DeclarationList decls = parseEResource("libraries/Core.pec");
		decls.register(context);
		decls = parseEResource("libraries/Internet.pec");
		decls.register(context);
		decls = parseOResource("prompto/sendEmail.poc");
		decls.register(context);
		Interpreter.interpretMethod(context, new Identifier("sendEmail"), "");
		receiveEmail("bcc@def.com", received -> {
			assertNotNull(received);
		});
		
	}
	
	
	@Ignore("Contains password!")
	@Test
	public void sendEmailToEric() throws Exception {
		Email.DEFAULT_SESSION = null;
		Context context = Context.newGlobalsContext();
		DeclarationList decls = parseEResource("libraries/Core.pec");
		decls.register(context);
		decls = parseEResource("libraries/Internet.pec");
		decls.register(context);
		decls = parseOResource("prompto/sendEmailToEric.poc");
		decls.register(context);
		Interpreter.interpretMethod(context, new Identifier("sendEmailToEric"), "");
	}

	@FunctionalInterface
	static interface MessageConsumer {
		void accept(Message message) throws MessagingException, IOException;
	}
	
	private void receiveEmail(String email, MessageConsumer consumer) throws MessagingException, IOException {
		greenMail.setUser(email, "password");
		try(var imapStore = greenMail.getImap().createStore()) {
		    imapStore.connect(email, "password");
		    try(var inbox = imapStore.getFolder("INBOX")) {
			    inbox.open(Folder.READ_ONLY);
			    consumer.accept(inbox.getMessage(1));	
		    }
		}
	}

	private Email newEmail() throws Exception {
		Email email = new Email();
		email.setSubject("Hi there général!");
		email.setFrom("xyz@abc.com", "Alain Térieur");
		email.addTo("abc@xyz.com", null);
		email.addTo("def@xyz.com", null);
		email.addCC("cc@xyz.com", null);
		email.addBCC("bcc@xyz.com", null);
		email.addBody("Hello général", "text/plain");
		email.addBody("<html><body>Hello général</body></html>", "text/html");
		return email;
	}
}
