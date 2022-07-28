package ru.netology.radio;

public class Radio {
    //поля
    private int currentStationNumber;
    private int currentVolume;

    //переключение радиостанций вперёд
    public void next() {
        if (currentStationNumber < 9) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    //переключение радиостанций назад
    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = 9;
        }
    }

    // увеличение звука на 1
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }


    // уменьшение звука на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }


    //getter текущий номер станции
    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    //setter текущий номер станции
    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > 9) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    //getter текущая громкость звука
    public int getCurrentVolume() {
        return currentVolume;
    }

    //сеттер текущая громкость звука
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;

    }

}
