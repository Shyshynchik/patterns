package com.pattern.strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(StrategyApplication.class, args);

		var accounting = context.getBean(Accounting.class);
		System.out.println(accounting.countPrize(200, 80000));
		HolidayPrizeCounter holidayPrizeCounter = new HolidayPrizeCounter();
		accounting.setPrizeCounter(holidayPrizeCounter);
		System.out.println(accounting.countPrize(200, 80000));

	}

}
