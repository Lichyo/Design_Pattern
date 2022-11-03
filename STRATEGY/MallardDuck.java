package STRATEGY;

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display()
    {
        System.out.println("I'am Mallard Duck.");
    }
}
