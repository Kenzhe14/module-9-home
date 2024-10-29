interface Beverage {
    double getCost();
    String getDescription();
}

class Coffee implements Beverage {

    @Override
    public double getCost() {
        return 50.0;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}

class Cacao implements Beverage {

    @Override
    public double getCost() {
        return 60;
    }

    @Override
    public String getDescription() {
        return "Cacao";
    }
}

class Latte implements Beverage {

    @Override
    public double getCost() {
        return 70;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}

class Mocha implements Beverage {

    @Override
    public double getCost() {
        return 80;
    }

    @Override
    public String getDescription() {
        return "Mocha";
    }
}

abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}

class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}

class SugarDecorator extends BeverageDecorator {

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}

class ChocolateDecorator extends BeverageDecorator {

    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 15.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate";
    }
}
class VanileDecorator extends BeverageDecorator{
    public VanileDecorator(Beverage beverage){
        super(beverage);
    }
    @Override
    public double getCost(){
        return super.getCost() + 20;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", Vanile";
    }
}

class WhippedCreamDecorator extends BeverageDecorator{

    public WhippedCreamDecorator(Beverage beverage){
        super(beverage);
    }
    @Override
    public double getCost(){
        return super.getCost() + 20;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", WhippedCream";
    }
}

public class Decorator {
    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new MilkDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new SugarDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new ChocolateDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new VanileDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        System.out.println("\nCacao");

        Beverage Cacao = new Cacao();
        System.out.println(Cacao.getDescription() + " : " + Cacao.getCost());

        Cacao = new ChocolateDecorator(Cacao);
        System.out.println(Cacao.getDescription() + " : " + Cacao.getCost());

        Cacao = new VanileDecorator(Cacao);
        System.out.println(Cacao.getDescription() + " : " + Cacao.getCost());

        Cacao = new MilkDecorator(Cacao);
        System.out.println(Cacao.getDescription() + " : " + Cacao.getCost());

        System.out.println("\nLatte");

        Beverage Latte = new Latte();
        System.out.println(Latte.getDescription() + " : " + Latte.getCost());

        Latte = new ChocolateDecorator(Latte);
        System.out.println(Latte.getDescription() + " : " + Latte.getCost());

        Latte = new VanileDecorator(Latte);
        System.out.println(Latte.getDescription() + " : " + Latte.getCost());

        Latte = new MilkDecorator(Latte);
        System.out.println(Latte.getDescription() + " : " + Latte.getCost());

        Latte = new WhippedCreamDecorator(Latte);
        System.out.println(Latte.getDescription() + " : " + Latte.getCost());

        System.out.println("\nMocha");

        Beverage Mocha = new Mocha();
        System.out.println(Mocha.getDescription() + " : " + Mocha.getCost());

        Mocha = new ChocolateDecorator(Mocha);
        System.out.println(Mocha.getDescription() + " : " + Mocha.getCost());

        Mocha = new VanileDecorator(Mocha);
        System.out.println(Mocha.getDescription() + " : " + Mocha.getCost());

        Mocha = new MilkDecorator(Mocha);
        System.out.println(Mocha.getDescription() + " : " + Mocha.getCost());

        Mocha = new WhippedCreamDecorator(Mocha);
        System.out.println(Mocha.getDescription() + " : " + Mocha.getCost());
    }
}
