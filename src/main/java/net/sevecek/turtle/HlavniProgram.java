package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    Turtle zofka;

    public void main(String[] args) {
        zofka = new Turtle();

        Color zelena = new Color(12, 224, 12);
        Color modra = new Color(30, 224, 162);
        Color zluta = new Color(245, 232, 1);
        Color ruzova = new Color(255, 0, 119);
        Color cervena = new Color(255, 26, 26);

        zofka.setLocation(1000, 400);

        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliObdelnik(200, 100, cervena);

        nakresliKruh(50, cervena);

        zofka.turnLeft(90);

        nakresliObdelnik(200, 100, cervena);

        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnLeft(180);


        nakresliTrojuhelnikRam(80, 90, zluta);

        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.penDown();

        nakresliKruh(23, zelena);

        zofka.penUp();
        zofka.move(80);
        zofka.penDown();

        nakresliKruh(23, zelena);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(46);
        zofka.turnRight(90);
        zofka.move(160);
        zofka.penDown();

        nakresliKruh(90, modra);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(180);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliKruh(70, modra);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliKruh(50, modra);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliKruh(20, modra);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(147);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliKruh(20, modra);

        zofka.penUp();
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(67.5);
        zofka.penDown();

        nakresliTrojuhelnikRam(200, 45, zluta);

        zofka.turnLeft(180 + 67.5);

        nakresliKruh(81, ruzova);

    }

    public void nakresliObdelnik(double delkaStranyA, double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

    public double vypocitejDelkuTretiStrany(double delkaStranyR, double uhelMeziR) {
        double tretiStrana;
        tretiStrana = Math.abs((delkaStranyR
                * Math.sin((uhelMeziR * Math.PI / 180.0) / 2.0))
                * 2.0);
        return tretiStrana;
    }

    public void nakresliTrojuhelnikRam(double delkaStranyR, double uhelMeziR, Color barva) {
        zofka.setPenColor(barva);
        double tretiStrana = vypocitejDelkuTretiStrany(delkaStranyR, uhelMeziR);
        double uhelR = (180 - uhelMeziR) / 2;
        zofka.move(delkaStranyR);
        zofka.turnRight(180 - uhelMeziR);
        zofka.move(delkaStranyR);
        zofka.turnRight(180 - uhelR);
        zofka.move(tretiStrana);

    }

    public void nakresliKruh(double polomer, Color barva) {
        zofka.setPenColor(barva);
        double cisloOtacek = 36;
        double uhelMeziR = 360 / cisloOtacek;
        double tretiStrana = vypocitejDelkuTretiStrany(polomer, uhelMeziR);
        for (int i = 0; i < cisloOtacek; i++) {
            zofka.move(tretiStrana);
            zofka.turnRight(uhelMeziR);
        }
    }

}
