package matcomp.e1.ejerciciosclases.cuaderno1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    /** Constructor que crea un tiempo con los parámetros dados
     */
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /** Metodo que devuelve la hora
     */
    public int getHour() {
        return hour;
    }
    /** Metodo que devuelve el minuto
     */
    public int getMinute() {
        return minute;
    }
    /** Metodo que devuelve los segundos
     */
    public int getSecond() {
        return second;
    }

    /** Metodo que cambia la hora
     */
    public void setHour(int hour) {
        this.hour = hour;
    }
    /** Metodo que cambia el minuto
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }
    /** Metodo que cambia los segundos
     */
    public void setSecond(int second) {
        this.second = second;
    }
    /** Metodo que cambia el tiempo
     */
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /** Metodo que pasa el tiempo a texto
     */
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    /** Metodo que calcula el tiempo que sería al sumarle un segundo
     */
    public Time nextSecond() {
        second++;
        if (second == 60) { //si los segundos ahora son 60, se pasaría al siguiente minuto y al segundo 0
            second = 0;
            minute++;}
        if (minute == 60) { //si el minuto ahora es 60, se pasaría a la siguiente hora y al minuto 0
            minute = 0;
            hour++;}
        if (hour == 24) {   // si la hora es 24, se pasaría a la hora 0
            hour = 0;}
        return this;
    }
    /** Metodo que calcula el tiempo que sería al restarle un segundo
     */
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
        }
        if (minute < 0) {
            minute = 59;
            hour--;
        }
        if (hour < 0) {
            hour = 23;
        }
        return this;
    }
}
