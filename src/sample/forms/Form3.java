package sample.forms;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Form3 extends Form1 {

    String imei_no;
    private String subcity;

    public void setImei_no(String imei_no) {
        this.imei_no = imei_no;
    }

    public void setSubcity(String subcity) {
        this.subcity = subcity;
    }

    public void Generate_form_three() throws IOException {
        XWPFDocument document= new XWPFDocument();
        XWPFParagraph paragraph= document.createParagraph();
        XWPFRun run=paragraph.createRun();

        run.setText("1. የገጣሚ ድርጅት ስም፡ ፋጡማ ሰይድ አስመጪ");
        run.addCarriageReturn();
        run.setText("2. የባለንብረት ስም፡ "+owner_field);
        run.addCarriageReturn();
        run.setText("3. የተሽከርካሪው አስመጪ ድርጅት ስም፡ "+importer_field);
        run.addCarriageReturn();
        run.setText("4. የተሽከርካሪው ሞተር ቁጥር፡ "+engine_no);
        run.addCarriageReturn();
        run.setText("5. የተሽከርካሪው ቻንሲ ቁጥር፡ "+vin_no);
        run.addCarriageReturn();
        run.setText("6. የተሽከርካሪው አይነት፡ "+veh_model);
        run.addCarriageReturn();
        run.setText("7. የፍጥነት መገደቢያ መሳሪያው መለያ ቁጥር: "+imei_no);
        run.addCarriageReturn();
        run.setText("8. የደንበኛው ደረሰኝ መለያ ቁጥር፡ "+receipt_no);
        run.addCarriageReturn();
        run.setText("9. የተፈቀደ የፍትነት ወሰን መጠን፡ "+speed+"km/h");
        run.addCarriageReturn();
        run.setText("10. የሮዝ ወረቀት ቁጥር፡ "+pink_no);
        run.addCarriageReturn();
        run.setText("11. የሚጻፍለት ክፍለ ከተማ ፡ ፡ "+subcity);
        run.addCarriageReturn();
        run.setText("12. የብቃት ማረጋገጫ የወሰደበት መሳሪያ ሞዴል፡SPG02C");
        run.addCarriageReturn();
        run.setText("13. ኮድ ፡"+code_field);
        run.addCarriageReturn();
        run.setText(
                "የሆነ ተሽከርካሪ በኢትዮጵያ ስታንዳርድ ኤጀንሲ ባወጣው የፍጥነት መገደቢያ መሳሪያ ስታንዳርድ ES-6413 እና " +
                        "በተፈቀደው የፍጥነት ወሰን መሰረት ከላይ ከተጠቀሰው ግለሰብ / ድርጅት ጋር " +
                        "ውል በመግባት የፍጥነት መገደቢያ መሳሪያ የተገጠመ ስለሆነ ሰሌዳ እንዲሰጣቸው እንጠይቃለን ፡፡ ");
        FileOutputStream out = new FileOutputStream( new File("form3.docx"));
        document.write(out);
        System.out.println("File 3 saved successfuly");
    }
}
