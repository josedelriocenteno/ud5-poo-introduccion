package EjerciciosClase;

import java.awt.*;

public class Punto {

    private double x;
    private double y;

    public Punto(){
        this.x=0.0;
        this.y=0.0;
    }

    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString(){
        return String.format("(%f/%f",x,y);
    }

    public void desplazar (double a, double b){
        x+=a;
        y+=b;
    }

    public double distanciaPuntoPunto(double x, double y){
        return Math.sqrt(Math.pow(x-this.x,2)+(Math.pow(y-this.y,2)));
    }

    public void moverCentroPantalla(double x, double y){
        Toolkit toolK = Toolkit.getDefaultToolkit();
        this.x = toolK.getMenuShortcutKeyMaskEx();
        this.y = toolK.getMenuShortcutKeyMaskEx();
    }

    public void mover(Punto punto){

    }
}
