import org.apache.pdfbox.pdmodel.PDDocument;

public class repaginator {

    public PDDocument repaginate(PDDocument doc1, PDDocument doc2) {
        PDDocument ret = new PDDocument();

        int length = Math.max(doc1.getNumberOfPages(), doc2.getNumberOfPages());
        for(int i=0;i<length;i++){
            if(doc1.getNumberOfPages()>i){
                ret.addPage(doc1.getPage(i));
            }
            if(doc2.getNumberOfPages()>i){
                ret.addPage(doc2.getPage(i));
            }
        }

        return ret;

    }

    public PDDocument merge(PDDocument doc1, PDDocument doc2) {
        PDDocument ret = new PDDocument();

        for(int i = 0; i<doc1.getNumberOfPages();i++){
            ret.addPage(doc1.getPage(i));
        }

        for(int i = 0; i<doc2.getNumberOfPages();i++){
            ret.addPage(doc2.getPage(i));
        }

        return ret;

    }
}
