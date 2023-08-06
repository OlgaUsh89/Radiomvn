package ru.netology.javaqa;

public class Radio {
    private int number;
    private int volume;

    public int getNumber() {
        return number;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumber(int newNumber) {
        if (newNumber < 0) {
            return;
        }
        if (newNumber > 9) {
            return;
        }
        number = newNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void nextNumberRadio() {
        if (number < 9) {
            number = number + 1;
        } else {
            number = 0;
        }
    }

    public void prevNumberRadio() {
        if (number > 0) {
            number = number - 1;
        } else {
            number = 9;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        } else {
            volume = 100;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
    }

}



