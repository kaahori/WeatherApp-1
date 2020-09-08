package Models;


public class MAIN {
    private double temp;
    private double pressure;
    private int humidity;
    private double temp_min;
    private double temp_max;


    public MAIN(double temp, double pressure, int humidity, double temp_max, double temp_min){
        this.humidity=humidity;
        this.pressure=pressure;
        this.temp=temp;
        this.temp_max=temp_max;
        this.temp_min=temp_min;
    }


    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

}
