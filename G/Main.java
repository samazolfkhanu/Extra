package G;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Gson g=new GsonBuilder().setPrettyPrinting().create();
            FileReader r=new FileReader("F:/Practice/G/G.json");
            JsonElement j=g.fromJson(r,JsonElement.class);
            List<JsonElement> l=StreamSupport.stream(j.getAsJsonArray().spliterator(),false)
                    .filter(x->(x.getAsJsonObject().get("gpa").getAsDouble())>17)
                    .collect(Collectors.toList());
            List<JsonObject> l2=l.stream()
                    .map(x->{
                        JsonObject o=new JsonObject();
                        o.add("name",x.getAsJsonObject().get("name"));
                        o.add("gpa",x.getAsJsonObject().get("gpa"));
                        return o;
                    })
                    .collect(Collectors.toList());

            PrintWriter p=new PrintWriter("F:/Practice/G/G2.json");
            g.toJson(l2,p);
            p.close();
            r.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
