package ru.netology.domain;

public class Radio {
    private int currentNumberRadioStation;
    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = 10;
    private int currentNumberVolume;
    private int minNumberVolume = 0;
    private int maxNumberVolume = 100;

    public Radio() {
    }

    public Radio(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }


    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int currentNumberRadioStation) {
        if (currentNumberRadioStation < minNumberRadioStation) {
            return;
        }
        if (currentNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        this.currentNumberRadioStation = currentNumberRadioStation;
    }

    public void setCurrentNumberVolume(int currentNumberVolume) {
        if (currentNumberVolume < minNumberVolume) {
            return;
        }
        if (currentNumberVolume > maxNumberVolume) {
           return;
        }
        this.currentNumberVolume = currentNumberVolume;
    }

       public int getMaxNumberVolume() {
        return maxNumberVolume;
    }

    public int getMinNumberVolume() {
        return minNumberVolume;
    }

    public int getCurrentNumberVolume() {
        return currentNumberVolume;
    }

    public void increaseNumberRadioStation() {
        if (currentNumberRadioStation == maxNumberRadioStation) {
            this.currentNumberRadioStation = minNumberRadioStation;
        } else {
            currentNumberRadioStation++;
        }

    }

      public void increaseNumberVolume() {
        if (currentNumberVolume < maxNumberVolume) {
            currentNumberVolume++;
        }

        }


    public void decreaseNumberRadioStation() {
        if (currentNumberRadioStation == minNumberRadioStation) {
            this.currentNumberRadioStation = maxNumberRadioStation;
        } else {
            currentNumberRadioStation--;
        }
    }


    public void decreaseVolume() {
        if (currentNumberVolume > minNumberVolume) {
            currentNumberVolume--;
        }
    }


}




























