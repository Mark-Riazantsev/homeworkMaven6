package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation1() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);
        rad.setCurrentRadioStation(1);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStation_1() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(2);
        rad.setCurrentRadioStation(-1);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStation11() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(6);
        rad.setCurrentRadioStation(11);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
        public void prevRadioStation_1() {
        Radio rad = new Radio(10);

        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void manyStations() {
        Radio rad = new Radio(30);

        rad.setCurrentRadioStation(29);
        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void fewStations() {
        Radio rad = new Radio(5);

        rad.setCurrentRadioStation(4);
        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation0() {
        Radio rad = new Radio(10);

        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation1() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.nextRadioStation();

        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextSetRadioStation8() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(7);
        rad.nextRadioStation();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation9() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(2);
        rad.prevRadioStation();

        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(2);
        rad.prevVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioStation10() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume_1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.prevVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.nextVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume99() {
        Radio rad = new Radio();

        rad.setCurrentVolume(98);
        rad.nextVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.nextVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume105() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.setCurrentVolume(105);

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume_10() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.setCurrentVolume(-10);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextSetVolume101() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.nextVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}