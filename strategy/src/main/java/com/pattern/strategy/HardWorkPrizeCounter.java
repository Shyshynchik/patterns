package com.pattern.strategy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HardWorkPrizeCounter implements PrizeCounter {
    @Override
    public double countPrize(double bet) {
        return bet * 0.05;
    }
}
