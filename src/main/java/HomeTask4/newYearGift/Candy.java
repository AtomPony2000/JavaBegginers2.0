package HomeTask4.newYearGift;

public class Candy implements Goods {

    String name;
    int weight;
    int price;
    int id;

    public Candy(String name, int price, int weight, int id) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.id = id;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {

    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {

    }
}
