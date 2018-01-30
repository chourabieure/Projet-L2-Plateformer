package fr.tiles;

/**
 * TypeBloc
 * an enumeration of the blocs used in the graphical interface
 */
public enum TypeBloc {
    GRASS (1, "Grass"),
    STONE (2, "Stone"),
    BRICKS (3, "Bricks");

    private int type;
    private String des;

    // Constructor
    TypeBloc (int p_type, String p_des) {
        this.type = p_type;
        this.des = p_des;
    }

    public int getType () { return this.type; }
    public String getDes () { return this.des; }

    @Override
    public String toString () { return this.des; }
}
