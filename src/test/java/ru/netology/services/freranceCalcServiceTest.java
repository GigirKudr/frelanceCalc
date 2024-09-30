package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class freranceCalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/frerance.csv")
    public void testFirstPrime(int expected, int incom, int expenses, int threshold) {
        freranceCalcService service = new freranceCalcService();
        int actual = service.calculate(incom, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}
