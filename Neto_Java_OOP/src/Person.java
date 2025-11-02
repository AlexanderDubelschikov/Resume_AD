public class Person {

    private String name;
    public int age;

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void happyBirthday(){
        age++;
        System.out.println("Поздравляем с " + age + " днем рождения!");
    }

    public boolean isTooYoung() {
        if (age < 18) {
            return true;
        } else {
            return false;
        }

    }
}
