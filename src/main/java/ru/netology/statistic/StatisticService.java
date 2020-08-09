package ru.netology.statistic;

public class StatisticService {
    public int calculateSum(int[] array) {
//        начинаем с нуля
        int sum = 0;

        for (int item : array) {

//            аналог sum = sum + item
//            каждый раз прибавляем к текущей сумме новый элемент
            sum += item;

        }
        return sum;
    }


    public long findMax(long[] purchases) {
        long currentMax = purchases[0];

        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }
}
