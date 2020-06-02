package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @org.junit.jupiter.api.Test
    void setMaxStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(5);
        int excepted = 9;
        assertEquals(excepted, radioman.getMaxStation());

    }

    @org.junit.jupiter.api.Test
    void setMinStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(2);
        int excepted = 0;
        assertEquals(excepted, radioman.getMinStation());
    }

    @org.junit.jupiter.api.Test
    void setCurrentStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(3);
        int excepted = 3;
        assertEquals(excepted, radioman.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void setCurrentStationOverMaxStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(10);
        int excepted = 9;
        assertEquals(excepted, radioman.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void setCurrentStationEquallyMinStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(0);
        int excepted = 0;
        assertEquals(excepted, radioman.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void setCurrentStationUnderMinStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(-1);
        int excepted = 0;
        assertEquals(excepted, radioman.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void setMaxVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(4);
        int excepted = 10;
        assertEquals(excepted, radioman.getMaxVolume());
    }

    @org.junit.jupiter.api.Test
    void setMinVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(8);
        int excepted = 0;
        assertEquals(excepted, radioman.getMinVolume());
    }

    @org.junit.jupiter.api.Test
    void setCurrentVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(9);
        int excepted = 9;
        assertEquals(excepted, radioman.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void setCurrentVolumeOverMaxVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(12);
        int excepted = 10;
        assertEquals(excepted, radioman.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void setCurrentVolumeEquallyMinVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(0);
        int excepted = 0;
        assertEquals(excepted, radioman.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void setCurrentVolumeUnderMinVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(-2);
        int excepted = 0;
        assertEquals(excepted, radioman.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void upVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(5);
        radioman.upVolume();
        int excepted = 6;
        assertEquals(excepted, radioman.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void upVolumeOverMaxVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(12);
        radioman.upVolume();
        int excepted = 10;
        assertEquals(excepted, radioman.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void downVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(5);
        radioman.downVolume();
        int excepted = 4;
        assertEquals(excepted, radioman.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void downVolumeOverMinVolume() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(-5);
        radioman.downVolume();
        int excepted = 0;
        assertEquals(excepted, radioman.getCurrentVolume());
    }

    @org.junit.jupiter.api.Test
    void nextStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(3);
        radioman.nextStation();
        int excepted = 4;
        assertEquals(excepted, radioman.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void nextStationAfterMaxStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(10);
        radioman.nextStation();
        int excepted = 0;
        assertEquals(excepted, radioman.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void prevStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(3);
        radioman.prevStation();
        int excepted = 2;
        assertEquals(excepted, radioman.getCurrentStation());
    }
    @org.junit.jupiter.api.Test
    void prevStationAfterMinStation() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(-1);
        radioman.prevStation();
        int excepted = 9;
        assertEquals(excepted, radioman.getCurrentStation());
    }
}