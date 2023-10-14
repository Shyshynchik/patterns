package com.pattern.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountingImpl implements Accounting {

    @Setter
    private PrizeCounter prizeCounter;

    @Override
    public double countPrize(int hours, double bet) {
        double prize = 0;
        //Some logic for count salary
        if (hours >= 40 * 4) {
            prize = prizeCounter.countPrize(bet);
        }
        return prize + bet;
    }
}
