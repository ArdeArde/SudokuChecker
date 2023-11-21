import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
String ii = "41736982563215894795872431682543716979158643234691275828964357157329168416487529;";
String iii = "-417369825632158-947958724316825437169791586432346912758289643571573291684164875293";
String iv = "61369825432158947958724316825437169791586432346912758289643571573291684164875293";
String V = "417369825432158947958724316425437169791586432386912758289643571573291684164875293";
SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	
	@Test
	public void testIncorrectString2() {
		int a = v.verify(ii);
		assertEquals("incorrect string", a, 1);
	}
	
	@Test
	public void testIncorrectString3() {
		int a = v.verify(iii);
		assertEquals("incorrect string", a, -1);
	}
	
	@Test
	public void testIncorrectString4() {
		int a = v.verify(iv);
		assertEquals("incorrect string", a, -3);
	}
	
	@Test
	public void testIncorrectString5() {
		int a = v.verify(V);
		assertEquals("incorrect string", a, -4);
	}
	
	
}
