package net.media.training.live.dip;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.URL;

public class UrlDataReader implements Reader {
    private URL url;

    public UrlDataReader(URL url) {
        this.url = url;
    }

    @Override
    public String read()  {
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder content = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            content.append((char) c);
        }
        reader.close();
        return content.toString();
    }
}