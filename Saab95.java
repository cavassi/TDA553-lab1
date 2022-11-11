import java.awt.*;

public class Saab95 extends Car{

    public boolean turboOn;
    public int nrDoors; // Number of doors on the car
    public double enginePower; // The Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // The color of the car
    public String modelName; // The car model name
    
    public Saab95(){
        super(2, 125.0, Color.red);
        this.modelName = "Saab95";
        this.turboOn = false;
        this.currentSpeed = 0;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }

    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

}
