import processing.core.PApplet;

public class ProcessingProcedural extends PApplet{

    public static final int HEIGHT = 400;
    public static final int WIDTH = 800;
    public static final int DIAMETER = 10;
    int ball1x=0;
    int ball2x=0;
    int ball3x=0;
    int ball4x=0;

    public static void main(String[] args) {
        PApplet.main("ProcessingProcedural",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //dg
    }

    @Override
    public void draw() {
        ellipse(ball1x,HEIGHT/5, DIAMETER,DIAMETER);
        ellipse(ball2x,HEIGHT*2/5, DIAMETER,DIAMETER);
        ellipse(ball3x,HEIGHT*3/5, DIAMETER,DIAMETER);
        ellipse(ball4x,HEIGHT*4/5, DIAMETER,DIAMETER);
        ball1x++;
        ball2x+=2;
        ball3x+=4;
        ball4x+=8;
    }
}
