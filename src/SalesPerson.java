public class SalesPerson {
    // each object contains details of one salesperson
    private String id;
    private Sales[] salesHistory; // details of the different sales
    private int count = 0; // number of sales made

//constructor for a new salesperson
    public SalesPerson(String id){
        this.id = id;
        this.salesHistory = new Sales[100];
    }
// constructor for a salesperson transferred (together with their sales details) from another branch
    public SalesPerson(String id, Sales[] s, int c){
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }
    public int getCount(){return count;}
    public String getId() {return id;}
    public void setSalesHistory(Sales s){
        int c = getCount();
        this.salesHistory[c] = s;
        this.count = this.count + 1;
    }
    public Sales getSalesHistory(int i) {
        return salesHistory[i];
    }
    public double calcTotalSales(){
// calculates total sales for the salesperson
        double total = 0.00;
        for (int i = 0; i < this.count; i++) {
            total = total + salesHistory[i].getValue() * salesHistory[i].getQuantity();
        }
        return total;
    }

    public Sales largestSale(){
// calculates the sale with the largest value
// code missing
        return salesHistory[0];
    }
}

