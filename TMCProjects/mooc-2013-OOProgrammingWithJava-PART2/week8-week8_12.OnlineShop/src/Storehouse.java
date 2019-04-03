import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stockList;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stockList = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.stockList.put(product, stock);
        this.prices.put(product, price);
    }

    public int price(String product) {
        if (this.stockList.containsKey(product)) return this.prices.get(product);
        else return -99;
    }

    public int stock(String product) {
        if (this.stockList.containsKey(product)) return this.stockList.get(product);
        else return 0;
    }

    public boolean take(String product) {
        if (this.stockList.containsKey(product) && this.stockList.get(product)>0){
            int temp = this.stockList.get(product)-1;
            this.stockList.put(product,temp);
            return true;
        }
        else return false;
    }

    public Set<String> products(){
        return this.stockList.keySet();
    }
}
