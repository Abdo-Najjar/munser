package Munser;

/**
 *
 * @author abdo
 */
public class Room {

    private long id;
    private String name;
    private Clinet clinet;
    private static long initID;

    public Room() {
        
        this.id = initID;
        Room.initID++;
        
    }
    
    
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     * @return
     */
    public Room setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return
     */
    public Clinet getClinet() {
        return clinet;
    }

    /**
     * @param clinet
     * @return
     */
    public Room setClinet(Clinet clinet) {
        this.clinet = clinet;
        return this;
    }

    @Override
    public String toString() {

        if (this.clinet == null) {
            return "Room{" + "id=" + id + ", name=" + name + '}';

        }

        return "Room{" + "id=" + id + ", name=" + name + ", clinet=" + clinet + '}';
    }

}
