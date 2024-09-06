package students;

public class Students {

    int id;
    String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayInformation() {
        System.out.println("ID: " + id + ",Name: " + name);
    }
}
