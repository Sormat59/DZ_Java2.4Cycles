package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSumSales() {
        StatsService service = new StatsService();
        long [] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAvgSum() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.avgSalesInMonth(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthMaxSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMonthMaxSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthMinSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMonthMinSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthsMinAvgSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.findMonthsMinAvgSales(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMonthsMaxAvgSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.findMonthsMaxAvgSales(allSales);
        assertEquals(expected, actual);
    }
}