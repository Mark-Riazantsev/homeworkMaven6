package ru.netology.javaqa;
public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;

    private int countRadioStation = 10;
    private int currentRadioStation = minRadioStation;

    public Radio(int countRadioStation) {

this.countRadioStation = countRadioStation;
this.currentRadioStation = minRadioStation;
    }
    public Radio() {
    }

public int getCurrentRadioStation () {
     return currentRadioStation;
 }
public void setCurrentRadioStation(int newCurrentRadioStation){
    if (newCurrentRadioStation < 0){
        newCurrentRadioStation = 9;
    }
    if (newCurrentRadioStation > 9){
        newCurrentRadioStation = 0;
    }
    currentRadioStation = newCurrentRadioStation;
}


private int minVolume = 0;
private int maxVolume = 100;
private   int currentVolume;


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
    }