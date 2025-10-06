package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Setter
@AllArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower other) {
        this.sepalLength = other.sepalLength;
        this.color = other.color;
        this.price = other.price;
        this.flowerType = other.flowerType;
    }
    
    public Flower() {
        this.sepalLength = 0;
        this.color = FlowerColor.RED;
        this.price = 0;
        this.flowerType = FlowerType.CHAMOMILE;
    }

    public String getColor() {
        return color.toString();
    }
}
