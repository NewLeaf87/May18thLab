import javax.tools.DocumentationTool.Location;

public class Pet {

    public static void main(String[] args) {
        Pet pet2 = new Pet();
        pet2.setName("Gora");
        pet2.setAge(6);
        pet2.setLocation("moon");
        pet2.setType("Elder Dragon");
        Pet pet1 = new Pet ("Cap", 1, "matt", "Golden retriv");
        System.out.println(pet2.getAge());
        System.out.println(pet2.getLocation());
        System.out.println(pet2.getName());
        System.out.println(pet2.getType());
    

    }

    private String name, Location, type;
    private int age;

    Pet() {
        this.name = "Harry";
        this.age = 3;
        this.Location ="NC";
        this.type = "dog";

    }

    Pet(String name, int age, String location, String type) {

        this.name = name;
        this.age = age;
        this.Location = location;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return Location;
    }

    public String getType() {
        return type;
    }
 public int getAge() {
    return age;
 }

 public void setAge(int newAge) {
     age = newAge;

 }
 public void setName(String newName) {
    name = newName;
 }
 public void setLocation(String newLocation) {
     Location = newLocation;
 }
 public void setType(String newType) {
     type = newType;
 }
    
}