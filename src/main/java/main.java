import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class main {

    public static void main(String args[]){
        File in1 = new File(args[0]);
        File in2 = new File(args[1]);
        File out = new File(args[2]);
        try{
            PDDocument in1pd = PDDocument.load(in1);
            PDDocument in2pd = PDDocument.load(in2);
            repaginator repra = new repaginator();
            PDDocument outpd = repra.repaginate(in1pd, in2pd);
            outpd.save(out);
            System.out.println("Reordering complete");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
