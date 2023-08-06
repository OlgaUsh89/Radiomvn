package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNextNumber() {
        Radio radio =  new Radio();
        radio.setNumber(9);
        radio.nextNumberRadio();
        int expected = 0;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber2() {
        Radio radio =  new Radio();
        radio.setNumber(8);
        radio.nextNumberRadio();
        int expected = 9;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber3() {
        Radio radio =  new Radio();
        radio.setNumber(0);
        radio.nextNumberRadio();
        int expected = 1;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber() {
        Radio radio =  new Radio();
        radio.setNumber(0);
        radio.prevNumberRadio();
        int expected = 9;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber2() {
        Radio radio =  new Radio();
        radio.setNumber(1);
        radio.prevNumberRadio();
        int expected = 0;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber3() {
        Radio radio =  new Radio();
        radio.setNumber(9);
        radio.prevNumberRadio();
        int expected = 8;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMax() {
        Radio radio =  new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMax2() {
        Radio radio =  new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMin() {
        Radio radio =  new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMin2() {
        Radio radio =  new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNumberTestMin() {
        Radio radio =  new Radio();
        radio.setNumber(-1);
        int expected = 0;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNumberTestMax() {
        Radio radio =  new Radio();
        radio.setNumber(10);
        int expected = 0;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeTestMax() {
        Radio radio =  new Radio();
        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeTestMin() {
        Radio radio =  new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
