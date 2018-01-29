package fr.elemens;

/**
 * TypeBloc
 * an enumeration of the blocs used in the graphical interface
 */
public enum TypeBloc {
    GRASS (1),
    STONE (2),
    BRICKS (3);

    private int type;

    // Constructor
    TypeBloc (int p_type) {
        this.type = p_type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
