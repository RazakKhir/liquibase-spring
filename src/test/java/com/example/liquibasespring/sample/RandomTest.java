package com.example.liquibasespring.sample;

import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertNotNull;

@Slf4j
public class RandomTest {
    @Test
    @DisplayName("test date conversion")
    void testDateString() throws ParseException {
        Date dateConv = DateFormat.getDateTimeInstance().parse("3/4/23 12:00 AM");
        log.info("DAte: {}", dateConv);
        assertNotNull(dateConv);
    }

    @Test
    @DisplayName("test simpledateformat")
    void testSimpleDate() throws Exception {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        DateTime endDate = new DateTime("2004-12-13T21:39:45.618-08:00");

        String dateFormatFinal = sdf1.format(sdf2.parse(endDate.toString()));
        log.info("date: {}", dateFormatFinal);
        assertNotNull(dateFormatFinal);
    }
}
