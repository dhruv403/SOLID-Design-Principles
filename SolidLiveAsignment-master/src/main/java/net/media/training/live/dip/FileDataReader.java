package net.media.training.live.dip;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;

import java.util.Base64;

public class FileDataReader implements  Reader{
    private String filePath;
    public FileDataReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read()  {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
            return content.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


//            BufferedReader reader = new BufferedReader(new FileReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt"));
//            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt"));
//            String aLine;
//            while ((aLine = reader.readLine()) != null) {
//                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
//                writer.write(encodedLine);
//            }
//            writer.flush();
//            writer.close();
//            reader.close();


        }
    }
}
