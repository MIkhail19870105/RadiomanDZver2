package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void setMaxOneArgStation() {
        Radioman radioman = new Radioman(10);

        assertEquals(10, radioman.getMaxStation());

    }

    @Test
    void setMaxNoArgsStation() {
        Radioman radioman = new Radioman();

        assertEquals(9, radioman.getMaxStation());
    }

    @Test
    void SetMinNoArgsStation() {
        Radioman radioman = new Radioman();

        assertEquals(0, radioman.getMinStation());
    }

    @Test
    void setMinArgsStation() {
        Radioman radioman = new Radioman(9,0,5,100,0,50);

        assertEquals(0, radioman.getMinStation());
    }

    @Test
    void setCurrentArgsStation() {
        Radioman radioman = new Radioman(5,30);

        assertEquals(5, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStation() {
        Radioman radioman = new Radioman(9,2,52);

        assertEquals(2, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStationOverMaxStation() {
        Radioman radioman = new Radioman(9,5,22);
        radioman.setCurrentStation(20);
        assertEquals(9, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStationEquallyMinStation() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentStation(0);
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStationUnderMinStation() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentStation(-12);
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void setMaxVolume() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);

        assertEquals(100, radioman.getMaxVolume());
    }

    @Test
    void setMinVolume() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);

        assertEquals(0, radioman.getMinVolume());
    }

    @Test
    void setCurrentVolume() {
        Radioman radioman = new Radioman(9,7,25);

        assertEquals(25, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeOverMaxVolume() {
        Radioman radioman = new Radioman(9,0,5,100,0,100);
        radioman.setCurrentVolume(102);
        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeEquallyMinVolume() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentVolume(0);
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnderMinVolume() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentVolume(-2);
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void upVolume() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentVolume(95);
        radioman.upVolume();
        assertEquals(96, radioman.getCurrentVolume());
    }

    @Test
    void upVolumeOverMaxVolume() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentVolume(105);
        radioman.upVolume();
        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void downVolume() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentVolume(5);
        radioman.downVolume();
        assertEquals(4, radioman.getCurrentVolume());
    }

    @Test
    void downVolumeOverMinVolume() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentVolume(-5);
        radioman.downVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void nextStation() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentStation(3);
        radioman.nextStation();
        assertEquals(4, radioman.getCurrentStation());
    }

    @Test
    void nextStationAfterMaxStation() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentStation(10);
        radioman.nextStation();
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void prevStation() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentStation(3);
        radioman.prevStation();
        assertEquals(2, radioman.getCurrentStation());
    }

    @Test
    void prevStationAfterMinStation() {
        Radioman radioman = new Radioman(9, 0, 5, 100, 0, 50);
        radioman.setCurrentStation(-1);
        radioman.prevStation();
        assertEquals(9, radioman.getCurrentStation());
    }
}