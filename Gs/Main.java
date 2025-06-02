package Gs;

import com.google.gson.*;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Gson g=new GsonBuilder().setPrettyPrinting().create();
            FileReader p=new FileReader("F:/Practice/Gs/Gs1.json");
            PrintWriter r=new PrintWriter("F:/Practice/Gs/Gs2.json");
            JsonElement j=g.fromJson(p,JsonElement.class);
            Map<String,Integer> s=StreamSupport.stream(j.getAsJsonArray().spliterator(),false)
                    .collect(Collectors.groupingBy((x->x.getAsJsonObject().get("customer").getAsString()),Collectors.summingInt(x->x.getAsJsonObject().get("amount").getAsInt())));

            JsonArray a=new JsonArray();
            for(Map.Entry<String,Integer> u:s.entrySet())
            {
                JsonObject o=new JsonObject();
                o.addProperty("customer",u.getKey());
                o.addProperty("Total Price",u.getValue());
                a.add(o);
            }
            g.toJson(a,r);
            p.close();
            r.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
