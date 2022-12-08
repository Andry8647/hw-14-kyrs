public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;
    private int department;
    private int pay;
    private final int id ;
    private static int counter = 0;
   //
    public Employee(String surname,String name,String patronymic, int department, int pay){
        this.surname = surname;
        this.id = counter++;
        this.name=name;
        this.patronymic = patronymic;
        this.department = department;
        this.pay = pay;




    }
    public static void printEmployee(Employee[] employees){ //Печать всех сотрудников по списку
        for (Employee employee: employees){ //использовал foreach
            System.out.println(employee);

        }
    }
    public static void sumPayEmployee(Employee[] employees){ // метод для нахождения суммы всех зарплат
        double sum = 0;
           for (int i = 0; i < employees.length;i++) { //Здесь решил через обычную конструкцию
               if (employees[i] != null) {
                   Employee employee = employees[i];
                   sum = employee.getPay() + sum; //складываю все значения
               }
           }
           double average = sum/ employees.length;// Нахожу среднюю величину зарплат
        System.out.println("Среднее значения зарплаты: " + average);
        System.out.println("Сумма всех зарплат сотрудников компании: " + sum);// вывод суммы всех зарплат сотрудников

    }
    public static void minPayEmployee(Employee[] employees){//метод для нахождения минимальной зарплаты
         int a = 0;
        int min = 100000000;//такое большое число для того чтобы первая зарплата сразу же была меньше и зачислилась в переменную min
        for (int i = 0; i< employees.length;i++) {
            if (employees[i] != null) {
                Employee employee = employees[i];
                if (employee.getPay() < min) { //условия для нахождения минимального значения
                    min = employee.getPay();
                    a = i;// номер сотрудника с наименьшей зарплатой
                }
            }
        }
        System.out.println(employees[a] + " Это минимальная зарплата сотрудников компании.");//Печать минимального значения
    }
    public static void maxPayEmployee(Employee[] employees){//Нахождение максимального значения
        int a = 0;
        int max = -100000000;//такое маленькое число для того чтобы первая же сразу зарплата попала в переменную
        for (int i = 0; i < employees.length;i++){
            if (employees[i] != null) {
            Employee employee = employees[i];
            if(employee.getPay() > max){// проверка на зарплату
                max = employee.getPay();
                a = i; // номер сотрудника с наибольшей зарплатой
            }
        }
        }
        System.out.println(employees[a] + " Это максимальная зарплата сотрудников компании.");
    }
    public static void nameSurnamePatronymic(Employee[] employees){// метод прописывающий ФИО
        for (int i = 0; i < employees.length;i++) {
            if (employees[i] != null) {
            Employee employee = employees[i];
            System.out.println("Фамилия: " + employee.getSurname() + "Имя: " + employee.getName() + "Отчество: " + employee.getPatronymic());
        }
            }
    }



    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getPatronymic(){
        return this.patronymic;
    }
    public int getDepartment(){
        return this.department;
    }
    public int getPay(){
        return this.pay;
    }
    public void setDepartment(int department){
        this.department = department;
    }
    public void setPay(int pay){
        this.pay = pay;
    }
    @Override
    public String toString() {
        return "Номер: " + id +" Имя сотрудника: "+ surname + name + patronymic +" Отдел: "+ department + " Зарплата: " + pay;
    }

}
