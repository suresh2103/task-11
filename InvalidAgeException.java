package task11;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String str) {

		super(str);
	}

	public void ageValidation(int age) {

		try {
			if (age < 18) {

				throw new InvalidAgeException("Your age is less than 18, so you are not eligible to vote");
			}
			else {

				System.out.println("You age is " + age + "so you are not eligible to vote");
			}
		} catch (InvalidAgeException e) {

			e.printStackTrace();
		}
	}

}