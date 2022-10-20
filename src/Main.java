public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        String firstName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov";
        String fullName=lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника- "+fullName);

        System.out.println("Task2");
        String fullNameUpper=fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта- "+fullNameUpper);

        System.out.println("Task3");
        fullName = "Иванов Семён Семёнович";
        String fullNameCorrect=fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника- "+fullNameCorrect);

        System.out.println("Task3-1");
        char[] changeOfSymbol=fullName.toCharArray();
        for (int i = 0; i < changeOfSymbol.length-1; i++) {
            if(changeOfSymbol[i]=='ё') {
                changeOfSymbol[i] = 'е';
            }
        }
        //String fullNameNew=new String(changeOfSymbol);
        System.out.println("Данные ФИО сотрудника- "+ new String(changeOfSymbol));



    }
}