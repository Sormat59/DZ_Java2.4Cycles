package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long avgSalesInMonth(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public long findMonthMaxSales(long[] sales) {
        long currentMax = sales[0];
        int month = 1;
        int maxMonth = 0;
        for (long sale : sales) {
            if (sale >= currentMax) {
                currentMax = sale;
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public long findMonthMinSales(long[] sales) {
        long currentMin = sales[0];
        int month = 1;
        int minMonth = 0;
        for (long sale : sales) {
            if (sale <= currentMin) {
                currentMin = sale;
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public long findMonthsMinAvgSales(long[] sales) {
        long currentMin = sales[0];
        int month = 0;
        int sumMinAvgMonth = 0;
        for (long sale : sales) {
            if (sale < avgSalesInMonth(sales)) {
                month = month + 1;
                sumMinAvgMonth = month;
            }
        }
        return sumMinAvgMonth;
    }

    public long findMonthsMaxAvgSales(long[] sales) {
        long currentMax = sales[0];
        int month = 0;
        int sumMaxAvgMonth = 0;
        for (long sale : sales) {
            if (sale > avgSalesInMonth(sales)) {
                month = month + 1;
                sumMaxAvgMonth = month;
            }
        }
        return sumMaxAvgMonth;
    }


}
