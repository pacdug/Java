import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MaterialManager {
    private List<Material> materials;

    public MaterialManager() {
        materials = new ArrayList<>();
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void removeMaterialById(String id) {
        materials.removeIf(material -> material.getId().equals(id));
    }

    public void updateMaterial(Material updatedMaterial) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(updatedMaterial.getId())) {
                materials.set(i, updatedMaterial);
                break;
            }
        }
    }

    public double calculateTotalAmount() {
        return materials.stream().mapToDouble(Material::getAmount).sum();
    }

    public void sortMaterialsByCost() {
        materials.sort((m1, m2) -> Integer.compare(m1.getCost(), m2.getCost()));
    }

    public double calculateTotalDiscount() {
        return materials.stream().mapToDouble(material -> {
            if (material instanceof Discount) {
                return ((Discount) material).getRealMoney();
            }
            return material.getAmount();
        }).sum();
    }

    public double calculateDiscountDifference() {
        return calculateTotalAmount() - calculateTotalDiscount();
    }

    public void printMaterials() {
        materials.forEach(System.out::println);
    }
}
