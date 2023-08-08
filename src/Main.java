import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            String name = "Элдияр";
            System.out.println("Введите имя");
            People Eldiar = new People("Элдияр", 18, "Бишкек");
            People Azat = new People("Азат", 19, "Военно-Антоновка");
            People Denic = new People("Денис", 13, "Сокулук");
            People Dina = new People("Дина",23, "7-ой миррайоан");
            People Masha = new People("Маша", 32, "Талас");
            String namePeople = s.nextLine();
            switch (namePeople) {
                case "Eldiar":
                    System.out.println(Eldiar);
                    break;
                case "Azat":
                    System.out.println(Azat);
                    break;
                case "Denic":
                    System.out.println(Denic);
                    break;
                case "Dina":
                    System.out.println(Dina);
                    break;
                case "Masha":
                    System.out.println(Masha);
                    break;

            }
        }
    }
}
class People {
    String name;
    int age;
    String adress;

    public People(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Человек{" +
                "имя='" + name + '\'' +
                ", лет=" + age +
                ", адресс='" + adress + '\'' +
                '}';
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}