package pp4_6.Flowers;

public class Flower {
    private String flower_name;
    private int flower_freshness;
    private int stem_length;
    private int price;

    public String getFlower_name() {
        return flower_name;
    }
    public void setFlower_name(String flower_name) {
        this.flower_name = flower_name;
    }

    public int getFlower_freshness() {
        return flower_freshness;
    }
    public void setFlower_freshness(int flower_freshness) {
        this.flower_freshness = flower_freshness;
    }

    public int getStem_length() {
        return stem_length;
    }
    public void setStem_length(int stem_length) {
        this.stem_length = stem_length;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
