package qestion4;

import java.security.InvalidAlgorithmParameterException;

public class NoteFactory {
	
	public static String printNote(int n) throws InvalidAlgorithmParameterException {
		if(n == 10) {
			Currency currency = new Size1();
			return currency.giveSize();
		}
		else if(n == 100) {
			Currency currency = new Size2();
			return currency.giveSize();
		}
		else if(n == 1000) {
			Currency currency = new Size3();
			return currency.giveSize();
		}
		else {
			throw new InvalidAlgorithmParameterException();
		}
	}

}
