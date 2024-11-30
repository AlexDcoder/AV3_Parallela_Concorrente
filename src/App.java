import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Dictionary;
import java.util.Hashtable;

public class App {
    @SuppressWarnings("rawtypes")
    public static void SerialCPU(String path) {
        Dictionary<String, Integer> dictionary = new Hashtable<>();

        try (InputStreamReader file = new InputStreamReader(new FileInputStream(path), "UTF-8");
                BufferedReader reader = new BufferedReader(file)) {
            String line = reader.readLine();

            while (line != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!word.equals("\n")) {
                        if (((Hashtable) dictionary).containsKey(word)) {
                            dictionary.put(word, dictionary.get(word) + 1);
                        } else {
                            dictionary.put(word, 1);
                        }
                    }
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ParallelCPU(String path) {

    }

    public static void ParallelGPU(String path) {

    }

    public static long totalExecutedSerialCPU(String path) {
        long startTime = System.nanoTime();
        SerialCPU(path);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long totalExecutedParallelCPU(String path) {
        long startTime = System.nanoTime();
        ParallelCPU(path);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long totalExecutedParallelGPU(String path) {
        long startTime = System.nanoTime();
        ParallelGPU(path);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) throws Exception {
        String[] files = {
            "..\\Amostras\\DonQuixote-388208.txt", 
            "..\\Amostras\\Dracula-165307.txt", 
            "..\\Amostras\\MobyDick-217452.txt"
        };
        
        for (String file : files) {
            System.out.println("Tempo de executado para " + file);
            System.out.println("Serial na CPU: " + totalExecutedSerialCPU(file) + " ns");
            // System.out.println("Paralelo na CPU: " + totalExecutedParallelCPU(file) + " ns");
            // System.out.println("Paralelo na GPU: " + totalExecutedParallelGPU(file) + " ns");
            System.out.println();
        }
;
    }
}
