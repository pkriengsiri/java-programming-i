/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pete
 */
public class Timer {

    private int seconds;
    private int hundrethsOfSeconds;

    public Timer() {

        this.seconds = 0;
        this.hundrethsOfSeconds = 0;

    }

    public void advance() {
        if (this.hundrethsOfSeconds == 99) {
            this.hundrethsOfSeconds = 0;
            if (this.seconds == 59) {
                this.seconds = 0;
            } else {
                this.seconds++;
            }
        } else {
            this.hundrethsOfSeconds++;
        }
    }

    private String getSeconds() {
        if (this.seconds < 10) {
            return "0" + this.seconds;
        } else {
            return String.valueOf(this.seconds);
        }
    }

    private String getHundrethsOfSeconds() {
        if (this.hundrethsOfSeconds < 10) {
            return "0" + this.hundrethsOfSeconds;
        } else {
            return String.valueOf(this.hundrethsOfSeconds);
        }
    }

    public String toString() {
        return getSeconds() + ":" + getHundrethsOfSeconds();
    }

}
