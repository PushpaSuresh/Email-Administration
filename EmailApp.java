package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Pushpa","Suresh");
		
		em1.setAlternateEmail("alternative email:ps@gmail.com");
		System.out.println(em1.getAlternateEmail());
		
		System.out.println(em1.showInfo());

	}

}
