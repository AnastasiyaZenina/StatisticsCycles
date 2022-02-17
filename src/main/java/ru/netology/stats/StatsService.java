package ru.netology.stats;

public class StatsService {
    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAvg(long[] sales) {
        return calculateSum(sales) / sales.length;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
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

    public int aboveAverageSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > (calculateSum(sales) / sales.length)) {
                counter++;
            }
        }
        return counter;
    }

    public int belowAverageSales(long[] sales) {
        int counter= 0;
        for (long sale : sales) {
            if (sale < (calculateSum(sales) / sales.length)) {
                counter++;
            }
        }
        return counter;
    }
}


