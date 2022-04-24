public class Main {
    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee(
                "Petr",
                11111,
                "QA Engineer",
                22,
                "petr@mail.ru",
                "70951111111"
        );

        employeeArray[1] = new Employee(
                "Karp",
                22222,
                "middle QA Engineer",
                22,
                "karp@mail.ru",
                "70952222222"
        );

        employeeArray[2] = new Employee(
                "Cola",
                33333,
                "QA Engineer",
                33,
                "cola@gmail.com",
                "70953333333"
        );

        employeeArray[3] = new Employee(
                "Peps",
                44444,
                "middle QA Engineer",
                44,
                "peps@mail.ru",
                "70954444444"
        );

        employeeArray[4] = new Employee(
                "Idea",
                55555,
                "QA Engineer",
                55,
                "idea@mail.ru",
                "70955555555"
        );


        for (int i = 0; i < employeeArray.length; i++)
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].infoEmployee();
            }
    }
}
