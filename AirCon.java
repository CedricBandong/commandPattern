package adapterPattern;

public class AirCon {
    public String turnOn(){
        return "AC turning on";
    }

    public String turnOff(){
        return "AC shutting down";
    }

    public String tempUp(){
        return "AC increasing temperature";
    }

    public String tempDown(){
        return "AC reducing temperature";
    }
}
