import java.net.*;
import java.io.*;
import java.util.List;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        //String json = readUrl("http://www.javascriptkit.com/dhtmltutors/javascriptkit.json"); // works
        String json = readUrl("https://sanctions.nazk.gov.ua/api/person/53"); // doesn't work
        System.out.println("no");
        Gson gson = new Gson();
        Page page = gson.fromJson(json, Page.class);
        System.out.println(page.title);
        for (Item item : page.items)
            System.out.println("    " + item.title);
    }

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            // added the below two lines to try to set user agent, but it didn't help
            URLConnection hc = url.openConnection();
            hc.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            System.out.println("Works till here, next line fails");
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);
            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

    static class Item {
        String title;
        String link;
        String description;
    }

    static class Page {
        String title;
        String link;
        String description;
        String language;
        List<Item> items;
    }

}


