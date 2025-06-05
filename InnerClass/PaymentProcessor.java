package InnerClass;

public class PaymentProcessor
{
    public static class CreditCardValidator
    {
        public boolean validate(Long num)
        {
            int count=0;
            while(num>0)
            {
                num=num/10;
                count++;
            }
            if(count==16)
                return true;
            return false;
        }
    }
}
