import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product>productBasket = new HashSet<>();

        Product bananas = new Product("Бананы", 50.8, 1.7);
        Product egg = new Product("Яйцо", 20.0, 0.1);
        Product bread = new Product("Хлеб", 10.8, 2.7);
        Product meet = new Product("Бананы", 60.8, 4.7);
        Product tomat = new Product("Помидоры", 30.8, 0.9);
        Product orange = new Product("Апельсин", 60.1, 2.0);

        bananas.addProductBasket(productBasket);
        egg.addProductBasket(productBasket);
        bread.addProductBasket(productBasket);
        meet.addProductBasket(productBasket);
        tomat.addProductBasket(productBasket);
        orange.addProductBasket(productBasket);

        productBasket.remove(meet);
        System.out.println(productBasket);

        System.out.println("салаты");

        Set<Recipe> allRepice = new HashSet<>();
        Recipe salad1 = new Recipe("Салат");
        Recipe salad2 = new Recipe("Олевье");
        Recipe salad3 = new Recipe("Мимоза");

        salad1.addProduct(egg,tomat);
        salad2.addProduct(meet);
        salad3.addProduct(egg);

        salad1.addNameRepice(allRepice);
        salad2.addNameRepice(allRepice);
        salad3.addNameRepice(allRepice);


        System.out.println("Числа");

        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 21; i++) {
            integers.add((int) (Math.random()* 1000) +1);
        }
        integers.removeIf(integer -> integer % 2 !=0);
        System.out.println(integers);
    }
}