package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void numberStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void negativeNumberStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void zeroNumberStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void oneNumberStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void eightNumberStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void nineNumberStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void tenNumberStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void nextStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void nextAfterNineStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void prevAfterZeroStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void prevStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 31;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 29;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 98;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void redusehundredVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduseMaxInOneVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(101);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minusVolume() {

        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void plusVolume() {

        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }
}
