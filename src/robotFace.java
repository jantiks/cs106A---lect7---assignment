/*
class draws robot face
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class robotFace extends GraphicsProgram {
    //size of robot head
    private static final int HEAD_WIDTH = 180;
    private static final int HEAD_HEIGHT = 250;

    //radius of robot eye
    private static final int EYE_RADIUS = 30;

    //size of mouth
    private static final int MOUTH_WIDTH = 100;
    private static final int MOUTH_HEIGHT = 40;

    public void run() {
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        GRect head = makeRect(HEAD_WIDTH, HEAD_HEIGHT,centerX - (HEAD_WIDTH / 2),centerY - (HEAD_HEIGHT / 2) );
        GRect mouth = makeRect(MOUTH_WIDTH, MOUTH_HEIGHT, centerX - (MOUTH_WIDTH / 2),centerY + 50);
        GOval leftEye = makeEye(EYE_RADIUS, centerX - (40 + EYE_RADIUS / 2), centerY - 70);
        GOval rightEye = makeEye(EYE_RADIUS, centerX + (40 - EYE_RADIUS / 2), centerY - 70);


        head.setFilled(true);
        head.setFillColor(Color.gray);

        mouth.setFilled(true);
        mouth.setFillColor(Color.white);

        add(head);
        add(mouth);
        add(leftEye);
        add(rightEye);




    }
    private GRect makeRect(int width, int height, int x , int y){
        GRect rect = new GRect(x,y,width,height);
        return rect;
    }

    private GOval makeEye(int radius , int x , int y) {
        GOval oval = new GOval(x,y,radius,radius);
        oval.setFilled(true);
        oval.setFillColor(Color.yellow);

        return oval;
    }
}
