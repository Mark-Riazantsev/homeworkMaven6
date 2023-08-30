package ru.netology.javaqa;

public class Radio {

    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9 && currentRadioStation != 0) {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {

        if (currentRadioStation > 0) {
            currentRadioStation--;
        }
        else {
            currentRadioStation = 9;

        }
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
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
        public void nextVolume () {
            if (currentVolume < 100) {
                currentVolume++;
            } else {
                currentVolume = 100;
            }
        }
        public void prevVolume () {
            if (currentVolume > 0) {
                currentVolume--;
            } else {
                currentVolume = 0;


            }
        }
    }

