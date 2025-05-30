package WebScraper2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReaderWriter
{
    private String path;
    private static int count=0;

    public FileReaderWriter(String path)
    {
        if(path!=null)
            this.path=path;
        else
            throw new NullPointerException("Path can not be Null");
    }

    public void writeToFile(String adress)throws MalformedURLException , IOException
    {
        URL u=new URL(adress);
        Scanner s=new Scanner(u.openStream());
        PrintWriter p=new PrintWriter(new FileWriter(path,true));
        while(s.hasNextLine())
        {
            String line=s.nextLine();
            if(line!=null)
                p.println(line);

        }
        System.out.println("All Pages Saved!");
    }

    public void readAndWrite(String baseURL)throws IOException {
        List<String> l = Files.readAllLines(Paths.get(path));
        Iterator<String> it = l.iterator();
        Set<String> lines= new HashSet<>();
        while (it.hasNext()) {
            lines.add(it.next());
        }
        for (String line : lines)
        {
            if(line.contains("href="))
            {
                Pattern p=Pattern.compile("href=[\"']([^\"'#]+)[\"']");
                Matcher m=p.matcher(line);
                while(m.find())
                {
                    String link=m.group(1).trim();
                    if(link.isEmpty() || link.contains("javascript:void(0)"))
                        continue;
                    if(link.startsWith("http")) {
                        count++;
                        PrintWriter w = new PrintWriter("WebScraper2/" + count + ".html");
                        w.print(link);
                        w.close();
                    }
                    if(link.startsWith("/"))
                    {
                        count++;
                        PrintWriter w=new PrintWriter("WebScraper2/"+count+".html");
                        w.print(baseURL+link);
                        w.close();
                    }
                }
            }
        }
    }

    public List<String> showLink() throws FileNotFoundException {
        List<String> l=new ArrayList<>();
        for(int i=1;i<=count;i++)
        {
            Scanner s=new Scanner(new File("WebScraper2/"+i+".html"));
            while(s.hasNextLine())
            {
                l.add(s.nextLine());
            }
            s.close();
        }
        return l;
    }
}
