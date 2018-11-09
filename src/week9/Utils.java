package week9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utils {
    public static void main(String[] args) throws IOException{
        File file = new File("A.txt");
        
        file.createNewFile();
        File file1 = new File("B.txt");
        
        file1.createNewFile();
        File file2 = new File("C.txt");
        
        file2.createNewFile();
        System.out.println(readContentFromFile(file.getAbsolutePath()));
        WriterContentToFile1(file1.getAbsolutePath());
        WriterContentToFile2(file2.getAbsolutePath());
        
    }
    public static String readContentFromFile(String path) throws FileNotFoundException{
        File file = new File ("path");
        try(Scanner sc = new Scanner(file)){
            String str = null;
            while(sc.hasNext()){
               str = sc.nextLine();
               
            }
            return str ;
            
        }
     
    }
    public static void WriterContentToFile1(String path){
        File file1 = new File("path");
        try(PrintWriter pw = new PrintWriter(file1)) {
            pw.println("Hello!");
        } catch (Exception e) {
        }
                
               
    }
    public static void WriterContentToFile2(String path) throws IOException{
        File file2 = new File("path");
        try(FileWriter fw = new FileWriter(file2, true);
        BufferedWriter bf = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bf)){
            pw.println("Hello!");
            pw.println("Hi");
            
            
        } catch(Exception e){}
        
    }

    
    
    
        
        
    
    
}
