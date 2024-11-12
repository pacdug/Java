public class Main{
    public static void main(String[] args) {
        Company company = new Company(10);

        company.addEmployee(new FullTimeEmployee("E001", "Alice", 30, "123456789", "alice@example.com", 5000, 1000, 20000));
        company.addEmployee(new FullTimeEmployee("E002", "Bob", 25, "987654321", "bob@example.com", 3000, 500, 18000));
        company.addEmployee(new PartTimeEmployee("E003", "Charlie", 22, "555666777", "charlie@example.com", 40));
        company.addEmployee(new PartTimeEmployee("E004", "David", 28, "888999000", "david@example.com", 35));

        System.out.println("Average salary: " + company.calculateAverageSalary());
        System.out.println("Full-time employees with salary below average:");
        company.listFullTimeEmployeesBelowAverage();
        System.out.println("Total part-time salary: " + company.calculateTotalPartTimeSalary());
    }
}


