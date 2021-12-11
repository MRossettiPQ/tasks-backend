package br.ce.wcaquino.taskbackend.utils;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void deveRetornarTrueParaDatasFuturas(){
        LocalDate date = LocalDate.of(2100,12,12);

        Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarFalseParaDatasPassadas(){
        LocalDate date = LocalDate.of(1900,12,10);

        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarTrueParaDatasAtual(){
        LocalDate date = LocalDate.now();

        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }
}
