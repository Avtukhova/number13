package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void increaseNumber() {
        Radio rad = new Radio();

        rad.setIncreaseNumberRadioStation();

        int expected = rad.numberCount++;
        int actual = rad.numberCount - 1;

        assertEquals(expected, actual);

    }

    @Test
    public void NumberRadioStationAboveMax() {
        Radio rad = new Radio();

        rad.setNumberRadioStationAboveMax();

        int expected = rad.currentNumberRadioStation = 0;
        int actual = rad.currentNumberRadioStation;

        assertEquals(expected, actual);

    }

    @Test
    public void setNumberRadioStationLessMin() {
        Radio rad = new Radio();

        rad.setNumberRadioStationLessMin();

        int expected = rad.currentNumberRadioStation = 9;
        int actual = rad.currentNumberRadioStation;

        assertEquals(expected, actual);

    }

    @Test
    public void setNextNumberRadioStation() {
        Radio rad = new Radio();

        int currentNumberRadioStation = 0;

        rad.setNextNumberRadioStation();

        int expected = rad.currentNumberRadioStation = 1;
        int actual = rad.currentNumberRadioStation;

        assertEquals(expected, actual);

    }

    }






