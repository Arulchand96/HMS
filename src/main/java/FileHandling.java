
import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Dell\\Desktop\\Busoft.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        int wordCount = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String words[] = line.split("\\s+");
                wordCount += words.length;
            }
        System.out.println("Total word count = "
                + wordCount);
    }

    }

