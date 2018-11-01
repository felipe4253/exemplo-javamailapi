
public class EmailSender {
	
	public static void main(String[] args) {
		final String fromEmail = "felipe4253@gmail.com";
		final String password = "minhaSenhaSuperSecreta";
		final String toEmail = "felipe4253@gmail.com";
		
		System.out.println("Initializing email send");
		
		EmailConfig config = new EmailConfig();
		
		config.sendEmail(fromEmail, password, toEmail, "Teste", "Isto é um teste com um <p>paragrafo</p>");
	}

}
