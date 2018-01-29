package fr.utils;

/**
 * Position
 * the position of an element
 */
public class Position {
    // Atributes
    private double x, y;

    Position (double p_x, double p_y) {
        this.x = p_x;
        this.y = p_y;
    }


    // Accesseurs
    /**
     * @return the x
     */
    public double getX () {
        return x;
    }

    /**
     * @return the y
     */
    public double getY () {
        return y;
    }

    /**
     * @param p_x the x to set
     */
    public void setX (double p_x) {
        this.x = p_x;
    }

    /**
     * @param p_y the y to set
     */
    public void setY (double p_y) {
        this.y = p_y;
    }

    // Methods

    /**
     * moves the point to the p_x p_y location
     * @param p_x the x location
     * @param p_y the y location
     */
    public Position move (double p_x, double p_y) {
        this.x = p_x;
        this.y = p_y;
        return this; 
    }

    public String toString(){
        return ("position x : " + this.x + "position y :" + this.y);
    }
}
