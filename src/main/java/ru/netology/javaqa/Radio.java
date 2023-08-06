package ru.netology.javaqa;

public class Radio {
    private int currentNumber = 10;
    private int currentVolume;
    private int maxCurrentStation = 9;
    private int minCurrentStation = 0;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;

    public Radio(int currentNumber) {
        this.currentNumber = currentNumber;
        this.maxCurrentStation = currentNumber - 1;
    }

    public Radio() {

    }

    public int getCurrentNumber() {

        return currentNumber;
    }

    public int getMaxCurrentStation() {

        return maxCurrentStation;
    }

    public int getMinCurrentStation() {

        return minCurrentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }

    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < minCurrentStation) {
            return;
        }
        if (newCurrentNumber > maxCurrentStation) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextCurrentNumber() {
        if (currentNumber < maxCurrentStation) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = minCurrentStation;
        }
    }

    public void prevCurrentNumber() {
        if (currentNumber > minCurrentStation) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxCurrentStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxCurrentVolume;
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minCurrentVolume;
        }
    }
}
