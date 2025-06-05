package InnerClass;

public class Main
{
    public static void main(String[] args)
    {
        PaymentProcessor.CreditCardValidator c=new PaymentProcessor.CreditCardValidator();
        System.out.println(c.validate(1234567890234567L));
    }
}
