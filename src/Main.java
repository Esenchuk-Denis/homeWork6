public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
//        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println("Ф.И.О. сотрудника - " + lastName + " " + firstName + " " + middleName);

        System.out.println("Task 2");
        String fullName2 = fullName.toUpperCase();
//        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName2);

        System.out.println("Task 3");
        String newFullName = "Иванов Семён Семёнович";
        String newFullName2 = newFullName.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника - " + newFullName2);

    }
}