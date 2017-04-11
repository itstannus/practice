package practice;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;



public class SendMail {
	
	private static String from="Tanvi Shinde <tanvishinde92@gmail.com>";
	private static String GMAIL_HOST="smtp.gmail.com";
	private static String userName="tanvishinde92@gmail.com";
	private static String password="Tanmayvi@123";
	
	public static void main(String args[]){
		String to[]={"vaishali.namdeo@synechron.com"
				};
		String cc[]=null;
		String subject ="Java Developer 2+ years experience CV : Application for Job opportunity in Pune";
		String bodyText="<html><body><p>Hello Sir/Madam,&nbsp;</p>"
				+ "<p>&nbsp;</p>"
				+ "<p>&nbsp;</p>"
				+ "<p>I am Tanvi Shinde. I have completed my Bachelor's in Engineering, Computer Science From MIT College of Engineering, Pune.&nbsp;</p>"
				+ "<p>&nbsp;</p>"
				+ "<p>Since a year,I have been working in Adtech domain with Personagraph (an Intertrust comapny) and have delivered various product features on PG Axis platform.&nbsp; As part of this, I have been able to acquire proficiency in latest technologies which includes Core java, Collections, Multithreading, Design patterns,REST APIs, DropWizard, Maven, Liquibase, Apache Kafka, Apache Spark, Redis, ElasticSearch .</p>"
				+ "<p>&nbsp;</p>"
				+ "<p>I have a year of experience working in Infosys as a System Engineer, during which I worked on an internal Business Intelligence&nbsp;</p>"
				+ "<p>project called InfyTV that involved data analysis. The results were used by managers to infer about the product&nbsp;</p>"
				+ "<p>offerings of InfyTV. I have also worked on testing an archival project for one of the clients of Infosys, which consisted of archiving&nbsp;</p>"
				+ "<p>data from Terdata to RainStor , consisting of Informatica workflows, using Unix.</p>"
				+ "<p>&nbsp;</p>"
				+ "<p>I did my internship at BMC Software India Pvt Ltd, Pune where I worked to make a Multi-Media (Audio-Video) enabled ITSM app for&nbsp;</p>"
				+ "<p>mobile phones using android which provided interactive platform for raising and resolving internal BMC incidents.&nbsp;</p>"
				+ "<p>This helped BMC softwares in incident detection and resolution</p>"
				+ "<p>&nbsp;</p>"
				+ "<p>I am good at Core Java, Data Structures &amp; Algorithm and applying logic. I am a quick learner, flexible and have a passion towards&nbsp;</p>"
				+ "<p>developing applications.</p>"
				+ "<p>&nbsp;</p>"
				+ "<p>Please let me know of any suitable&nbsp;job&nbsp;opening for your esteemed organization so that I could be a part of the firm's outstanding&nbsp;</p>"
				+ "<p>journey towards being the best.</p>"
				+ "<p>&nbsp;</p>"
				+ "<p>Please find attached my CV and cover letter. Have a nice day!</p>"
				+ "<p>&nbsp;</p>"
				+ "<div>"
				+ "<div class=\"m_7045576269648714904gmail_signature\">"
				+ "<div dir=\"ltr\">"
				+ "<div>Thank you. Have a nice day!</div>"
				+ "<div>&nbsp;</div>"
				+ "<div>Regards,&nbsp;</div>"
				+ "<div class=\"yj6qo ajU\">&nbsp;</div>"
				+ "<div>Tanvi Shinde&nbsp;</div>"
				+ "<div>+91 9527433373</div>"
				+ "<div>+91 8879226647</div>"
				+ "<div><a href=\"https://in.linkedin.com/in/tanvi-shinde-72a40320\" target=\"_blank\" data-saferedirecturl=\"https://www.google.com/url?hl=en&amp;q=https://in.linkedin.com/in/tanvi-shinde-72a40320&amp;source=gmail&amp;ust=1490797677367000&amp;usg=AFQjCNFouoPcxwmPRGiT6VgGKwetR8w6yA\">https://in.linkedin.com/in/tanvi-shinde-72a40320</a></div>"
				+ "<div><a href=\"https://www.hackerrank.com/itstannus1\" target=\"_blank\" data-saferedirecturl=\"https://www.google.com/url?hl=en&amp;q=https://www.hackerrank.com/itstannus1&amp;source=gmail&amp;ust=1490797677367000&amp;usg=AFQjCNEwnQ1NMckyFpOgjbKoxEh5DbsBGg\">https://www.hackerrank.com/itstannus1</a></div>"
				+ "</div>"
				+ "</div>"
				+ "</div></body></html>";
		final String attachments[]={"/Users/tanvi/Documents/Tanvi/cover_letter.docx","/Users/tanvi/Documents/Tanvi/TANVI_SHINDE_CV_NEW.docx"};
		send(to, cc, subject, bodyText, attachments);
	}
	
	public static void send(final String to[], final String cc[],
			final String subject, final String bodyText, final String attachments[]) {     
		System.out.println("Sending mail to - " + Arrays.toString(to) + " with attachments - " + Arrays.toString(attachments));
		// SUBSTITUTE YOUR EMAIL ADDRESSES HERE!!!
		
			 Properties props = new Properties();  
			   props.put("mail.smtp.host",GMAIL_HOST);  
			   props.put("mail.smtp.auth", "true"); 
			   props.put("mail.smtp.starttls.enable","true");
			   props.put("mail.smtp.port","587");
			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
					return new javax.mail.PasswordAuthentication(userName, password);
				}
			});
			InternetAddress[] addressTo = new InternetAddress[1];//one mail to one email id at a time
			try{
				
				for (int i = 0; i < to.length; i++) {
					if(to[i] != null && !"".equals(to[i].trim())){
						
							
						
							// Instantiate a message
							Message msg = new MimeMessage(session);
				
							// Set message attributes
							msg.setFrom(new InternetAddress(from));
							
							addressTo[0] = new InternetAddress(to[i]);
							
							msg.setRecipients(Message.RecipientType.TO, addressTo);
		//					// if cc has addresses
		//					if (cc != null) {
		//						InternetAddress[] addressCc = new InternetAddress[cc.length];
		//						for (int i = 0; i < cc.length; i++) {
		//							if(cc[i] != null && !"".equals(cc[i].trim())){
		//								addressCc[i] = new InternetAddress(cc[i]);
		//							}
		//							
		//						}
		//						msg.addRecipients(Message.RecipientType.CC, addressCc);
		//					}
				
							msg.setSubject(subject);
							msg.setSentDate(new Date());
							Multipart mp = new MimeMultipart();
							if (attachments != null) {
								for (String fileName : attachments) {
									addAttachment(mp, fileName);
									
								}
							}
							
							setEmailBody(mp, bodyText);
							msg.setContent(mp);
							msg.saveChanges();
							Transport.send(msg);
							System.out.println("Email send successfully to "+ to[i]);
						
					}
				}
			}
			catch(MessagingException mex){
				System.out.println("Issue in mail id :"+addressTo[0]);
				mex.printStackTrace();
				// Prints all nested (chained) exceptions as well
				System.out.println(mex.getMessage()+"---"+mex);
				// How to access nested exceptions
				while (mex.getNextException() != null) {
					// Get next exception in chain
					Exception ex = mex.getNextException();
					System.out.println(mex.getMessage()+"---"+ mex);
					if (!(ex instanceof MessagingException))
						break;
					else
						mex = (MessagingException) ex;
				}
			}
			System.out.println("All mails sent successfully");
		
	}
	private static void addAttachment(Multipart multipart, String filename) throws MessagingException {
		DataSource source = new FileDataSource(filename);
		BodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setDataHandler(new DataHandler(source));
		try{
			String attachmentName=filename.substring(filename.lastIndexOf(File.separator) + 1);
			messageBodyPart.setFileName(URLDecoder.decode(attachmentName,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error while decoding file name while sending email");
			e.printStackTrace();
		}
		
		multipart.addBodyPart(messageBodyPart);
	}

	// Set a file as an attachment. Uses JAF FileDataSource.
		private static void setEmailBody(Multipart multipart, String content) throws MessagingException {

			// Create and fill first part
			MimeBodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setDataHandler(new DataHandler(new HTMLDataSource(content)));
			multipart.addBodyPart(messageBodyPart);
		}
		
		/*
		 * Inner class to act as a JAF datasource to send HTML e-mail content
		 */
		private static  class HTMLDataSource implements DataSource {
			private String html;

			public HTMLDataSource(String htmlString) {
				html = htmlString;
			}

			// Return html string in an InputStream.
			// A new stream must be returned each time.
			public InputStream getInputStream() throws IOException {
				if (html == null)
					throw new IOException("Null HTML");
				return new ByteArrayInputStream(html.getBytes());
			}

			public OutputStream getOutputStream() throws IOException {
				throw new IOException("This DataHandler cannot write HTML");
			}

			public String getContentType() {
				return "text/html";
			}

			public String getName() {
				return "JAF text/html dataSource to send e-mail only";
			}
		}

}
