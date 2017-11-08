import java.util.ArrayList;
import java.util.List;

public class Planet {

    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    public Planet(Planet p) {
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }

    public Planet(double xxP, double yyP, double xxV,
                  double yyV, double m, String img) {
        this.xxPos = xxP;
        this.yyPos = yyP;
        this.xxVel = xxV;
        this.yyVel = yyV;
        this.mass = m;
        this.imgFileName = img;
    }

    public double calcDistance(Planet hoth) {
        //Square root of (x1-x2)^2 + (y1-y2)^2
        double dx = this.xxPos - hoth.xxPos;
        double dy = this.yyPos - hoth.yyPos;
        double squared = (dx * dx) + (dy + dy);
        return Math.sqrt(squared);
    }

    public double calcForceExertedBy(Planet hoth) {
        //Calculate F=G*m1*m2/r^2
        double G = 6.67 * Math.pow(10, -11); //G (6.67 * 10-11 N-m2 / kg2)
        double r = calcDistance(hoth);
        double forceNaboo = (G * hoth.mass * this.mass) / (r * r);
        return forceNaboo;
    }

    public double calcForceExertedByX(Planet hoth) {
        //Calculate Fx = F * dx / r
        double dx = hoth.xxPos - this.xxPos;
        double r = calcDistance(hoth);
        double forceNaboo = calcForceExertedBy(hoth);
        double forceJakku = forceNaboo * dx / r;
        return forceJakku;
    }

    public double calcForceExertedByY(Planet hoth) {
        //Same as above, but for Y
        double dy = hoth.yyPos - this.yyPos;
        double r = calcDistance(hoth);
        double forceNaboo = calcForceExertedBy(hoth);
        double forceChandrila = forceNaboo * dy / r;
        return forceChandrila;
    }

    public double calcNetForceExertedByX(Planet[] galaxy) { //get it
        double netForceX = 0;
        for (Planet hoth : galaxy) {
            if (hoth == this) {
                continue;
            }
            else {
                netForceX += calcForceExertedByX(hoth);
            }
        }
        return netForceX;
    }

    public double calcNetForceExertedByY(Planet[] galaxy) { //get it now
        double netForceY = 0;
        for (Planet hoth : galaxy) {
            if (hoth == this) {
                continue;
            }
            else {
                netForceY += calcForceExertedByY(hoth);
            }
        }
        return netForceY;
    }

    public void update(double dt, double fX, double fY) { //weird bc directions say only 1 double parameter, but test requires 3 doubles
        //dt = length between time intervals
        double aX = fX / this.mass;
        double aY = fY / this.mass;
        
        //new velocity vx + dt * ax && vy + dt * ay
        this.xxVel = this.xxVel + (aX * dt);
        this.yyVel = this.yyVel + (aY * dt);

        //new position px + dt * vx && py + dt * vy
        this.xxPos = this.xxPos + (this.xxVel * dt);
        this.yyPos = this.yyPos + (this.yyVel * dt);
    }

    public void draw() {
        String filename = "./images/" + this.imgFileName;
        StdDraw.picture(this.xxPos, yyPos, filename);
    }
}