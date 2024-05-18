public class Main {
    public static void main(String[] args) {
        System.out.println("Тема ДЗ Строки String");

        byte dZ = 0;
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        String firstName = "Feofantiy";
        String middleName = "Sarasvatievich";
        String lastName = "Timiryazev";
        String fullName =  lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника – " +fullName);
        ///////////
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //////////////
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " +fullName.replace("ё", "е"));
    }
}