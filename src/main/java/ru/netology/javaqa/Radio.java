package ru.netology.javaqa;

public class Radio {
    private final int minRadioStation = 0;
    private final int maxRadioStation = 9;

    private int currentRadioStation = minRadioStation;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume;

    public Radio(int countRadioStation) {

        this.currentRadioStation = minRadioStation;
    }

    public Radio() {
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;


    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }
}