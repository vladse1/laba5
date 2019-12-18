package laba5;

public class Tarel extends Dish {
    private String razmer;
    public String getRazmer() {
        return razmer;
    }
    public void setRazmer(String razmer) {
        this.razmer = razmer;
    }
    public Tarel(String material, String color, String razmer) {
        super(material, color);
        this.razmer = razmer;
    }
    @Override
    public String toString() {
        return "Tarelka{" +
                "razmer='" + razmer + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
