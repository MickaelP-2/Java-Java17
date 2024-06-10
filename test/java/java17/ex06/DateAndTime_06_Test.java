package java17.ex06;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Exercice 06 - Period
 */
public class DateAndTime_06_Test {

    @Test
    public void test_period() throws Exception {

        // TODO Créer une LocalDate au 31/12/2017
        //LocalDate localDate1 = LocalDate.parse("2017-12-31");
        LocalDate localDate1 = LocalDate.of(2017,12,31);
        System.out.println("d1: "+localDate1.toString());
        // TODO Créer une LocalDate au 01/01/2050
        //LocalDate localDate2 = LocalDate.parse("2050-01-01");
        LocalDate localDate2 = LocalDate.of(2050,01,01);
        System.out.println("d2: "+localDate2.toString());
        // TODO créer une période (classe java.time.Period) à entre les 2 précédentes dates
        Period result = Period.between(localDate1, localDate2);//!!Meme format(.parse()ou .of()) de dates
        System.out.println("period: "+result.toString());
        assertThat(result.toTotalMonths(), is(384L));
    }
}
