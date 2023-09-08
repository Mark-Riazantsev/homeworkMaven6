package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation_1() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();


        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation88() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.prevRadioStation();


        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation0() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.nextRadioStation();


        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation1() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        rad.prevRadioStation();


        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation9() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();


        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationStay10() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();


        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation8() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(7);
        rad.nextRadioStation();


        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume_1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.prevVolume();


        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.prevVolume();


        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0prevFrom1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.prevVolume();


        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1next() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.nextVolume();


        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99() {
        Radio rad = new Radio();

        rad.setCurrentVolume(98);
        rad.nextVolume();


        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.nextVolume();


        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume101() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        rad.nextVolume();


        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}