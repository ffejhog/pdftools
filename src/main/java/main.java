import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class main {

    public static void main(String args[]){
        if(args.length != 3){
            System.out.print("Need 3 args mode 1 - ziper, 2 - regualer");
        }
        File in1 = new File(args[1]);
        File in2 = new File(args[2]);
        File out = new File(args[3]);
        int mode = Integer.parseInt(args[0]);
        if(mode == 1){
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
        }else if(mode == 2){
            try{
                PDDocument in1pd = PDDocument.load(in1);
                PDDocument in2pd = PDDocument.load(in2);
                repaginator repra = new repaginator();
                PDDocument outpd = repra.merge(in1pd, in2pd);
                outpd.save(out);
                System.out.println("merging complete");
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.print("mode 1 - ziper, 2 - regualer");
        }


    }

}
