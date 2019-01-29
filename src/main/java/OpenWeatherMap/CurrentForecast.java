package OpenWeatherMap;

import JSON.JavaJsonObject;


import javax.json.JsonObject;

public class CurrentForecast implements JavaJsonObject {

    private Coord coord;
    private Sys sys;
    private Long epochTime;
    private String name;
    private Weather weather;
    private Wind wind;
    private Main main;
    private JsonObject currentForecast;

    @Override
    public JavaJsonObject build(JsonObject jsonObject){
        currentForecast = jsonObject;
        coord = (Coord) new Coord().build(currentForecast);
        sys = (Sys) new Sys().build(jsonObject);
        weather = (Weather) new Weather().build(jsonObject);
        main = (Main) new Main().build(jsonObject);
        wind = (Wind) new Wind().build(jsonObject);
        name = currentForecast.getJsonString("name").getString();
        epochTime = currentForecast.getJsonNumber("dt").longValue();
        return this;
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }

    public Coord getCoord() {
        return coord;
    }

    public Sys getSys() {
        return sys;
    }

    public Long getEpochTime() {
        return epochTime;
    }

    public String getName() {
        return name;
    }

    public Weather getWeather() {
        return weather;
    }

    public Wind getWind() {
        return wind;
    }

    public Main getMain() {
        return main;
    }

    public JsonObject getCurrentForecast() {
        return currentForecast;
    }

    public String toString(){
        return currentForecast.toString();
    }
}
