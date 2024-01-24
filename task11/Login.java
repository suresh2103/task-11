package task11;

public class Login {


	String correctPassword;

	public Login(String xyz123) {

		this.correctPassword = correctPassword;
	}

	public void loginFn(String inCorrectPw) throws Exception {

		if (!inCorrectPw.equals(correctPassword)) {

			throw new Exception("Incorrect Password please try again");

		} else {

			System.out.println("Login successful!");
		}
	}

	public static void main(String[] args) {

		
		Login obj = new Login("correct_password");

		try {

			obj.loginFn("Wrong Password");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}