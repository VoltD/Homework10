public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println();

        // Task 2
        System.out.println("Task 2");
        System.out.println("Данные Ф. И. О. сотрудка для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();

        // Task 3
        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName.replace("ё", "е"));
        System.out.println();
    }
}