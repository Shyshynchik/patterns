package com.pattern.strategy;

import org.springframework.stereotype.Component;

@Component
public class HolidayPrizeCounter implements PrizeCounter {
    @Override
    public double countPrize(double bet) {
        return bet * 0.2;
    }
}
