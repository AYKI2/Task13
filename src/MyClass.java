import java.util.Arrays;

public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String[] lessons;
    private String favoriteFood;

    public MyClass() {

    }

    public MyClass(String name, String surname, int age, String favoriteFood) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }
    public MyClass(String name, String surname, int age, String[] lessons, String favoriteFood) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lessons = lessons;
        this.favoriteFood = favoriteFood;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }else {
            System.out.println("Возраст не может быть отрицательным!");
        }
    }

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void print(){
        System.out.println("\nИмя: "+getName());
        System.out.println("Фамилия: "+getSurname());
        System.out.println("Возраст: "+getAge());
        System.out.println("Занятия: "+Arrays.toString(getLessons()));
        System.out.println("Любимое блюдо: "+getFavoriteFood());
        System.out.println();
    }
}
