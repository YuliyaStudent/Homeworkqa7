package ru.netology.stats;

import static java.lang.Long.sum;

public class StatsService {


    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {

            sum += sales[i];
        }
        return sum;
    }

    public long monthAverage(long[] sales) {

        return sumSales(sales) / 12;

    }

    public int maxSale(long[] sales) {
        int max = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (maxSale <= sales[i]) {
                maxSale = sales[i];
                max = i;
            }
        }
        return max + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthLowerAverage(long[] sales) {
        int counter = 0;
        long average = monthAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int monthHighAverage(long[] sales) {
        int counter = 0;
        long average = monthAverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}