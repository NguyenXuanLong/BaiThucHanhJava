package Shape;

import java.util.Scanner;

public class Point {

    private String diem;
    private float hoanhdo;
    private float tungdo;

    public Point(String diem, float hoanhdo, float tungdo) {
        this.diem = diem;
        this.hoanhdo = hoanhdo;
        this.tungdo = tungdo;
    }
    
    public Point( float hoanhdo, float tungdo) {
        this.hoanhdo = hoanhdo;
        this.tungdo = tungdo;
    }

    public void setdiem(String diem) {
        this.diem = diem;
    }

    public String getdiem() {
        return diem;
    }

    public void sethoanhdo(float hoanhdo) {
        this.hoanhdo = hoanhdo;
    }

    public float gethoanhdo() {
        return hoanhdo ;
    }
    
    public void settungdo(float tungdo) {
        this.tungdo = tungdo;
    }

    public float gettungdo() {
        return tungdo;
    }

    public void xuatdiem() {
        System.out.println(diem +"(" + hoanhdo +","+tungdo+")");
       
    }
}