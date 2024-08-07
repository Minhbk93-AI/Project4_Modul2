package exercise09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo mảng đối tượng Student có độ dài 100
        Student[] students = new Student[100];
        int currentIndex = 0;

        Scanner scanner = new Scanner(System.in);
        int choice;

        // Menu chức năng
        do {
            System.out.println("\nMenu chức năng:");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1:
                    // Hiển thị danh sách tất cả học sinh
                    if (currentIndex == 0) {
                        System.out.println("Danh sách học sinh trống.");
                    } else {
                        for (int i = 0; i < currentIndex; i++) {
                            students[i].displayData();
                            System.out.println();
                        }
                    }
                    break;
                case 2:
                    // Thêm mới học sinh
                    students[currentIndex] = new Student();
                    students[currentIndex].inputData();
                    currentIndex++;
                    System.out.println("Thêm học sinh thành công.");
                    break;
                case 3:
                    // Sửa thông tin học sinh dựa vào mã học sinh
                    System.out.print("Nhập mã học sinh cần sửa thông tin: ");
                    int editId = Integer.parseInt(scanner.nextLine());

                    boolean check = false;
                    for (int i = 0; i < currentIndex; i++) {
                        if (students[i].getStudentId() == editId) {
                            students[i].inputData();
                            check = true;
                            System.out.println("Sửa thông tin thành công.");
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("Không tìm thấy học sinh có mã " + editId);
                    }
                    break;
                case 4:
                    // Xoá học sinh dựa vào mã học sinh
                    System.out.print("Nhập mã học sinh cần xoá: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());

                    boolean deleted = false;
                    for (int i = 0; i < currentIndex; i++) {
                        if (students[i].getStudentId() == deleteId) {
                            // Dịch chuyển các phần tử phía sau lên để xoá
                            for (int j = i; j < currentIndex - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            currentIndex--;
                            deleted = true;
                            System.out.println("Xoá học sinh thành công.");
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Không tìm thấy học sinh có mã " + deleteId);
                    }
                    break;
                case 5:
                    // Thoát khỏi chương trình
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}

