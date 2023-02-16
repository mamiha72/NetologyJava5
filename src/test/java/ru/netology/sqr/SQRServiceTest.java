package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    /*  @Test
              public void shoudSQRCalcCrashTest() {
                  SQRService service = new SQRService();

                  int expected = 2;
                  int actual = service.calcSqr(200, 300);

                  Assertions.assertEquals(expected, actual);
              }

     */
    @Test
    public void SQRCalcTest() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);

    }
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqrparam.csv")

    public void SQRCalcParamTest(int expected, int spanBeginning, int spanEnding) {
        SQRService service = new SQRService();

    }
}
