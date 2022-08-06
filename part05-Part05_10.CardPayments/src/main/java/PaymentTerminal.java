
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if(payment < 2.50){
            return payment;
        }else{
            this.affordableMeals++;
            this.money = this.money + 2.50;
            return payment - 2.50;
        }
        
    }
    public boolean eatAffordably(PaymentCard card) {
        if(!card.takeMoney(2.50)){
            return false;
        }else{
            this.affordableMeals++;
            return true;
        }
    }
    
    public double eatHeartily(double payment) {
        if(payment < 4.30){
            return payment;
        }else{
            this.heartyMeals++;
            this.money = this.money + 4.30;
            return payment - 4.30;
        }
    }
    
    public boolean eatHeartily(PaymentCard card) {
        if(!card.takeMoney(4.30)){
            return false;
        }else{
            this.heartyMeals++;
            return true;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0){
            card.addMoney(sum);
            this.money = this.money + sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
