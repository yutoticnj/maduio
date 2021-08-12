package com.akie.exer1;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricObject a = new Circle("blue",1,1);
        GeometricObject b = new MyRectangle("black",1,1,Math.PI);

        GeometricTest test = new GeometricTest();
        test.equalsArea(a,b);
        System.out.println();
        test.displayGeometricObject(a);
        test.displayGeometricObject(b);
    }

    public void equalsArea(GeometricObject a,GeometricObject b){
        if (a.findArea() == b.findArea()) {
            System.out.println("面积相等！");
        } else {
            System.out.println("面积不相等！");
        }
    }

    public void displayGeometricObject(GeometricObject a){
        System.out.println("面积是：" + a.findArea());
    }
}
