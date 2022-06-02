/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author dinet
 */
public class Overloading {

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.add());
        System.out.println(overloading.add(10, 5.53));
        System.out.println(overloading.add(3.14, 10));

    }

    public int add() {
        return 10;
    }

    public int add(int x) {
        return x + x;
    }

    public double add(int x, double y) {
        return x + y;
    }

    public double add(double y, int x) {
        return y + x;
    }
}
