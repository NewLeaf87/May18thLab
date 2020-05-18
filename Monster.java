public class Monster {
    
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.setName("Teostra");
        monster1.setType("Elder Dragon");
        monster1.setElement("Fire");
        monster1.setDeviant(false);

        System.out.println(monster1.getDeviant());
        System.out.println(monster1.getElement());
        System.out.println(monster1.getName());
        



    }

    private String name, type, element;
    private boolean deviant;

    Monster() {
        this.name ="Rathalos";
        this.element = "fire";
        this.type = "Flying";
        this.deviant = true; 
    }

    Monster(String name, boolean deviant, String type, String element) {

        this.deviant = deviant;
        this.name = name;
        this.type = type;
        this.element = element;
    }

    public String getName() {
        return name;

    }
    public String getType() {
        return type;
    }
    public String getElement() {
        return element;
    }
    public boolean getDeviant() {
        return deviant;
    } 
    public void setName(String newName) {
        name = newName;
    }
    public void setType(String newType) {
        type = newType;
}
    public void setElement(String newElement){
        element = newElement;
    }
    public void setDeviant(boolean newDeviant) {
        deviant = newDeviant;
    }


}
