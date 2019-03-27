public class Bird {
    private String name;
    private String latinName;
    private int observation;
    public Bird(){
        this.name = "";
        this.latinName = "";
    }
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }
    public String getName(){
        return this.name;
    }
    public String getLatinName(){
        return this.latinName;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " observations";
    }

    public void observe() {
        this.observation++;
    }
}
