package global.goit;


import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        String studentJson = new Gson().toJson(new Student("Oleg", "Anikin"));
        System.out.println(studentJson);
    }

    static class Student {
        private final String name;
        private final String surname;

        public Student(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
    }
}
