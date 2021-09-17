
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;

public class FileHandling  {

//3.Find the word count in "Busoft.txt" text file?
    public static void wordsCount() {
        try {
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
            System.out.println("The Number of words: "
                    + wordCount);
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex2) {
            ex2.printStackTrace();
        }
    }

//4. Find the each words with their counts in "Busoft.txt" text file?
    public static void findEachWords() throws FileNotFoundException {
        try {
            File f = new File("C:\\Users\\Dell\\Desktop\\Busoft.txt");
            ArrayList arr = new ArrayList();
            HashMap<String, Integer> listOfWords = new HashMap<String, Integer>();
            Scanner in = new Scanner(f);
            int i = 0;
            while (in.hasNext()) {
                String s = in.next();
                //System.out.println(s);
                arr.add(s);
            }
            Iterator itr = arr.iterator();
            while (itr.hasNext()) {
                i++;

                listOfWords.put((String) itr.next(), i);
                System.out.println(listOfWords);    //for Printing the words
            }

            Set<Object> uniqueValues = new HashSet<Object>(listOfWords.values());

            System.out.println("The number of unique words: " + uniqueValues.size());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex2) {
            ex2.printStackTrace();
        }
    }

//5.Find the given word's count from "Busoft.txt" text file?- Use scanner to get the word i/p from user - Need to handling exception
    public static void getInputFromUser() {

        try {
        int cnt=0;
        String s;
        String[] buffer;
        File file = new File("C:\\Users\\Dell\\Desktop\\Busoft.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String wrd=sc.nextLine();
        while((s=bufferedReader.readLine())!=null)
        {
            buffer=s.split(" ");
            for (String chr : buffer)
            {
                if (chr.equals(wrd))
                {
                    cnt++;
                }
            }
        }
        if(cnt==0)
        {
            System.out.println("Word not found!");
        }
        else
        {
            System.out.println("Word : "+wrd+" found! Count : "+cnt);
        }
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    } catch (IOException ex2) {
        ex2.printStackTrace();
    }


    }



    /*public static void main(String[] args) throws IOException {

        try {
           // Path path = Paths.get(System.getProperty("user.dir")).resolve("Busoft.txt");
            Path path = Paths.get("C:/Users/Dell/Desktop/Busoft.txt");
            BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));
            Set<String> wordsOfTextFile = new HashSet<>();
            String line = reader.readLine();
            //int totalWords = 0;

            while (line != null) {
                System.out.println("" + line);
                if (line.trim().equals("")) {
                    String[] words = line.split(" ");
                    //totalWords += words.length;
                    for (String word : words) {
                        String cleanUp = word.toLowerCase().replace(",", "").replace(":", "").replace(".", "").replace("\"", "");
                        wordsOfTextFile.add(cleanUp);
                    }
                }
                line = reader.readLine();
            }
            System.out.println("count of Each words In Text file");
            System.out.println(wordsOfTextFile.size());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex2) {
            ex2.printStackTrace();
        }

    }*/

    public static void main(String args[]) throws Exception  {

//3.Find the word count in "Busoft.txt" text file?
        FileHandling.wordsCount();

//4. Find the each words with their counts in "Busoft.txt" text file?
        FileHandling.findEachWords();

//5.Find the given word's count from "Busoft.txt" text file?- Use scanner to get the word i/p from user - Need to handling exception
        FileHandling.getInputFromUser();

    }


}