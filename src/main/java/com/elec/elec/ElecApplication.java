package com.elec.elec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElecApplication {

	public static void main(String[] args) {
        SpringApplication.run(ElecApplication.class, args);

        int units = 350;
        double bill = calculateBill(units);

        System.out.println("Units consumed: " + units);
        System.out.println("Electricity bill: ₹" + bill);
    }

    public static double calculateBill(int units) {

        if (units < 0) {
            throw new IllegalArgumentException("Units cannot be negative");
        }

        double bill = 0;

        if (units <= 100) {
            bill = units * 1.50;
        }
        else if (units <= 200) {
            bill = (100 * 1.50)
                    + ((units - 100) * 2.50);
        }
        else if (units <= 500) {
            bill = (100 * 1.50)
                    + (100 * 2.50)
                    + ((units - 200) * 4.00);
        }
        else {
            bill = (100 * 1.50)
                    + (100 * 2.50)
                    + (300 * 4.00)
                    + ((units - 500) * 6.00);
        }

        return bill;
    }

}
