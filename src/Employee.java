public class Employee {
     String surname;
     String name;
     String patronymic;
     int department;
     int pay;
    static int id = 0;
    public Employee(String surname,String name,String patronymic, int department, int pay){
        this.surname = surname;
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
           for (int i = 0; i < employees.length;i++){ //Здесь решил через обычную конструкцию
              Employee employee = employees[i];
              sum = employee.getPay() + sum; //складываю все значения
           }
           double average = sum/ employees.length;// Нахожу среднюю величину зарплат
        System.out.println("Среднее значения зарплаты: " + average);
        System.out.println("Сумма всех зарплат сотрудников компании: " + sum);// вывод суммы всех зарплат сотрудников
    }
    public static void minPayEmployee(Employee[] employees){//метод для нахождения минимальной зарплаты
        int min = 100000000;//такое большое число для того чтобы первая зарплата сразу же была меньше и зачислилась в переменную min
        for (int i = 0; i< employees.length;i++){
            Employee employee = employees[i];
            if(employee.getPay() < min){ //условия для нахождения минимального значения
                min = employee.getPay();
                id = i;// номер сотрудника с наименьшей зарплатой
            }
        }
        System.out.println(employees[id] + " Это минимальная зарплата сотрудников компании.");//Печать минимального значения
    }
    public static void maxPayEmployee(Employee[] employees){//Нахождение максимального значения
        int max = -100000000;//такое маленькое число для того чтобы первая же сразу зарплата попала в переменную
        for (int i = 0; i < employees.length;i++){
            Employee employee = employees[i];
            if(employee.getPay() > max){// проверка на зарплату
                max = employee.getPay();
                id = i; // номер сотрудника с наибольшей зарплатой
            }
        }
        System.out.println(employees[id] + " Это максимальная зарплата сотрудников компании.");
    }
    public static void nameSurnamePatronymic(Employee[] employees){// метод прописывающий ФИО
        for (int i = 0; i < employees.length;i++) {
            Employee employee = employees[i];
            System.out.println("Фамилия: " + employee.getSurname() + "Имя: " + employee.getName() + "Отчество: " + employee.getPatronymic());
        }
    }
    public int getId(){
        return this.id;
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
        return "Имя сотрудника: "+ surname + name + patronymic +" Отдел: "+ department + " Зарплата: " + pay;
    }
}
