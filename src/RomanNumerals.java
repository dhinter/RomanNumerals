public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		return 0;
		
	}
	
	public Integer getSingleArabicValue (String singleRomanNum) throws RomanNumeralsException {
		
		String input = singleRomanNum;

		switch(input) {
			case "I": return 1;
			case "V": return 5;
			case "X": return 10;
			case "L": return 50;
			case "C": return 100;
			case "D": return 500;
			case "M": return 1000;
			default: throw new RomanNumeralsException("Invalid Values");
		}
		
	}
	
	//2. Implementation which checks if in input string V,L,D never repeat
	public boolean validateVLD (String romanNumtoCheck) {
		
		if(countChars(romanNumtoCheck,'V') > 1 || countChars(romanNumtoCheck,'L') > 1 || countChars(romanNumtoCheck,'D') > 1) {
			return false;
		}
		else return true;
	}
	
	//2.1 Refactor - Extract Method
	public int countChars (String InputString, Character count_char) {
		int counter = 0;		
		for(int i = 0; i < InputString.length(); i++) {
			char tempChar = InputString.charAt(i);
			if(tempChar == count_char){
				counter++;
			}
		}
		return counter;
	}
	
	//3. Implementation which checks if Symbols 'I','X','C', and'M' only repeats at most 3 times
	public boolean validateRepeatIXCM (String romanNumtoCheck) {
		
		if(countChars(romanNumtoCheck,'I') > 3 || countChars(romanNumtoCheck,'X') > 3 || countChars(romanNumtoCheck,'C') > 3
				|| countChars(romanNumtoCheck,'M') > 3) {
			return false;
		}
		else return true;
	}
	
	//4. Sum up values
	public int sumArabicValues(String RomanNum) throws RomanNumeralsException {
		
		int result = 0;
				
		for(int i = 0; i < RomanNum.length(); i++) {
			String tmpRomanNum = String.valueOf(RomanNum.charAt(i));
			int ArabicNumber = getSingleArabicValue(tmpRomanNum);
			result = result + ArabicNumber;
		}
		return result;
	}
	//5. Substract values
	public int subArabicValues(String RomanNum) throws RomanNumeralsException {
		
		int result = 0;
		
		/*
		if(RomanNum.length()>2){
			throw new RomanNumeralsException("Invalid Input");
		}*/

				
		for(int i = 0; i < RomanNum.length(); i++) {
			String tmpRomanNum = String.valueOf(RomanNum.charAt(i));
			int ArabicNumber = getSingleArabicValue(tmpRomanNum);
			result = result + ArabicNumber;
		}
		return result;
	}
}

