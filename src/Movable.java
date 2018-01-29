/**
 * Movable
 */
public class Movable extends Element {
    //====== Constructeur ======//
    Movable (Position p_pos, double p_width, double p_height, Vector p_vel, Vector p_acc) {
        this.pos = p_pos;
        this.width = p_width;
        this.height = p_height;
        this.vel = p_vel;
        this.acc = p_acc;
    }

    //====== Méthodes ======//
    //--- Accesseurs
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

    //--- Méthodes d'instance
    @Override
    public void apllyForce(Vector force) {
        this.pos.setX(this.vel.getX());
        this.pos.setY(this.vel.getY());
        this.vel.add(this.acc);
        this.acc.set(0, 0);
    }

    //--- Affichage
    @Override
    public String toString() {
        return super.toString() + "Movable";
    }
}
