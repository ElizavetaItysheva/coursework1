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
          Main.getAllInfo(members);
          System.out.println("Сумма Затрат на зарплаты в месяц составляет: " + Main.getSummarySalary(members));
          System.out.println("Минимальная зарплата за текущий месяц составляет: " + Main.getMinSalary(members));
          System.out.println("Максимальная зарплата за текущий месяц составляет: " + getMaxSalary(members));
          System.out.println("Средняя зарплата за месяц составляет: " + Main.getAverageSalary(members));
          System.out.println("ФИО всех сотрудников:\n" + Main.getAllFio(members));
    }
   public static void getAllInfo(Employee[] members){
       for (Employee member : members) {
           System.out.println(member);
           System.out.println("==========================");
       }
   }
   public static int getSummarySalary(Employee[] members){
        int sum = 0;
        for (Employee member : members) {
            sum += member.getSalary();
        }
        return sum;
    }
    public static int getMinSalary(Employee[] members){
        int min = members[0].getSalary();
        for (Employee member : members) {
            int current = member.getSalary();
            if (min > current) {
                min = current;
            }
        }
        return min;
    }
    public static int getMaxSalary(Employee[] members){
        int max = members[0].getSalary();
        for(Employee member : members) {
            int current2 = member.getSalary();
            if(max < current2) {
                max = current2;
            }
        }
        return max;
    }
    public static int getAverageSalary(Employee[] members){
        int max1 =  getMaxSalary(members);
        return max1 / 10;
    }
    public static String getAllFio(Employee[] members){
        StringBuilder string = new StringBuilder();
        for (Employee employee: members) {
            string.append(employee.getFio()).append("\n");
        }
        return String.valueOf(string);
    }

}
