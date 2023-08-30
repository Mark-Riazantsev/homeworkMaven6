package ru.netology.javaqa;

public class Radio {

    public int currentRadioStation;

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
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

    public int currentVolume;

    public void nextVolume() {
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

        public int getCurrentVolume () {
            return currentVolume;
        }
        public void setCurrentVolume ( int newCurrentVolume){
            if (newCurrentVolume < 0) {
                return;
            }
            if (newCurrentVolume > 100) {
                newCurrentVolume = 100;
            }
            currentVolume = newCurrentVolume;
        }
    }

