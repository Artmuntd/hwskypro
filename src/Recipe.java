import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Recipe {
    private Set<Product> productSet;
    private  int summ;
    private String name;

    public Recipe( String name) {
        this.summ = summ;
        this.name = name;
        this.productSet = new HashSet<>();
    }

    public int getSumm() {
        return summ;
    }

    public String getName() {
        return name;
    }
    public  void addProduct(Product... products){
        this.productSet.addAll(Arrays.asList(products));
        for(Product product : this.productSet){
            this.summ += product.getPrice();
        }
    }
    public  void  addNameRepice(Set<Recipe> recipesSet){
        if (!recipesSet.contains(this)){
            recipesSet.add(this);
        } else {
            throw new UnsupportedOperationException("Продукт " + this.name + " есть");
        }
    }
}
