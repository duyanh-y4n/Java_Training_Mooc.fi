import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> purchaseList;

    public ShoppingBasket() {
        this.purchaseList = new HashMap<String, Purchase>();
    }

    public int price() {
        int sum = 0;
        for (Purchase purchase :
                this.purchaseList.values()) {
            sum += purchase.price();
        }
        return sum;
    }

    public void add(String product, int price) {
        if (this.purchaseList.containsKey(product)) {
            Purchase temp = this.purchaseList.get(product);
            temp.increaseAmount();
            this.purchaseList.put(product, temp);
        } else this.purchaseList.put(product, new Purchase(product,1,price));

    }

    public void print() {
        for (Purchase purchase :
                this.purchaseList.values()) {
            System.out.println(purchase);
        }
    }
}
