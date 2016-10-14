package edu.tecii.android.practica7_pitagoras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.inputca)
    EditText inputca;
    @Bind(R.id.inputco)
    EditText inputco;
    @Bind(R.id.btncal)
    Button btncal;
    @Bind(R.id.inputhp)
    TextView inputhp;
    @Bind(R.id.inputper)
    TextView inputper;
    @Bind(R.id.inputarea)
    TextView inputarea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btncal)
    public void teoremapitagoras(){
        String catad = inputca.getText().toString();
        String catop = inputco.getText().toString();

        if(!catad.isEmpty() && !catop.isEmpty()){
            double ca = Double.parseDouble(catad);
            double co = Double.parseDouble(catop);

            double hip = Math.sqrt((Math.pow(ca,2))+(Math.pow(co,2)));
            double per =  ca+co+hip;
            double area = (ca*co)/2;

            String h = "";
            String p = "";
            String a = "";
            String fh = String.format("%2.2f",hip);
            String fp = String.format("%2.2f",per);
            String fa = String.format("%2.2f",area);
            h = "La longitud de la hipotenusa es: " + fh + "";
            p = "El resultado del perimetro calculado es: " + fp + "";
            a = "El resultado del área calculada es: " + fa + "";

            inputhp.setText(h);
            inputper.setText(p);
            inputarea.setText(a);
        }
    }
}
