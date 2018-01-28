/**
 * Bloc
 */
public class Bloc extends Element {
    // Attributes
    private TypeBloc type; // the type of the block (bricks, grass, etc..), used in the graphical interface
    private boolean transparent; // if the palyer can jump through the block

    // Constructor
    Bloc (Position p_pos, double p_width, double p_height, TypeBloc p_type, boolean p_transparent) {
        this.pos = p_pos;
        this.width = p_width;
        this.height = p_height;
        this.vel = new Vector(0, 0);
        this.acc = new Vector(0, 0);
        this.type = p_type;
        this.transparent = p_transparent;
    }

    //====== Methods ======//
    //--- Accessors
    @Override
    public Position getPos() {
        return this.pos;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public Vector getVel() {
        return this.vel;
    }

    @Override
    public Vector getAcc() {
        return this.acc;
    }

    /**
     * @return the type of the bloc
     */
    public TypeBloc getType() {
        return this.type;
    }

    @Override
    public void setPos(Position p_pos) {
        this.pos = p_pos;
    }

    @Override
    public void setWidth(double p_width) {
        this.width = p_width;
    }

    @Override
    public void setHeight(double p_height) {
        this.height = p_height;
    }

    @Override
    public void setVel(Vector p_vel) {
        this.vel = p_vel;
    }

    @Override
    public void setAcc(Vector p_acc) {
        this.acc = p_acc;
    }

    /**
     * @param p_type the type to set
     */
    public void setType(TypeBloc p_type) {
        this.type = p_type;
    }

    // Display
    @Override
    public String toString() {
        return super.toString() + "\nType: " + this.type + "\nTransparent: " + this.transparent;
    }
}
