package Models;

public class COORDINATES {

    private double lat;
    private double lon;

    public COORDINATES(double lat, double lon){
        this.lat=lat;
        this.lon=lon;
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }
    public void setLat(double lat){
        this.lat=lat;
    }

    public void setLon(double lon){
        this.lon=lon;
    }

}

