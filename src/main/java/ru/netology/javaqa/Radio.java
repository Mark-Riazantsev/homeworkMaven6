package ru.netology.javaqa;

public class Radio {
    private int maxRadioStation;
    int countRadioStation;
    int currentRadioStation;
    int currentVolume;

    public Radio(int countRadioStation) {

        this.maxRadioStation = countRadioStation - 1;
    }

    public Radio() {
        this.maxRadioStation = 9;
    }

    public void nextRadioStation() {
        if (currentRadioStation != maxRadioStation) {
            currentRadioStation++;
            return;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {

        if (currentRadioStation != 0) {
            currentRadioStation--;
            return;
        } else {
            currentRadioStation = maxRadioStation;

        }
    }

    public void nextVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;

        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = maxRadioStation;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            newCurrentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;


    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }
}