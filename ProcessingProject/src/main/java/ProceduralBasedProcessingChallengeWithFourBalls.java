import processing.core.PApplet;

public class ProceduralBasedProcessingChallengeWithFourBalls extends PApplet {


    public static final int WIDTH = 600;
    public static final int HEIGHT = 700;
    public static final int DIAMETER = 10;
    public static int firstEllipseSpeed = 0;
    public static int secondEllipseSpeed = 0;
    public static int thirdEllipseSpeed = 0;
    public static int fourthEllipseSpeed = 0;
    public static int firstEllipseHeight = 0;
    public static int secondEllipseHeight = 0;
    public static int thirdEllipseHeight = 0;
    public static int fourthEllipseHeight = 0;

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        firstEllipseHeight = HEIGHT/2*1/5;
        secondEllipseHeight = HEIGHT/2*2/5;
        thirdEllipseHeight = HEIGHT/2*3/5;
        fourthEllipseHeight = HEIGHT/2*4/5;
    }

    @Override
    public void draw() {
        drawBall();
        updateBallPositions();
    }

    public void drawBall() {
        ellipse(firstEllipseSpeed,firstEllipseHeight,DIAMETER,DIAMETER);
        ellipse(secondEllipseSpeed,secondEllipseHeight,DIAMETER,DIAMETER);
        ellipse(thirdEllipseSpeed,thirdEllipseHeight,DIAMETER,DIAMETER);
        ellipse(fourthEllipseSpeed,fourthEllipseHeight,DIAMETER,DIAMETER);
    }

    public void updateBallPositions() {
        firstEllipseSpeed++;
        secondEllipseSpeed += 2;
        thirdEllipseSpeed += 3;
        fourthEllipseSpeed += 4;
    }

    public static void main(String[] args) {
        PApplet.main("ProceduralBasedProcessingChallengeWithFourBalls",args);
    }
}
