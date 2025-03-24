import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args){
        String nomeFile= "roncelli.csv";
        String linea="";
        try(BufferedReader br=new BufferedReader(new FileReader("roncelli.csv"))){
            linea=br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=br.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        };
    }
}