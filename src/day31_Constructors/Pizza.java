package day31_Constructors;

public class Pizza {
    public char size;//S M L thats why char we used
    public int numberOfCheeseTopping, numberOfPepperoniTopping;
    //if we declare setInfo method>> ten times it can>>> so that constructor lets do

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() { // tenary lets use>>
        double startingPrice = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;
        double totalPrice = startingPrice + (numberOfCheeseTopping+numberOfPepperoniTopping) * 2;
        return totalPrice;
    }
//it is not giving price>>>>
public String toString() {
    return "Pizza{" +
            "size=" + size +
            ", numberOfCheeseTopping=" + numberOfCheeseTopping +
            ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
            ", total price= $" + calcCost() +
            '}';
    }

}
