package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    //переключение станции вперёд, если номер станции < 9
    public void shouldNextStationIfNumberLessThan9() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    //переключение станции вперёд, если номер станции = 9
    public void shouldNextStationIfNumberIs9() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    //переключение станции назад, если номер станции > 0
    @Test
    public void shouldPrevStationIfNumberMoreThan0() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //переключение станции назад, если номер станции = 0
    @Test
    public void shouldPrevStationIfNumberIs0() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //увеличение громкости звука, если громкость < 10
    @Test
    public void shouldIncreaseVolumeIfVolumeLessThan10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //увеличение громкости звука, если громкость = 10
    @Test
    public void shouldIncreaseVolumeIfVolumeIs10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость от 1 до 10
    @Test
    public void shouldDecreaseVolumeIfVolumeFrom1To10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        radio.decreaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость 0
    @Test
    public void shouldDecreaseVolumeIfVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость -1
    @Test
    public void shouldDecreaseVolumeIfVolumeMinus1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость 11
    @Test
    public void shouldDecreaseVolumeIfVolume11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость = 1
    @Test
    public void shouldDecreaseVolumeIfVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости звука, если громкость = 10
    @Test
    public void shouldDecreaseVolumeIfVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //если устанавливают текущий номер станции <0
    @Test
    public void shouldNotWorkIfCurrentStationNumberLessThan0() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);

        radio.getCurrentStationNumber();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //если устанавливают текущий номер станции > 9
    @Test
    public void shouldNotWorkIfCurrentStationNumberMoreThan9() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);

        radio.getCurrentStationNumber();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

}
