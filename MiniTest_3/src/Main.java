import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MaterialManager manager = new MaterialManager();

        // Thêm 5 đối tượng Bột chiên giòn
        manager.addMaterial(new CrispyFlour("F001", "Crispy Flour 1", LocalDate.of(2023, 1, 1), 5000, 10));
        manager.addMaterial(new CrispyFlour("F002", "Crispy Flour 2", LocalDate.of(2023, 2, 1), 6000, 15));
        manager.addMaterial(new CrispyFlour("F003", "Crispy Flour 3", LocalDate.of(2023, 3, 1), 7000, 20));
        manager.addMaterial(new CrispyFlour("F004", "Crispy Flour 4", LocalDate.of(2023, 4, 1), 8000, 25));
        manager.addMaterial(new CrispyFlour("F005", "Crispy Flour 5", LocalDate.of(2023, 5, 1), 9000, 30));

        // Thêm 5 đối tượng Thịt
        manager.addMaterial(new Meat("M001", "Meat 1", LocalDate.of(2023, 1, 1), 100000, 2));
        manager.addMaterial(new Meat("M002", "Meat 2", LocalDate.of(2023, 2, 1), 120000, 2.5));
        manager.addMaterial(new Meat("M003", "Meat 3", LocalDate.of(2023, 3, 1), 140000, 3));
        manager.addMaterial(new Meat("M004", "Meat 4", LocalDate.of(2023, 4, 1), 160000, 3.5));
        manager.addMaterial(new Meat("M005", "Meat 5", LocalDate.of(2023, 5, 1), 180000, 4));

        System.out.println("Tổng tiền của 10 vật liệu: " + manager.calculateTotalAmount());

        manager.sortMaterialsByCost();
        System.out.println("Danh sách vật liệu sau khi sắp xếp theo giá:");
        manager.printMaterials();

        System.out.println("Tổng tiền sau chiết khấu: " + manager.calculateTotalDiscount());
        System.out.println("Số chênh lệch giữa chiết khấu và không chiết khấu: " + manager.calculateDiscountDifference());
    }
}