package ru.netology.domain;

public class Radio {
    public int numberRadioStation = 0;
    public int minNumberRadioStation = 0;
    public int maxNumberRadioStation = 9;
    public int numberCount = 0;
    public int currentNumberRadioStation;
    public int[] numbersRadioStation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


    public int setIncreaseNumberRadioStation() {
        for (int numberRadioStation : numbersRadioStation) {
            if (numberRadioStation < 9)
                numberCount++;

        }

        return numberCount - 1;
    }

    public int setNumberRadioStationAboveMax() {
        if (currentNumberRadioStation > maxNumberRadioStation) {
            currentNumberRadioStation = 0;

        }
        return currentNumberRadioStation;

    }

    public int setNumberRadioStationLessMin() {
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

    }
















