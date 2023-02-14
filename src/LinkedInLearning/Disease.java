package LinkedInLearning;

public class Disease {

    private String name;
    private boolean Curable;

    public Disease(String name, boolean curable) {
        this.name = name;
        this.Curable = curable;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCurable() {
        return this.Curable;
    }

    public void setCurable(boolean curable) {
        this.Curable = curable;
    }



}
