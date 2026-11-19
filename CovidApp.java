import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="CovidApp" width="500" height="350"></applet> */

public class CovidApp extends Applet implements ItemListener {
    Label title, lName, lSym, lGender, lDiag;
    TextField tfName, tfDiag;
    Checkbox throat, cold, fever, body;
    Checkbox female, male;
    CheckboxGroup gender;

    public void init() { 
        title = new Label("Covid App");
        lName = new Label("Patient Name:");
        tfName = new TextField(20);
        lSym = new Label("Symptoms:");

        throat = new Checkbox("Throat Pain");
        cold = new Checkbox("Cold");
        fever = new Checkbox("Fever");
        body = new Checkbox("Body Pains");

        lGender = new Label("Gender:");
        gender = new CheckboxGroup();
        female = new Checkbox("Female", gender, false);
        male = new Checkbox("Male", gender, false);

        lDiag = new Label("Diagnosis:");
        tfDiag = new TextField(25);
        tfDiag.setEditable(false);

        add(title); add(lName); add(tfName);
        add(lSym);
        add(throat); add(cold); add(fever); add(body);
        add(lGender); add(female); add(male);
        add(lDiag); add(tfDiag);

        throat.addItemListener(this);
        cold.addItemListener(this);
        fever.addItemListener(this);
        body.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        String d;
        if (throat.getState() && cold.getState() && fever.getState() && body.getState())
            d = "Covid";
        else if (throat.getState() && cold.getState() && fever.getState())
            d = "Viral Fever";
        else if (throat.getState() && cold.getState())
            d = "Flu";
        else
            d = "No diagnosis, consult a doctor";
        tfDiag.setText(d);
    }
    public static void main(String[] args) {
        Frame f = new Frame("Covid App");
        CovidApp app = new CovidApp();
        f.add(app);
        f.setSize(520, 380);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        app.init();
        app.start();
        f.setVisible(true);
    }
}