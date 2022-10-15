public class Player {
    private int id;
    private String name;
    private int strange;

    public Player(int id, String name, int strange) {
        this.id = id;
        this.name = name;
        this.strange = strange;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrange() {
        return strange;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }
}
