/**
 * Element
 */
abstract class Element {
    //=== Attributes
    protected Position pos; // the position of the element
    protected double width, height; // the width and height of the element
    protected Vector vel, acc; // the velocity and the acceleration of the element

    //====== Methods ======//
    //--- Accessors
    abstract Position getPos ();
    abstract double getWidth();
    abstract double getHeight();
    abstract Vector getVel ();
    abstract Vector getAcc ();

    abstract void setPos (Position p_pos);
    abstract void setWidth (double p_width);
    abstract void setHeight (double p_height);
    abstract void setVel (Vector p_vel);
    abstract void setAcc (Vector p_acc);

    //--- Instancy methods
    /**
     * apply a force to the current element
     * @param force the force applied to the current element
     */
    abstract void apllyForce (Vector force);

    /**
     * update the state of the current element
     */
    abstract void update ();

    //--- Display
    @Override
    public String toString() { return "Element pos " + this.pos + "\nElement velocity: " + this.vel + "\nElement acceleration: " + this.acc +"\nwidth: " + this.width + ", height: " + this.height; }
    
}
