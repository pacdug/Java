import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaterialManager {
    private List<Material> materials;

    public MaterialManager() {
        materials = new ArrayList<>();
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void removeMaterial(String id) {
        materials.removeIf(material -> material.getId().equals(id));
    }

    public Material findMaterialById(String id) {
        for (Material material : materials) {
            if (material.getId().equals(id)) {
                return material;
            }
        }
        return null;
    }

    public double calculateTotalAmount() {
        double total = 0;
        for (Material material : materials) {
            total += material.getAmount();
        }
        return total;
    }

    public double calculateTotalRealMoney() {
        double total = 0;
        for (Material material : materials) {
            if (material instanceof Discount) {
                total += ((Discount) material).getRealMoney();
            } else {
                total += material.getAmount();
            }
        }
        return total;
    }

    public void sortMaterialsByCost() {
        materials.sort(Comparator.comparingInt(Material::getCost));
    }

    public void printMaterials() {
        for (Material material : materials) {
            System.out.println(material.getName() + " - Amount: " + material.getAmount() + " - RealMoney: " + ((Discount) material).getRealMoney());
        }
    }
}
