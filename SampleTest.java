import static org.junit.Assert.*; 

import org.junit.Test;

public class SampleTest {

	@Test
	public void storeValueAndCurrency() {
		MoneyClass money1=new MoneyClass(Currency.PHP, 100, 50);
		String expected1 = "PHP 100.50";
		String result1=money1.toString();
		assertEquals(expected1, result1);
		
		MoneyClass money2=new MoneyClass(Currency.EUR, 200, 75);
		String expected2 = "EUR 200.75";
		String result2=money2.toString();
		assertEquals(expected2, result2);
		
		MoneyClass money3=new MoneyClass(Currency.USD, 30, 52);
		
		
		String expected3 = "USD 30.52";
		String result3=money3.toString();
		assertEquals(expected3, result3);
		
	}
	@Test
	public void operations(){
		MoneyClass money=new MoneyClass(Currency.USD, 50, 72);
		MoneyClass money2 = new MoneyClass(Currency.USD, 20, 85);
		
		money.addition(money2);
		String result=money.toStringsum();
		String expected="USD 71.57";
		assertEquals(expected, result);
		money.subtraction(money2);
		String result1=money.toStringsub();
		String expected1="USD 29.87";
		assertEquals(expected1, result1);
	}
}


