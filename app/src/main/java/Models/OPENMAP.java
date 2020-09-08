package Models;

import java.util.List;

public class OPENMAP {


    private COORDINATES coord;
    private List<WEATHER> weather;
    private String base;
    private  MAIN main;
    private WIND wind;
    private RAIN rain;
    private CLOUDS clouds;
    private int dt;
    private SYSTEM sys;
    private int id;
    private String name;
    private int cod;

    public OPENMAP() {
    }

    public OPENMAP(COORDINATES coord, List<WEATHER> weatherList, String base, MAIN main, WIND wind, RAIN rain, CLOUDS clouds, int dt, SYSTEM sys, int id, String name, int cod) {
        this.coord = coord;
        this.weather = weatherList;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.rain = rain;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public COORDINATES getCoord() {
        return coord;
    }

    public void setCoord(COORDINATES coord) {
        this.coord = coord;
    }


    public List<WEATHER> getWeather() {
        return weather;
    }

    public void setWeather(List<WEATHER> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MAIN getMain() {
        return main;
    }

    public void setMain(MAIN main) {
        this.main = main;
    }

    public WIND getWind() {
        return wind;
    }

    public void setWind(WIND wind) {
        this.wind = wind;
    }

    public RAIN getRain() {
        return rain;
    }

    public void setRain(RAIN rain) {
        this.rain = rain;
    }

    public CLOUDS getClouds() {
        return clouds;
    }

    public void setClouds(CLOUDS clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public SYSTEM getSys() {
        return sys;
    }

    public void setSys(SYSTEM sys) {
        this.sys = sys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }


}