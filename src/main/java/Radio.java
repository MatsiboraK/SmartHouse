public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStation = 9;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0 || newCurrentRadioStation > maxStation) {
            return;
        } else {
            currentRadioStation = newCurrentRadioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100 || newCurrentVolume < 0) {
            return;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public Radio(int amountStations) {
        this.maxStation = amountStations - 1;
    }

    public Radio() {
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
