package HashCodeEquals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCodeCheck {

    public static void main(String[] args) {
        Product p1=new Product(101,"shoes");
        Product p2=new Product(101,"shoes");

        Set<Product>  set=new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set.size());

    }
}
class Product{

    private int id;
    private String name;

    public Product() {
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return id == product.id && Objects.equals(name, product.name);
    }

       // not overriding hashCode or now then check
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
