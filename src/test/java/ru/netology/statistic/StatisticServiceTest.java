package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void shouldForeach() {
        int[] purchases = {1_000, 2_000, 500, 5_000, 2_000};

        for (int testItem : purchases) {
            System.out.println("3");
            System.out.println(testItem);
            
        }

        for (int purchase : purchases) {
            System.out.println("2");
            System.out.println(purchase);
            
        }

        for (int item : purchases) {
            System.out.println(item);
            System.out.println("1");
        }
    }


    @Test
    void shouldCalculate() {
        int[] purchases = {1_000, 2_000, 500, 5_000, 2_000};

        StatisticService service = new StatisticService();
        int actual = service.calculateSum(purchases);

        int expected = 10_500;
        assertEquals(expected, actual);

    }

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] purchases = {1_000, 2_000, 500, 5_000, 2_000};
        long expected = 5_000;

        long actual = service.findMax(purchases);

        assertEquals(expected,actual);
    }

}