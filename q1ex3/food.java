package q1ex3;

public class food {
    String name, taste;
    double rating;
    
    public food(String name, String taste) {
        this.name = name;
        this.taste = taste;
        this.rating = 0.00;
    }
    
    public void displayAll() {
        System.out.print(name + ",");
        System.out.print(taste + ",");
        System.out.print(rating);
        System.out.print("\n\n");
    }
}
