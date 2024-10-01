package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreranceCalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/frerance.csv")
    public void testFirstPrime(int expected, int income, int expenses, int threshold) {
        FreranceCalcService service = new FreranceCalcService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}
