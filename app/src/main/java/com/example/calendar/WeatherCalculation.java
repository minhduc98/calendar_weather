package com.example.calendar;

public class WeatherCalculation {
    int tietkhi;
    int tietkhiDetail;

    public void findTietkhi(int d, int m) {
        switch (m) {
            case 2:
                if ((d>3) && (d<19)) {
                    this.tietkhi = R.string.tk1;
                    this.tietkhiDetail = R.string.tk1a;
                }
                else {
                    if (d>=19) {
                        this.tietkhi = R.string.tk2;
                        this.tietkhiDetail = R.string.tk2a;
                    } else {
                        this.tietkhi = R.string.tk24;
                        this.tietkhiDetail = R.string.tk24a;
                    }
                }
                break;
            case 3:
                if ((d>4) && (d<21)) {
                    this.tietkhi = R.string.tk3;
                    this.tietkhiDetail = R.string.tk3a;
                } else {
                    if (d>=21) {
                        this.tietkhi = R.string.tk4;
                        this.tietkhiDetail = R.string.tk4a;
                    } else {
                        this.tietkhi = R.string.tk2;
                        this.tietkhiDetail = R.string.tk2a;
                    }
                }
                break;
            case 4:
                if ((d>4) && (d<20)) {
                    this.tietkhi = R.string.tk5;
                    this.tietkhiDetail = R.string.tk5a;
                } else {
                    if (d>=20) {
                        this.tietkhi = R.string.tk6;
                        this.tietkhiDetail = R.string.tk6a;
                    } else {
                        this.tietkhi = R.string.tk4;
                        this.tietkhiDetail = R.string.tk4a;
                    }
                }
                break;
            case 5:
                if ((d>5) && (d<21)) {
                    this.tietkhi = R.string.tk7;
                    this.tietkhiDetail = R.string.tk7a;
                } else {
                    if (d>=20) {
                        this.tietkhi = R.string.tk8;
                        this.tietkhiDetail = R.string.tk8a;
                    } else {
                        this.tietkhi = R.string.tk6;
                        this.tietkhiDetail = R.string.tk6a;
                    }
                }
                break;
            case 6:
                if ((d>5) && (d<21)) {
                    this.tietkhi = R.string.tk9;
                    this.tietkhiDetail = R.string.tk9a;
                } else {
                    if (d>=21) {
                        this.tietkhi = R.string.tk10;
                        this.tietkhiDetail = R.string.tk10a;
                    } else {
                        this.tietkhi = R.string.tk8;
                        this.tietkhiDetail = R.string.tk8a;
                    }
                }
                break;
            case 7:
                if ((d>6) && (d<22)) {
                    this.tietkhi = R.string.tk11;
                    this.tietkhiDetail = R.string.tk11a;
                } else {
                    if (d>=22) {
                        this.tietkhi = R.string.tk12;
                        this.tietkhiDetail = R.string.tk12a;
                    } else {
                        this.tietkhi = R.string.tk10;
                        this.tietkhiDetail = R.string.tk10a;
                    }
                }
                break;
            case 8:
                if ((d>6) && (d<22)) {
                    this.tietkhi = R.string.tk13;
                    this.tietkhiDetail = R.string.tk13a;
                } else {
                    if (d>=22) {
                        this.tietkhi = R.string.tk14;
                        this.tietkhiDetail = R.string.tk14a;
                    } else {
                        this.tietkhi = R.string.tk12;
                        this.tietkhiDetail = R.string.tk12a;
                    }
                }
                break;
            case 9:
                if ((d>7) && (d<23)) {
                    this.tietkhi = R.string.tk15;
                    this.tietkhiDetail = R.string.tk15a;
                } else {
                    if (d>=23) {
                        this.tietkhi = R.string.tk16;
                        this.tietkhiDetail = R.string.tk16a;
                    } else {
                        this.tietkhi = R.string.tk14;
                        this.tietkhiDetail = R.string.tk14a;
                    }
                }
                break;
            case 10:
                if ((d>7) && (d<23)) {
                    this.tietkhi = R.string.tk17;
                    this.tietkhiDetail = R.string.tk17a;
                } else {
                    if (d>=23) {
                        this.tietkhi = R.string.tk18;
                        this.tietkhiDetail = R.string.tk18a;
                    } else {
                        this.tietkhi = R.string.tk16;
                        this.tietkhiDetail = R.string.tk16a;
                    }
                }
                break;
            case 11:
                if ((d>6) && (d<22)) {
                    this.tietkhi = R.string.tk19;
                    this.tietkhiDetail = R.string.tk19a;
                } else {
                    if (d>=22) {
                        this.tietkhi = R.string.tk20;
                        this.tietkhiDetail = R.string.tk20a;
                    } else {
                        this.tietkhi = R.string.tk18;
                        this.tietkhiDetail = R.string.tk18a;
                    }
                }
                break;
            case 12:
                if ((d>6) && (d<22)) {
                    this.tietkhi = R.string.tk21;
                    this.tietkhiDetail = R.string.tk21a;
                } else {
                    if (d>=22) {
                        this.tietkhi = R.string.tk22;
                        this.tietkhiDetail = R.string.tk22a;
                    } else {
                        this.tietkhi = R.string.tk20;
                        this.tietkhiDetail = R.string.tk20a;
                    }
                }
                break;
            case 1:
                if ((d>5) && (d<21)) {
                    this.tietkhi = R.string.tk23;
                    this.tietkhiDetail = R.string.tk23a;
                } else {
                    if (d>=21) {
                        this.tietkhi = R.string.tk24;
                        this.tietkhiDetail = R.string.tk24a;
                    } else {
                        this.tietkhi = R.string.tk22;
                        this.tietkhiDetail = R.string.tk22a;
                    }
                }
                break;
        }
    }


    public int findDay(int d) {
        int day = 0;
        switch (d) {
            case 5: day =  R.string.tue1; break;
            case 6: day =  R.string.wed1; break;
            case 0: day =  R.string.thu1; break;
            case 1: day =  R.string.fri1; break;
            case 2: day =  R.string.sat1; break;
            case 3: day =  R.string.sun1; break;
            case 4: day =  R.string.mon1; break;
        }
        return day;
    }

    public int findWeatherImage(String w1) {
        int url = 0;
        if (w1.contains("cloudy") || (w1.contains("clear"))) {
            url =  R.drawable.cloudy;
        } else if (w1.contains("sun")) {
            url =  R.drawable.sunny;
        } else if (w1.contains("snow")) {
            url =  R.drawable.snow;
        } else if (w1.contains("haze") || (w1.contains("mist"))){
            url =  R.drawable.foggy;
        } else if (w1.contains("storm")) {
            url =  R.drawable.storm;
        } else if (w1.contains("rain") || (w1.contains("drizzle"))) {
            url =  R.drawable.rain;
        }
        return url;
    }

    public int findWeatherStatus(String w1) {
        int status = 0;
        if (w1.contains("cloudy") || (w1.contains("clear"))) {
            status =  R.string.cloudy;
        } else if (w1.contains("sun")) {
            status =  R.string.sunny;
        } else if (w1.contains("snow")) {
            status =  R.string.snow;
        } else if (w1.contains("haze") || (w1.contains("mist"))){
            status =  R.string.foggy;
        } else if (w1.contains("storm")) {
            status =  R.string.storm;
        } else if (w1.contains("rain") || (w1.contains("drizzle"))) {
            status =  R.string.rain;
        }
        return status;
    }
}
