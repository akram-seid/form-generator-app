package sample.forms;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.*;

public class Form1 {
    String owner_field,importer_field,engine_no,vin_no,veh_model,receipt_no,speed,port_field,pink_no,code_field;

    public void setOwner_field(String owner_field) {
        this.owner_field = owner_field;
    }

    public void setImporter_field(String importer_field) {
        this.importer_field = importer_field;
    }

    public void setEngine_no(String engine_no) {
        this.engine_no = engine_no;
    }

    public void setVin_no(String vin_no) {
        this.vin_no = vin_no;
    }

    public void setVeh_model(String veh_model) {
        this.veh_model = veh_model;
    }

    public void setReceipt_no(String receipt_no) {
        this.receipt_no = receipt_no;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setPort_field(String port_field) {
        this.port_field = port_field;
    }

    public void setPink_no(String pink_no) {
        this.pink_no = pink_no;
    }

    public void setCode_field(String code_field) {
        this.code_field = code_field;
    }

    public void Generate_form_one() throws IOException, InvalidFormatException {
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
        run.setText("7. የፍጥነት መገደቢያ መሳሪያው መለያ: SPG02C");
        run.addCarriageReturn();
        run.setText("8. የደንበኛው ደረሰኝ መለያ ቁጥር፡ "+receipt_no);
        run.addCarriageReturn();
        run.setText("9. የተፈቀደ የፍትነት ወሰን መጠን፡ "+speed+"km/h");
        run.addCarriageReturn();
        run.setText("10. የሚጻፍለት ለኤርፖርት/ ለደረቅ ወደብ፡ "+port_field);
        run.addCarriageReturn();
        run.setText("11. የሮዝ ወረቀት ቁጥር፡ "+pink_no);
        run.addCarriageReturn();
        run.setText("12. የብቃት ማረጋገጫ የወሰደበት መሳሪያ ሞዴል፡SPG02C");
        run.addCarriageReturn();
        run.setText("13. ኮድ ፡"+code_field);
        run.addCarriageReturn();
        run.setText(
                "የሆነ ተሸከርካሪ በኢትዮጵያ ስታንዳርድ ኤጀንሲ በወጣው የፍጥነት መገደቢያ መሳሪያ" +
                        " ስታንዳርድ እና በተፈቀደው የፍጥነት ወሰን መሰረት በአንድ ወር (01) ጊዜ ውስጥ ለመግጠም " +
                        "ከላይ ከተጠቀሰው ድርጅት ጋር ውል የገቡ መሆኑን እናረጋግጣለን፡፡");
        FileOutputStream out = new FileOutputStream( new File("form1.docx"));
        document.write(out);
        System.out.println("File 1 saved successfuly");
    }
}
