import java.awt.*;

public class Car implements Movable{
    private int nrDoors;
    private double enginePower;
    private double currentSpeed;
    private Color color;
    private double xCord;
    private double yCord;
    private Direction direction;
    private int xChange;
    private int yChange;
    //. private String modelName;

    enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Car(int nrDoors, double enginePower, Color color){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.currentSpeed = 0;
        this.xCord = 0;
        this.yCord = 0;
        this.direction = Direction.UP;
        this.xChange = 0;
        this.yChange = -1;
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }
    
    public double speedFactor(){
        return enginePower * 0.01;
    }

    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    @Override
    public void move() {
        this.xCord += this.xChange * currentSpeed;
        this.yCord += this.yChange * currentSpeed;
    }

    @Override
    public void turnLeft() {
        switch (this.direction) {
            case UP:
                this.xChange = -1;
                this.yChange = 0;
                this.direction = Direction.LEFT;
            case DOWN:
                this.xChange = 1;
                this.yChange = 0;
                this.direction = Direction.RIGHT;
            case LEFT:
                this.xChange = 0;
                this.yChange = 1;
                this.direction = Direction.DOWN;
            case RIGHT:
                this.xChange = 0;
                this.yChange = -1;
                this.direction = Direction.UP;
        }

        
    }

    @Override
    public void turnRight() {
        switch (this.direction) {
            case UP:
                this.xChange = 11;
                this.yChange = 0;
                this.direction = Direction.RIGHT;
            case DOWN:
                this.xChange = -1;
                this.yChange = 0;
                this.direction = Direction.LEFT;
            case LEFT:
                this.xChange = 0;
                this.yChange = -1;
                this.direction = Direction.UP;
            case RIGHT:
                this.xChange = 0;
                this.yChange = 1;
                this.direction = Direction.DOWN;
        }
    }
}


