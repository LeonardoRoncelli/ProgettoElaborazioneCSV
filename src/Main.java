import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[]args){
        Random random=new Random();
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
            try(BufferedWriter bw=new BufferedWriter(new FileWriter("roncelli.csv",true))){
                int num;
                while() {
                    num = random.nextInt();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            System.err.println("File inesistente!");
        }
    }
}