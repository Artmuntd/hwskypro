import java.util.Set;

public class Product {
    private  String name;
    private double price;
    private  double weight;
    private  boolean bought;

    public Product(String name, double price, double weight) {
       if(name!= null && !name.isEmpty() && !name.isBlank()){
           this.name = name;
       } else  {
           throw new IllegalArgumentException("заполните карточку товара полностью");
       }
       if(price > 0) {
        this.price = price;
       } else {
           throw new IllegalArgumentException("заполните карточку товара полностью");
       }
       if(weight > 0) {
        this.weight = weight;
        } else {
           throw new IllegalArgumentException("заполните карточку товара полностью");
       }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }
    public  void  addProductBasket(Set<Product> productBasket){
        if (!productBasket.contains(this)){
            productBasket.add(this);
            this.bought = true;
        } else {
            throw new UnsupportedOperationException("Продукт " + this.name + " уже находится в корзине");
        }
    }

    @Override
    public String toString() {
        return
                "Название: " + name + " " +
                "Цена: " + price + " руб" + " " +
                "Вес: " + weight + "кг";
    }
}
