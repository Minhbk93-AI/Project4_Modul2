package exercise08;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1));
            employees[i] = new Employee();
            employees[i].inputData();
            employees[i].calSalary();
        }

        // Hiển thị thông tin của tất cả các nhân viên
        System.out.println("Danh sách thông tin các nhân viên:");
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayData();
            System.out.println();
        }
    }
}

