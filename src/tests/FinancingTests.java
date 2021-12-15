package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void contructorShouldCreateObjectWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());

	}

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});

	}

	@Test
	public void setTotalAmountShouldUpdateDataWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		f.setTotalAmount(90000.0);

		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			f.setTotalAmount(110000.0);
		});

	}

	@Test
	public void setIncomeShouldUpdateValueWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		f.setIncome(2100.0);

		Assertions.assertEquals(2100.0, f.getIncome());

	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			f.setIncome(1900.0);
		});

	}

	@Test
	public void setMonthShouldUpdateValueWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		f.setMonths(81);

		Assertions.assertEquals(81, f.getMonths());

	}

	@Test
	public void setMonthShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			f.setMonths(79);
		});

	}

	@Test
	public void entryShouldCalculateEntryCorrectly() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(20000.0, f.entry());
	}

	@Test
	public void quotaShouldCalculateInstallmentCorrectly() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(1000.0, f.quota());
	}

}
