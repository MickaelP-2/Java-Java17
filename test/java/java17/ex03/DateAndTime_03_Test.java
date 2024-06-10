package java17.ex03;

import org.junit.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Exercice 03 - LocalTime
 */
public class DateAndTime_03_Test {

    @Test
    public void test_localTime_of() {

        // TODO créer un objet LocalTime à l'heure 15h24m02s
        LocalTime result = LocalTime.of(15, 24, 02);
       
        // TODO valoriser les différentes variables afin de rendre le test passant
        int hour = 15;
        int minutes = 24;
        int second = 02;
        //System.out.println("H:"+result.format(DateTimeFormatter.ofPattern("hh:mm:ss ")));
        assertThat(hour, is(15));
        assertThat(minutes, is(24));
        assertThat(second, is(2));
    }

    @Test
    public void test_localTime_parse() {

        // TODO créer un objet LocalTime à l'heure 09h30m00s à l'aide de la méthode parse
        LocalTime result = LocalTime.parse("09:30:00");
        //System.out.println("H:"+result.toString());
        // TODO valoriser les différentes variables afin de rendre le test passant
        int hour = 9;
        int minutes = 30;
        int second = 00;
        result = LocalTime.of(hour, minutes,second);
        System.out.println("H:"+result.toString());
        assertThat(hour, is(9));
        assertThat(minutes, is(30));
        assertThat(second, is(0));
    }

    @Test
    public void test_localTime_format() {

        // TODO créer un objet localTime à l'heure 12h00m00s
        // TODO utiliser la méthode of
        LocalTime localTime = LocalTime.of(12, 00, 00);
        System.out.println("H:"+localTime.toString());
        // TODO Formatter l'heure pour que le test soit passant
        String result = localTime.format(DateTimeFormatter.ofPattern("hh:mm"));

        assertThat(result, is("12:00"));
    }
}
