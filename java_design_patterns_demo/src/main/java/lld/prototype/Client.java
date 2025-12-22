package lld.prototype;

import javafx.geometry.Point3D;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException{
        Knight knight1 = new Knight();
        knight1.move(new Point3D(2, 3, -2), 5);
        knight1.attack();
        System.out.println("Knight1: " + knight1.toString());
        Knight knight2 = (Knight)knight1.clone();
        System.out.println("Knight2: " + knight2.toString());

        General general = new General();
        general.move(new Point3D(2, 2, -1), 5);
        general.boostMorale();
        System.out.println(general.toString());
        try{
            general.clone();
        }catch (CloneNotSupportedException e1){
            System.out.println(e1.getMessage());
        }
    }
}
