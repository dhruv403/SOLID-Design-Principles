package net.media.training.live.dip;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    private Reader reader;
    private Writer writer;

    public void EncodingModule(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void encode() {
        try {
            String inputString = reader.read();
            String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
            writer.write(encodedString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws MalformedURLException {
        // Encoding with files
        Reader fileReader = new FileDataReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt");
        Writer fileWriter = new FileDataWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt");
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter);
        fileEncodingModule.encode();

        // Encoding with URL and Database
        Reader urlReader = new UrlDataReader(new URL("http", "myfirstappwith.appspot.com", "index.html"));
        Writer databaseWriter = new MyDatabase();
        EncodingModule networkDatabaseEncodingModule = new EncodingModule(urlReader, databaseWriter);
        networkDatabaseEncodingModule.encode();
    }

}

