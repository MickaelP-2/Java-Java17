package java17.ex07;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import org.junit.Test;

/**
 * Exercice 07 - Instant
 */
public class DateAndTime_07_Test {

	@Test
	public void test_date_to_localdate() throws Exception {

		// TODO Créer une date Java 1 (12/02/2017)
		Date date = new Date((2017-1900),1,12);
		System.out.println("d: "+date.toString());
		// TODO transformer la date en Instant
		Instant instant1 = Instant.ofEpochSecond(3600);//3600 s = 1h
		System.out.println("instant1: "+instant1.toString());
		// TODO transformer la date en LocalDate
		//System.out.println("res: "+date.getDate()+" y: "+(date.getYear()+1900));
		
		LocalDate result = LocalDate.of((date.getYear()+1900),(date.getMonth()+1), date.getDate());
		System.out.println("res?: "+result.toString());
		// TODO valoriser les différentes variables afin de rendre le test passant

		assertThat(result.getYear(), is(2017));
		assertThat(result.getMonth(), is(Month.FEBRUARY));
		assertThat(result.getDayOfMonth(), is(12));

	}
}
