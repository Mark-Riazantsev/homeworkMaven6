public class Radio {
 public int currentRadioStation;

public int getCurrentRadioStation () {
     return currentRadioStation;
 }
public void setCurrentRadioStation(int newCurrentRadioStation){
    currentRadioStation = newCurrentRadioStation;
}
    public  int currentVolume;
    public void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }
public void decreaseRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
}
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
        }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }

    }
}