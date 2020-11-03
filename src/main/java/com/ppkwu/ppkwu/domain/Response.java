package com.ppkwu.ppkwu.domain;

public class Response {
    int big;
    int small;
    int number;
    int special;

    public Response(int big, int small, int number, int special) {
        this.big = big;
        this.small = small;
        this.number = number;
        this.special = special;
    }

    public int getBig() {
        return big;
    }

    public int getSmall() {
        return small;
    }

    public int getNumber() {
        return number;
    }

    public int getSpecial() {
        return special;
    }

    public void setBig(int big) {
        this.big = big;
    }

    public void setSmall(int small) {
        this.small = small;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSpecial(int special) {
        this.special = special;
    }
}
