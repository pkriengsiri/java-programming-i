
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int addCents = addition.cents() + this.cents();
        int addEuros = addition.euros() + this.euros();

        if (addCents > 100) {
            addCents = addCents % 100;
            addEuros++;
        }

        Money newMoney = new Money(addEuros, addCents);

        return newMoney;
    }

    public Money minus(Money decreaser) {

        int subtractCents = this.cents() - decreaser.cents();

        int subtractEuros = this.euros() - decreaser.euros();
        System.out.println(this.euros() + " " + decreaser.euros() + " " + subtractEuros);

        if (this.cents() == 0) {
            if (decreaser.cents() > 0) {
                subtractCents = 100 - decreaser.cents();
                subtractEuros--;
            }
        }

        if (subtractCents < 0) {
            subtractCents = Math.abs(subtractCents);
            subtractEuros--;
        }

        if (subtractEuros < 0) {
            subtractCents = 0;
            subtractEuros = 0;
        }

        Money newMoney = new Money(subtractEuros, subtractCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }

        if (this.euros == compared.euros()) {
            if (this.cents < compared.cents()) {
                return true;
            }
        }

        return false;
    }

}
