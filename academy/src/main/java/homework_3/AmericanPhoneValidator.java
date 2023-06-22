package homework_3;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
	private static final String PHONE_PATTERN = "\\+1\\d{10}";

	public boolean validate(String input) {
		// TODO Auto-generated method stub
		return Pattern.matches(PHONE_PATTERN, input);
	}

}
