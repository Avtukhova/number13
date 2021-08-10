package ru.netology.domain;

public class Radio {
    public int minNumberRadioStation = 0;
    public int maxNumberRadioStation = 9;
    public int currentNumberRadioStation;
    public int currentNumberVolume;
    public int minNumberVolume = 0;
    public int maxNumberVolume = 10;


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

    public void setMinNumberRadioStation(int minNumberRadioStation) {
        this.minNumberRadioStation = minNumberRadioStation;
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

    public void increaseNumberRadioStationOverMax() {
        if (currentNumberRadioStation == maxNumberRadioStation) {
            this.currentNumberRadioStation = minNumberRadioStation;
        }

    }

    public void increaseNumberRadioStationLessMin() {
        if (currentNumberRadioStation == minNumberRadioStation) {
            this.currentNumberRadioStation = maxNumberRadioStation;
        }

    }

    public void increaseNumberVolume() {
        if (currentNumberVolume < maxNumberVolume) {
            currentNumberVolume++;
        }

    }

    public void increaseNumberVolumeOverMax() {
        if (currentNumberVolume == maxNumberVolume);
        {
            return;
        }

    }

    public void increaseNumberVolumeLessMin() {
        if (currentNumberVolume == minNumberVolume);
        {
            return;
        }

    }


}


























