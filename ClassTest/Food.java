package ClassTest;

public class Food {
    private int id;
    private int price;
    private int num;

    public Food() {

    }

    public Food(int id, int price, int num) {
        this.id = id;
        this.price = price;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
