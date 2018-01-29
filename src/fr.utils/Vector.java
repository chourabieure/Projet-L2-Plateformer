package fr.utils;

/**
 * Vector
 * A object assigned as a 2D Vector
 */
public class Vector {
    //====== Variables ======//
    private double x, y; // x and y begin the components of the vector

    //====== Constructeur ======//
    /**
     * create a new vector
     * @param p_x the x value of the vector
     * @param p_y the y value of the vector
     */
    Vector (double p_x, double p_y) {
        this.x = p_x;
        this.y = p_y;
    }

    //====== Méthodes ======//
    //--- Accesseurs
    /**
     * @return the x attribute
     */
    public double getX () { return x; }

    /**
     * @return the y attribute
     */
    public double getY () { return y; }

    /**
     * @param p_x the x to set
     */
    public void setX (double p_x) { this.x = p_x; }

    /**
     * @param p_y the y to set
     */
    public void setY (double p_y) { this.y = p_y; }

    //--- Méthodes d'instance
    /**
     * add one vector to the current one
     * @param vect the vect added to this
     */
    public void add (Vector vect) {
        this.x += vect.getX();
        this.y += vect.getY();
    }
    
    /**
     * set the two values of a vector
     * @param p_x the x to set
     * @param p_y the y to set
     */
    public void set (double p_x, double p_y) {
        this.setX(p_x);
        this.setY(p_y);
    }

    //--- Affichage
    @Override
    public String toString () { return "x: " + this.x + ", y: " +this.y; }
}
