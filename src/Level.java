/**
 * Level
 * a class used to load all the components of a level
 */
public class Level {
    //====== Variables ======//
    private String levelPath;

    //====== Constructeur ======//
    Level (String p_levelPath) {
        this.levelPath = p_levelPath;
    }

    //====== Méthodes ======//
    //--- Accesseurs
    /**
     * @return the levelPath
     */
    public String getLevelPath() {
        return levelPath;
    }

    /**
     * @param levelPath the levelPath to set
     */
    public void setLevelPath(String levelPath) {
        this.levelPath = levelPath;
    }

    //--- Méthodes d'instance
    
    //--- Affichage
    
}
