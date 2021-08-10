package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldIncreaseNumberRadioStation1() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(0);

        rad.increaseNumberRadioStation();

        int expected = 1;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberRadioStation2() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(1);

        rad.increaseNumberRadioStation();

        int expected = 2;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberRadioStation3() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(2);

        rad.increaseNumberRadioStation();

        int expected = 3;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberRadioStation4() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(3);

        rad.increaseNumberRadioStation();

        int expected = 4;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberRadioStation5() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(4);

        rad.increaseNumberRadioStation();

        int expected = 5;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberRadioStation6() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(5);

        rad.increaseNumberRadioStation();

        int expected = 6;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void shouldIncreaseNumberRadioStation7() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(6);

        rad.increaseNumberRadioStation();

        int expected = 7;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void shouldIncreaseNumberRadioStation8() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(7);

        rad.increaseNumberRadioStation();

        int expected = 8;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void shouldIncreaseNumberRadioStation9() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(8);

        rad.increaseNumberRadioStation();

        int expected = 9;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void shouldIncreaseNumberRadioStation10() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(9);

        rad.increaseNumberRadioStation();

        int expected = 0;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void shouldIncreaseNumberRadioStationOverMax() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(9);

        rad.increaseNumberRadioStationOverMax();

        int expected = 0;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberRadioStationOverMax2() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(8);

        rad.increaseNumberRadioStationOverMax();

        int expected = 8;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberRadioStationLessMin() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(0);

        rad.increaseNumberRadioStationLessMin();

        int expected = 9;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberRadioStationLessMin2() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(1);

        rad.increaseNumberRadioStationLessMin();

        int expected = 1;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(0);

        rad.increaseNumberVolume();

        int expected = 1;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume1() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(1);

        rad.increaseNumberVolume();

        int expected = 2;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume2() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(2);

        rad.increaseNumberVolume();

        int expected = 3;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume3() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(3);

        rad.increaseNumberVolume();

        int expected = 4;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume4() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(4);

        rad.increaseNumberVolume();

        int expected = 5;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume5() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(5);

        rad.increaseNumberVolume();

        int expected = 6;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume6() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(6);

        rad.increaseNumberVolume();

        int expected = 7;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume7() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(7);

        rad.increaseNumberVolume();

        int expected = 8;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume8() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(8);

        rad.increaseNumberVolume();

        int expected = 9;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume9() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(9);

        rad.increaseNumberVolume();

        int expected = 10;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolume10() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(10);

        rad.increaseNumberVolume();

        int expected = 10;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolumeOverMax() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(10);

        rad.increaseNumberVolumeOverMax();

        int expected = 10;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolumeOverMax2() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(8);

        rad.increaseNumberVolumeOverMax();

        int expected = 8;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolumeLessMin() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(0);

        rad.increaseNumberVolumeLessMin();

        int expected = 0;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNumberVolumeLessMin2() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(3);

        rad.increaseNumberVolumeLessMin();

        int expected = 3;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldMinNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(0);

        rad.getMinNumberRadioStation();

        int expected = 0;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldMaxNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(9);

        rad.getMaxNumberRadioStation();

        int expected = 9;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldMaxNumberVolume() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(10);

        rad.getMaxNumberVolume();

        int expected = 10;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldMinNumberVolume() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(0);

        rad.getMinNumberVolume();

        int expected = 0;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCurrentNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(-1);

        rad.setCurrentNumberRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCurrentNumberRadioStation2() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(10);

        rad.setCurrentNumberRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldMinNumberRadioStation2() {
        Radio rad = new Radio();
        rad.setCurrentNumberRadioStation(0);

        rad.setMinNumberRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentNumberRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCurrentNumberVolume() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(11);

        rad.setCurrentNumberVolume(11);

        int expected = 0;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCurrentNumberVolume2() {
        Radio rad = new Radio();
        rad.setCurrentNumberVolume(-1);

        rad.setCurrentNumberVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentNumberVolume();

        assertEquals(expected, actual);

    }


}






