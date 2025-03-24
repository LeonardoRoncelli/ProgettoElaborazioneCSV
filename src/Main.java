import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args){
        String nomeFile= "roncelli.csv";
        File file=new File(nomeFile);
        if(file.exists()) {
            String linea = "";
            try (BufferedReader br = new BufferedReader(new FileReader("roncelli.csv"))) {
                linea = br.readLine();
                while (linea != null) {
                    System.out.println(linea);
                    linea = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.err.println("File inesistente!");
        }
    }
}