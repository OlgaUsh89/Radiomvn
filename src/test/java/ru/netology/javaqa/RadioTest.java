package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldViewStation() {
        Radio radio = new Radio(9);

        Assertions.assertEquals(9, radio.getCurrentNumber());
    }

    @Test
    public void shouldViewForward() {
        Radio radio = new Radio(-1);

        Assertions.assertEquals(0, radio.getMinCurrentStation());
    }

    @Test
    public void shouldViewStation2() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(9, radio.getMaxCurrentStation());
    }

    @Test
    public void shouldSwitchStationNext() {
        Radio radio = new Radio();
        radio.setCurrentNumber(radio.getMaxCurrentStation());
        radio.nextCurrentNumber();
        int expected = radio.getMinCurrentStation();
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationNext2() {
        Radio radio = new Radio();
        radio.setCurrentNumber(6);
        radio.nextCurrentNumber();

        Assertions.assertEquals(7, radio.getCurrentNumber());
    }

    @Test
    public void shouldSwitchPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentNumber(radio.getMinCurrentStation());
        radio.prevCurrentNumber();
        int expected = radio.getMaxCurrentStation();
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchPrevStation2() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        radio.prevCurrentNumber();

        Assertions.assertEquals(7, radio.getCurrentNumber());
    }

    @Test
    public void shouldChangeVolumeLevel() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeVolumeLevel2() {
        Radio radio = new Radio(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeVolumeLevel3() {
        Radio radio = new Radio(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldTurnUpTheVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTurnUpTheVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void shouldTurnDownTheVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldTurnDownTheVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseCurrentVolume();

        Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        int expected = 100;
        int actual = radio.getMaxCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        int expected = 0;
        int actual = radio.getMinCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(12);
        int expected = 9;
        int actual = radio.getMaxCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNumber2() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-5);
        int expected = 0;
        int actual = radio.getMinCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
