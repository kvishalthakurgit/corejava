package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReading {
	public static void main(String[] args) {
        String filePath = "D://hello.txt"; // Replace with your file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<String> batch = new ArrayList<>();
            int batchSize = 50;
            int count = 0;

            String line;
            while ((line = reader.readLine()) != null) {
            	
                batch.add(line);
                //System.out.println(batch);
                
                // If the batch size is reached, process the batch
                if (++count % batchSize == 0) {
                    processBatch(batch);
                    batch.clear(); // Clear the batch for the next set of lines
                }
            }

            // Process any remaining lines (if the total number of lines is not a multiple of the batch size)
            if (!batch.isEmpty()) {
                processBatch(batch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processBatch(List<String> batch) {
        System.out.println("Batch processing:");
        int count = 0;
        for (String line : batch) {
            System.out.println(++count +" "+line);
        }
        System.out.println("---------------");
        
        String s1 = "dsfsdf";
        String[] split = s1.split("");
        int i[] = {1,2,3,4,5,6};
        Arrays.stream(i).boxed().forEach(System.out::println);
    }
}

