import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

public class TestRomanNumerals {

	//1. Roman numerals read correctly
	@Test
	public void testSingleArabicValueI() throws RomanNumeralsException {
		// Arrange
		String input = "I";
		
		// Act
		RomanNumerals rom = new RomanNumerals();
	    int value = rom.getSingleArabicValue(input);
	    
		// Assert
		assertEquals(1,value);
	}
	
	@Test
	public void testSingleArabicValueV() throws RomanNumeralsException {
		// Arrange
		String input = "V";
		
		// Act
		RomanNumerals rom = new RomanNumerals();
	    int value = rom.getSingleArabicValue(input);
	    
		// Assert
		assertEquals(5,value);
	}
	
	@Test
	public void testSingleArabicValueX() throws RomanNumeralsException {
		// Arrange
		String input = "X";
		
		// Act
		RomanNumerals rom = new RomanNumerals();
	    int value = rom.getSingleArabicValue(input);
	    
		// Assert
		assertEquals(10,value);
	}
	
	@Test
	public void testSingleArabicValueL() throws RomanNumeralsException {
		// Arrange
		String input = "L";
		
		// Act
		RomanNumerals rom = new RomanNumerals();
	    int value = rom.getSingleArabicValue(input);
	    
		// Assert
		assertEquals(50,value);
	}
	@Test
	public void testSingleArabicValueC() throws RomanNumeralsException {
		// Arrange
		String input = "C";
		
		// Act
		RomanNumerals rom = new RomanNumerals();
	    int value = rom.getSingleArabicValue(input);
	    
		// Assert
		assertEquals(100,value);
	}
	@Test
	public void testSingleArabicValueD() throws RomanNumeralsException {
		// Arrange
		String input = "D";
		
		// Act
		RomanNumerals rom = new RomanNumerals();
	    int value = rom.getSingleArabicValue(input);
	    
		// Assert
		assertEquals(500,value);
	}
	@Test
	public void testSingleArabicValueM() throws RomanNumeralsException {
		// Arrange
		String input = "M";
		
		// Act
		RomanNumerals rom = new RomanNumerals();
	    int value = rom.getSingleArabicValue(input);
	    
		// Assert
		assertEquals(1000,value);
	}
	@Test (expected = RomanNumeralsException.class)
	public void testSingleArabicValueFalseLetter() throws RomanNumeralsException{
		// Arrange
		String input = "E";
		
		// Act
		RomanNumerals rom = new RomanNumerals();
	    int value = rom.getSingleArabicValue(input);

	}
	@Test (expected = RomanNumeralsException.class)
	public void testSingleArabicValueNumber() throws RomanNumeralsException{
		// Arrange
		String input = "1";
		
		// Act
		RomanNumerals rom = new RomanNumerals();
	    int value = rom.getSingleArabicValue(input);

	}
	//2. Symbols 'V', 'L', and 'D' can never be repeated.
	@Test
	public void testRomanValuesDoubleVV(){
		
		String input = "VV";
		RomanNumerals rom = new RomanNumerals();
	    //Assert
	    assertFalse(rom.validateVLD(input));

	}
	@Test
	public void testRomanValuesDoubleLL(){
		
		String input = "LL";
		RomanNumerals rom = new RomanNumerals();
	    //Assert
	    assertFalse(rom.validateVLD(input));

	}
	@Test
	public void testRomanValuesDoubleDD(){
		
		String input = "DD";
		RomanNumerals rom = new RomanNumerals();
	    //Assert
	    assertFalse(rom.validateVLD(input));

	}
	
	//3. Symbols 'I','X','C', and'M'can	be	repeated at	most 3 times in	a row
	@Test
	public void testRomanValuesRowI4Times(){
		
		String input = "IIII";
		RomanNumerals rom = new RomanNumerals();
	    //Assert
	    assertFalse(rom.validateRepeatIXCM(input));

	}
	@Test
	public void testRomanValuesRowX4Times(){
		
		String input = "XXXXI";
		RomanNumerals rom = new RomanNumerals();
	    //Assert
	    assertFalse(rom.validateRepeatIXCM(input));

	}
	@Test
	public void testRomanValuesRowC4Times(){
		
		String input = "CCCCX";
		RomanNumerals rom = new RomanNumerals();
	    //Assert
	    assertFalse(rom.validateRepeatIXCM(input));

	}
	@Test
	public void testRomanValuesRowM4Times(){
		
		String input = "MMMMC";
		RomanNumerals rom = new RomanNumerals();
	    //Assert
	    assertFalse(rom.validateRepeatIXCM(input));

	}
		
}
