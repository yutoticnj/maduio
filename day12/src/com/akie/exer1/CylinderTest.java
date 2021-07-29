package com.akie.exer1;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(2.1);
        cy.setLength(3.4);
        System.out.println("底面面积：" + cy.findArea());
        System.out.println("圆柱体积：" + cy.findVolume());

    }
}
