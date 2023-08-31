package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation_1() {
        Radio rad = new Radio(10);

        rad.setCurrentRadioStation(-1);

        int expected = 9;
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
    public void shouldSetRadioStation1() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);

        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation8() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation9() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStation10() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume_1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

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
    public void shouldSetVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume101() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}