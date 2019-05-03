public class OrderDrink {
    public static void main(String[] args) {
        Drink drink1 = new Drink();

        drink1.name = "Cuba Libre";
        drink1.isAlcohol = true;
        drink1.price = 12.5;
        drink1.ingredient1 = new Ingredients();
        drink1.ingredient2 = new Ingredients();
        drink1.ingredient3 = new Ingredients();
        drink1.ingredient1.element = "Coca-cola";
        drink1.ingredient1.amount = 120;
        drink1.ingredient2.element = "lemon juice";
        drink1.ingredient2.amount = 10;
        drink1.ingredient3.element= "rum";
        drink1.ingredient3.amount = 50;

        System.out.println(drink1.name + " cost " + drink1.price + "zł and contains alcohol: "
                +drink1.isAlcohol +" --> "+ drink1.ingredient3.amount  +"ml of "+ drink1.ingredient3.element +
                ", "+drink1.ingredient2.amount + "ml of "+drink1.ingredient2.element+", "+drink1.ingredient1 .amount
                + "ml of "+ drink1.ingredient1 .element + " and it gives in total " +
                (drink1.ingredient1.amount+drink1.ingredient2.amount+drink1.ingredient3.amount)+"ml of nice enjoyment.");
    }
}
