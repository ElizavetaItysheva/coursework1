public class Main {
    public static Employee[] members = new Employee[10];
    public static void main( String[] args ) {
        members[0] = new Employee("Горошина Евгения Константиновна", 1, 40000, 1);
        members[1] = new Employee("Глебов Алексей Иванович", 2, 30000, 2);
        members[2] = new Employee("Иванова Таисия Михайловна", 3, 20000, 3);
        members[3] = new Employee("Михайлов Александр Олегович", 4, 100_000, 4);
        members[4] = new Employee("Олежкина Ольга Денисовна", 5, 35000, 5);
        members[5] = new Employee("Денисов Павел Дмитриевич", 1, 42000, 6);
        members[6] = new Employee("Костина Дарья Павловна", 2, 33000, 7);
        members[7] = new Employee("Павлов Кирилл Данилович", 3, 25000, 8);
        members[8] = new Employee("Данилова Екатерина Сергеевна", 4, 90_000, 9);
        members[9] = new Employee("Ильин Сергей Петрович", 5, 32000, 10);
          Main.getAllInfo();
          System.out.println("Сумма Затрат на зарплаты в месяц составляет: " + Main.getSummarySalary());
          System.out.println("Сотрудник с минимальной зарплатой - " + Main.getMinSalary());
          System.out.println("Сотрудник с максимальной зарплатой - " + Main.getMaxSalary());
          System.out.println("Средняя зарплата за месяц составляет: " + Main.getAverageSalary());
          System.out.println("ФИО всех сотрудников:\n" + Main.getAllFio());
    }
   public static void getAllInfo(){ // а
       for (Employee member : members) {
           System.out.println(member);
           System.out.println("==========================");
       }
   }
   public static int getSummarySalary(){ // b
        int sum = 0;
        for (Employee member : members) {
            sum += member.getSalary();
        }
        return sum;
    }
    public static Employee getMinSalary(){ // с
        Employee min = members[0];
        for (Employee member : members) {
            if (member.getSalary() < min.getSalary()) {
                min = member;
            }
        }
        return min;
    }

    public static Employee getMaxSalary(){ // d
        Employee max = members[0];
        for (Employee member : members) {
            if (member.getSalary() > max.getSalary()) {
                max = member;
            }
        }
        return max;
    }
    public static int getAverageSalary(){ // e
        int max1 =  getSummarySalary();
        return max1 / 10;
    }
    public static String getAllFio(){ // f
        StringBuilder string = new StringBuilder();
        for (Employee employee: members) {
            string.append(employee.getFio()).append("\n");
        }
        return String.valueOf(string);
    }

}
