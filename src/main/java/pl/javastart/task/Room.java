package pl.javastart.task;

public class Room {
    double roomVolume;
    double currentTemp;
    double minTemp;
    boolean airConditioner;

    public Room(double roomVolume, double currentTemp, double minTemp, boolean airConditioner) {
        this.roomVolume = roomVolume;
        this.currentTemp = currentTemp;
        this.minTemp = minTemp;
        this.airConditioner = airConditioner;
    }

    boolean cooler() {
        boolean result;

        if (!this.airConditioner) {
            result = false;
        } else if (this.currentTemp <= this.minTemp) {
            result = false;
        } else {
            if (this.currentTemp - this.minTemp < 1) {
                this.currentTemp = this.minTemp;
            } else {
                this.currentTemp -= 1;
            }
           result = true;
        }

        return result;
    }
}
