package exercise;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] Arr = new float[2];
        if (Arr.length >= 2) {
            Arr[0] = getxSpeed();
            Arr[1] = getySpeed();
        }
        return Arr;
    }

    @Override
    public String toString() {
        return " x: " + getX() + " y: " + getY() + " speed= "+ getxSpeed() +" and " + getySpeed();
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint move(){
        super.setX(super.getX() + getxSpeed());
        super.setY(super.getY() + getySpeed());
        return this;
    }
}
class TestMovablePoint{
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint);

    }
}
