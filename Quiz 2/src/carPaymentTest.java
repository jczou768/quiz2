import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class carPaymentTest {

	@Test
	void test1() {
		carPayment car = new carPayment(35000,0,60,.1);
		assertEquals(743.65,car.monthlyPayment(),2);
		assertEquals(9618.79,car.totalInterest(),2);
	}
	@Test
	void test2() {
		carPayment car = new carPayment(40000,5000,72,.02);
		assertEquals(516.27,car.monthlyPayment(),2);
		assertEquals(2171.11,car.totalInterest(),2);
	}
}
