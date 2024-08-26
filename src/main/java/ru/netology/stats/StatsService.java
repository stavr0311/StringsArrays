package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSalesAmount(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMaximum] <= sales[i]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int monthlySalesBelowAverage(long[] sales) {
        int counter = 0;
        long average = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int monthOfSalesAboveAverage(long[] sales) {
        int counter = 0;
        long average = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }

}


