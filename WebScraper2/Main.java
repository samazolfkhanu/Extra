package WebScraper2;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            FileReaderWriter f=new FileReaderWriter("F:/Practice/WebScraper2/All.html");
            f.writeToFile("https://www.znu.ac.ir/");
            f.readAndWrite("https://www.znu.ac.ir/");
            List<String> l=f.showLink();
            l.stream()
                    .forEach(System.out::println);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
