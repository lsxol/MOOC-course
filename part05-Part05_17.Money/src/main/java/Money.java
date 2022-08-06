
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
    Money newMoney = new Money(this.euros + addition.euros,this.cents + addition.cents);// create a new Money object that has the correct worth

    // return the new Money object
    return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(compared.euros() > this.euros)
        {
            return true;
        }else if(compared.euros() == this.euros && compared.cents() > this.cents){
            return true;
        }else{
            return false;
        }
    }

    
    public Money minus(Money decreaser){
        
        int cents1 = this.cents;
        int euros1 = this.euros;
        int cents2 = decreaser.cents();
        int euros2 = decreaser.euros();
        
        if(cents1 < cents2){
            cents2 = cents2 - cents1;
            cents1 = 100 - cents2;
            euros1--;
        }
        
        if (cents1 < 0){
            cents1 = 0;
        }
        
        if(euros1 >= euros2){
            euros1 = euros1 - euros2;
        }else{
            cents1 = 0;
            euros1 = 0;
        }
        
        
        Money newMoney = new Money(euros1, cents1);
        
        return newMoney;
    }
}
