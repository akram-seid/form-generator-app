package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import sample.forms.Form1;
import sample.forms.Form2;
import sample.forms.Form3;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchor;

    @FXML
    private TextField owner_field;

    @FXML
    private TextField importer_field;

    @FXML
    private TextField engine_no;

    @FXML
    private TextField vin_no;

    @FXML
    private TextField veh_model;

    @FXML
    private TextField receipt_no;

    @FXML
    private TextField speed;

    @FXML
    private TextField pink_no;

    @FXML
    private TextField port_field;

    @FXML
    private TextField code_field;

    @FXML
    private RadioButton form1_no;

    @FXML
    private RadioButton form1_ok;

    @FXML
    private RadioButton form2_no;

    @FXML
    private RadioButton form2_ok;

    @FXML
    private TextField imei_field;
    @FXML
    private Button save_btn;
    @FXML
    private TextField subcity;

    @FXML
    void initialize() {
        save_btn.setOnAction((ActionEvent event) -> {
            System.out.println("File Generation started  ...");
           form1gen();
          form2gen();
          form3gen();
        });


         }



    public void form1gen(){
             Form1 form1 = new Form1();
             form1.setOwner_field(owner_field.getText());
             form1.setImporter_field(importer_field.getText());
             form1.setCode_field(code_field.getText());
             form1.setEngine_no(engine_no.getText());
             form1.setPink_no(pink_no.getText());
             form1.setPort_field(port_field.getText());
             form1.setReceipt_no(receipt_no.getText());
             form1.setSpeed(speed.getText());
             form1.setVeh_model(veh_model.getText());
             form1.setVin_no(vin_no.getText());
             try {
                 form1.Generate_form_one();
             } catch (IOException | InvalidFormatException e) {
                 e.printStackTrace();
             }

         }


    private void form2gen() {
        Form2 form2 = new Form2();
        form2.setOwner_field(owner_field.getText());
        form2.setImporter_field(importer_field.getText());
        form2.setCode_field(code_field.getText());
        form2.setEngine_no(engine_no.getText());
        form2.setPink_no(pink_no.getText());
        form2.setImei_no(imei_field.getText());
        form2.setPort_field(port_field.getText());
        form2.setReceipt_no(receipt_no.getText());
        form2.setSpeed(speed.getText());
        form2.setVeh_model(veh_model.getText());
        form2.setVin_no(vin_no.getText());
        try {
            form2.Generate_form_two();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void form3gen() {
        Form3 form3 = new Form3();
        form3.setOwner_field(owner_field.getText());
        form3.setImporter_field(importer_field.getText());
        form3.setCode_field(code_field.getText());
        form3.setEngine_no(engine_no.getText());
        form3.setPink_no(pink_no.getText());
        form3.setImei_no(imei_field.getText());
        form3.setSubcity(subcity.getText());
        form3.setReceipt_no(receipt_no.getText());
        form3.setSpeed(speed.getText());
        form3.setVeh_model(veh_model.getText());
        form3.setVin_no(vin_no.getText());
        try {
            form3.Generate_form_three();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
