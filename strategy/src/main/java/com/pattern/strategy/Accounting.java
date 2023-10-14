package com.pattern.strategy;

public interface Accounting {
    void setPrizeCounter(PrizeCounter prizeCounter);

    double countPrize(int hours, double bet);

}
