package Person;

public class Main {
    public String name;
    public String surname;

    public Main(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String fullname(){
        return name + " " + surname;
    }

    public static void main(String[] args) {
        Main test = new Main("Ángel", "Hernández");
        System.out.println("Nombre y apellidos: " + test.fullname());
    }
}
