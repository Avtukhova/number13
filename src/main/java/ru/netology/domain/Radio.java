package ru.netology.domain;

public class Radio {
    private int currentNumberRadioStation;
    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = 9;

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void increaseNumberRadioStation() {
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
            return;
        }
         if (currentNumberRadioStation < minNumberRadioStation) {
                currentNumberRadioStation = 9;
         }
         if (currentNumberRadioStation > maxNumberRadioStation) {
               currentNumberRadioStation = 0;
         }
     }
}

