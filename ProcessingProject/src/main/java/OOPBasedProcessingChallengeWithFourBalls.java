import processing.core.PApplet;

public class OOPBasedProcessingChallengeWithFourBalls extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 700;
    public static final int DIAMETER = 10;
    public static final int firstBallSpeed = 1;
    public static final int secondBallSpeed = 2;
    public static final int thirdBallSpeed = 3;
    public static final int fourthBallSpeed = 4;

    public class Ball {
        int ballSpeed;
        int ballHeight;

        public Ball(int ballSpeed, int ballHeight) {
            this.ballSpeed = ballSpeed;
            this.ballHeight = ballHeight;
        }

        public void drawBall() {
            ellipse(ballSpeed,ballHeight,DIAMETER,DIAMETER);
        }

        public void updateBallPositions(int ballSpeed) {
            this.ballSpeed += ballSpeed;
        }
    }

    Ball firstBall;
    Ball secondBall;
    Ball thirdBall;
    Ball fourthBall;

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        firstBall = new Ball(0,HEIGHT/2*1/5);
        secondBall = new Ball(0,HEIGHT/2*2/5);
        thirdBall = new Ball(0,HEIGHT/2*3/5);
        fourthBall = new Ball(0,HEIGHT/2*4/5);
    }

    @Override
    public void draw() {
        firstBall.drawBall();
        firstBall.updateBallPositions(firstBallSpeed);

        secondBall.drawBall();
        secondBall.updateBallPositions(secondBallSpeed);

        thirdBall.drawBall();
        thirdBall.updateBallPositions(thirdBallSpeed);

        fourthBall.drawBall();
        fourthBall.updateBallPositions(fourthBallSpeed);
    }

    public static void main(String[] args) {
        PApplet.main("OOPBasedProcessingChallengeWithFourBalls",args);
    }
}
