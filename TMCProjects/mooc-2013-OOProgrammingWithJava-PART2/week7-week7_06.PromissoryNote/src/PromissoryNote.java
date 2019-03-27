import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> loanList;
    public PromissoryNote(){
        this.loanList = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value){
        this.loanList.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose){
        System.out.println(this.loanList.values());
        if (this.loanList.keySet().contains(whose))return this.loanList.get(whose);
        else return 0;
    }
}
