import fr.tiles.*;

public class Main {
    public static void main (String agrs[]) {
        Position pos = new Position(0., 2.); System.out.println(pos);
        Vector vect = new Vector(3., 0.); System.out.println(vect);
        Bloc bloc = new Bloc(pos, 20., 30., TypeBloc.BRICKS, true); System.out.println(bloc);
        Movable mov = new Movable(pos, 20., 30., vect, vect); System.out.println(mov);
    }
}

