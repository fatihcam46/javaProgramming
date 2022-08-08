package day40_FinalKeyword;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {
    private Circle circle;//1-getter
    public Circle getCircle(){
        return circle;
    }
    public  void setCircle(Circle circle){//2-setter
        if(circle.getRadius() < 5){ //if the given circle`s radius is less than 5
            return;
        }
        this.circle = circle;
    }

    private Square square;//write after shortcut >>>generate>>getter setter>>
    public Square getSquare() {//1-getter
        return square;
    }
    public void setSquare(Square square) {//2-setter//lets use public//it will be visible all package
        this.square = square;
    }
}
