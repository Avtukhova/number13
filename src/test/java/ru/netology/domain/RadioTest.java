package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void increaseNumber() {
        Radio rad = new Radio();

        rad.getIncreaseNumberRadioStation();

        int expected = rad.numberCount++;
        int actual = rad.numberCount - 1;

        assertEquals(expected, actual);


    }

    @Test
    public void NumberRadioStationAboveMax() {
        Radio rad = new Radio();

        rad.getNumberRadioStationAboveMax();

        int expected = rad.minNumberRadioStation;

        int actual = rad.currentNumberRadioStation;

        assertEquals(expected, actual);

    }

    @Test
    public void numberRadioStationLessMin() {
        Radio rad = new Radio();

        rad.getNumberRadioStationLessMin();

        int expected = rad.maxNumberRadioStation;
        int actual = rad.currentNumberRadioStation;

        assertEquals(expected, actual);

    }

    @Test
    public void nextNumberRadioStation() {
        Radio rad = new Radio();

        int currentNumberRadioStation = 0;

        rad.setNextNumberRadioStation();

        int expected = rad.currentNumberRadioStation = 1;
        int actual = rad.currentNumberRadioStation;

        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();

        rad.getIncreaseVolume();

        int expected = rad.numberVolumeCount++;
        int actual = rad.numberVolumeCount - 1;

        assertEquals(expected, actual);

    }

    @Test
    public void NumberVolumeAboveMax() {
        Radio rad = new Radio();

        rad.getNumberVolumeAboveMax();

        int expected = rad.maxNumberVolume;
        int actual = rad.currentNumberVolume;

        assertEquals(expected, actual);

    }

    @Test
    public void numberVolumeLessMin() {
        Radio rad = new Radio();

        rad.getNumberVolumeLessMin();

        int expected = rad.minNumberVolume;
        int actual = rad.currentNumberVolume;

        assertEquals(expected, actual);

    }

    }






