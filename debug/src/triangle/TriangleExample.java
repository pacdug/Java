package triangle;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("nhap canh thu nhat : ");
            double side1 = scanner.nextDouble();

            System.out.println("nhap canh thu hai : ");
            double side2 = scanner.nextDouble();

            System.out.println("nhap canh thu ba : ");
            double side3 = scanner.nextDouble();

            validateTriangle(side1,side2,side3);
        }catch (Exception e) {
            System.out.println("Lỗi:  " + e.getMessage());
        }finally{
            scanner.close();
        }
    }

    public static void validateTriangle(double side1, double side2, double side3) throws Exception {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new Exception("Cac canh tam giac khong the <= 0 !");
        }
        if (side1 + side3 <= side2 && side2 + side3 <= side1 && side1 + side3 <= side2) {
            throw new Exception("Cac canh tam giac khong the <= 0 !");
        }
    }
}
