package ru.netology.sqr;

public class SQRService {
    public int calcSqr(int spanBeginning, int spanEnding) {
        int sqrCount = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i <= spanEnding & i * i >= spanBeginning) {
                sqrCount = sqrCount + 1;
            }
        }
        return sqrCount;
    }

}
