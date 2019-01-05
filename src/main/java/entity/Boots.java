package entity;
/**
 * Created by Admin on 2019-01-05.
 */
public class Boots extends Product {
    private int size;
    private boolean isNaturalSkin;


    public Boots(Long id, String productName, Float price, Float weight, String color, Integer productCount, int size, boolean isNaturalSkin) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize() {
        return size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return super.toString() + "Boots{" +
                "size='" + size + '\'' +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }

}
