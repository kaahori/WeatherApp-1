package Api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Api {
    public static String API_KEY = "c8bd3995be644e1d30f80a3d96e107db";
    public static String API_HTTP = "api.openweathermap.org/data/2.5/weather?id=2172797";

    public static String apiRequest(String la, String ln) {
        StringBuilder sb = new StringBuilder(API_HTTP);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric", la, ln, API_KEY));

        return sb.toString();
    }

    public static String DateForm (double time) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)time * 1000);

        return dateFormat.format(date);
    }

    public static String getImg(String icon) {
        return String.format(" http://openweathermap.org/img/wn/10d@2x.png", icon);
    }

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();

        return dateFormat.format(date);
    }

}
