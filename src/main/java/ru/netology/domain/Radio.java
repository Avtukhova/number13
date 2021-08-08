package ru.netology.domain;

public class Radio {
    public int numberRadioStation = 0;
    public int minNumberRadioStation = 0;
    public int maxNumberRadioStation = 9;
    public int numberCount = 0;
    public int currentNumberRadioStation;
    public int numberVolume = 0;
    public int numberVolumeCount = 0;
    public int currentNumberVolume;
    public int minNumberVolume = 0;
    public int maxNumberVolume = 10;
    public int[] numbersRadioStation = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public int[] numbersVolume = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};


    public int getIncreaseNumberRadioStation() {
        for (int numberRadioStation : numbersRadioStation) {
            if (numberRadioStation < 9)
                numberCount++;

        }

        return numberCount - 1;
    }

    public int getNumberRadioStationAboveMax() {
        currentNumberRadioStation = maxNumberRadioStation + 1;
        return minNumberRadioStation;
    }


    public int getNumberRadioStationLessMin() {
           if (currentNumberRadioStation < minNumberRadioStation) {
            currentNumberRadioStation = 9;

        }
        return currentNumberRadioStation;

    }

    public int setNextNumberRadioStation() {
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation = currentNumberRadioStation + 1;

        }
        return currentNumberRadioStation;
    }

    public int getIncreaseVolume() {
        for (int numberVolume : numbersVolume) {
            if (numberVolume < 10)
                numberVolumeCount++;

        }

        return numberVolumeCount - 1;
    }

    public int getNumberVolumeAboveMax() {
        if (currentNumberVolume > maxNumberVolume) {
            currentNumberVolume = 10;
        }
        return currentNumberVolume;

    }

    public int getNumberVolumeLessMin() {
        if (currentNumberVolume < minNumberVolume) {
            currentNumberVolume = 0;

        }
        return currentNumberVolume;

    }

}
















