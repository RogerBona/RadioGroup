package cat.dam.roger.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup RG_layouts;
    private RadioButton Olletra, Ocolor, moltpetita, petita, mitjana, gran, moltgran,
            Vermell2, Verd2, Blau2, Blanc2, Negre2, Vermell, Verd, Blau, Blanc, Negre,
            vermell3, verd3, blau3, blanc3, negre3;
    private Button bt_aplicam;
    private TextView tv_Configuram;
    private AutoCompleteTextView codiHexlletra, codiHexfonslletra, codiHexfons;
    private LinearLayout LinearLayout1, LinearLayout2, Layout_Configuram, Layout_Principal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Layouts
        LinearLayout1 = (LinearLayout) findViewById(R.id.LinearLayout1);
        LinearLayout2 = (LinearLayout) findViewById(R.id.LinearLayout2);
        Layout_Configuram = (LinearLayout) findViewById(R.id.Layout_Configuram);
        Layout_Principal = (LinearLayout) findViewById(R.id.Layout_Principal);

        //Botons Layout
        Olletra = (RadioButton) findViewById(R.id.Olletra);
        Ocolor = (RadioButton) findViewById(R.id.Ocolor);
        RG_layouts = (RadioGroup) findViewById(R.id.RG_layouts);

        //Botons tamany lletra
        moltpetita = (RadioButton) findViewById(R.id.moltpetita);
        petita = (RadioButton) findViewById(R.id.petita);
        mitjana = (RadioButton) findViewById(R.id.mitjana);
        gran = (RadioButton) findViewById(R.id.gran);
        moltgran = (RadioButton) findViewById(R.id.moltgran);

        //Botons color de la lletra
        Vermell2 = (RadioButton) findViewById(R.id.Vermell2);
        Verd2 = (RadioButton) findViewById(R.id.Verd2);
        Blau2 = (RadioButton) findViewById(R.id.Blau2);
        Blanc2 = (RadioButton) findViewById(R.id.Blanc2);
        Negre2 = (RadioButton) findViewById(R.id.Negre2);

        //Botons color de fons de la lletra
        vermell3 = (RadioButton) findViewById(R.id.vermell3);
        verd3 = (RadioButton) findViewById(R.id.verd3);
        blau3 = (RadioButton) findViewById(R.id.blau3);
        blanc3 = (RadioButton) findViewById(R.id.blanc3);
        negre3 = (RadioButton) findViewById(R.id.negre3);

        //Botons color de fons del layout
        Vermell2 = (RadioButton) findViewById(R.id.Vermell2);
        Verd2 = (RadioButton) findViewById(R.id.Verd2);
        Blau2 = (RadioButton) findViewById(R.id.Blau2);
        Blanc2 = (RadioButton) findViewById(R.id.Blanc2);
        Negre2 = (RadioButton) findViewById(R.id.Negre2);

        //Text a modificar
        tv_Configuram = (TextView) findViewById(R.id.tv_Configuram);

        //Part escrita
        bt_aplicam = (Button) findViewById(R.id.bt_aplicam);
        codiHexlletra = (AutoCompleteTextView) findViewById(R.id.codiHexlletra);
        codiHexfonslletra = (AutoCompleteTextView) findViewById(R.id.codiHexfonslletra);
        codiHexfons = (AutoCompleteTextView) findViewById(R.id.codiHexfons);

    }

    //Funcio OnClick per canviar de layouts
    public void ButtonLayouts(View view) {
        // Aqui fem un boolean per mirar si is checked
        boolean checked = ((RadioButton) view).isChecked();

        // Aqui fem un swhitch que ens dira en el cas de que algun dels Rbuttons estigui checked passara el seguent
        switch (view.getId()) {
            //IF on posarem visible o gone els layout
            case R.id.Olletra:
            if (checked) {
                    LinearLayout1.setVisibility(View.VISIBLE);
                    LinearLayout2.setVisibility(View.GONE);
                    break;
                }

            case R.id.Ocolor:
                if (checked) {
                    LinearLayout2.setVisibility(View.VISIBLE);
                    LinearLayout1.setVisibility(View.GONE);
                    break;
                }


        }
    }


    //Funcio OnClick per canviar el tamany de la Lletra
    public void Tamanydelalletra(View view) {
        // Aqui fem un boolean per mirar si is checked
        boolean checked = ((RadioButton) view).isChecked();

        // Aqui fem un swhitch que ens dira en el cas de que algun dels Rbuttons estigui checked passara el seguent
        switch (view.getId()) {
            //IF on canviarem el tamany de la lletra
            case R.id.moltpetita:
                if (checked) {
                    tv_Configuram.setTextSize(5);
                    Toast.makeText(getApplicationContext(), "Tamany de la lletra: Molt petita",
                            Toast.LENGTH_LONG).show();
                    break;
                }

            case R.id.petita:
                if (checked) {
                    tv_Configuram.setTextSize(10);
                    Toast.makeText(getApplicationContext(), "Tamany de la lletra: Petita",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.mitjana:
                if (checked) {
                    tv_Configuram.setTextSize(15);
                    Toast.makeText(getApplicationContext(), "Tamany de la lletra: Mitjana",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.gran:
                if (checked) {
                    tv_Configuram.setTextSize(20);
                    Toast.makeText(getApplicationContext(), "Tamany de la lletra: Gran",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.moltgran:
                if (checked) {
                    tv_Configuram.setTextSize(25);
                    Toast.makeText(getApplicationContext(), "Tamany de la lletra: Molt gran",
                            Toast.LENGTH_LONG).show();
                    break;
                }

        }
    }

    //Funcio OnClick per canviar el color de la Lletra
    public void ColordelaLletra(View view) {
        // Aqui fem un boolean per mirar si is checked
        boolean checked = ((RadioButton) view).isChecked();

        // Aqui fem un swhitch que ens dira en el cas de que algun dels Rbuttons estigui checked passara el seguent
        switch (view.getId()) {
            //IF on canviarem el color de la lletra
            case R.id.Vermell2:
                if (checked) {
                    tv_Configuram.setTextColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "Color Lletra: Vermell",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.Verd2:
                if (checked) {
                    tv_Configuram.setTextColor(Color.GREEN);
                    Toast.makeText(getApplicationContext(), "Color Lletra: Verd",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.Blau2:
                if (checked) {
                    tv_Configuram.setTextColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), "Color Lletra: Blau",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.Blanc2:
                if (checked) {
                    tv_Configuram.setTextColor(Color.WHITE);
                    Toast.makeText(getApplicationContext(), "Color Lletra: Blanc",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.Negre2:
                if (checked) {
                    tv_Configuram.setTextColor(Color.BLACK);
                    Toast.makeText(getApplicationContext(), "Color Lletra: Negre",
                            Toast.LENGTH_LONG).show();
                    break;
                }
        }
    }

    //Funcio OnClick per canviar el color de la Lletra
    public void ColordeFonsdelaLletra(View view) {
        // Aqui fem un boolean per mirar si is checked
        boolean checked = ((RadioButton) view).isChecked();

        // Aqui fem un swhitch que ens dira en el cas de que algun dels Rbuttons estigui checked passara el seguent
        switch (view.getId()) {
            //IF on canviarem el color de la lletra
            case R.id.Vermell:
                if (checked) {
                    Layout_Configuram.setBackgroundColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "Color Fons Lletra: Vermell",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.Verd:
                if (checked) {
                    Layout_Configuram.setBackgroundColor(Color.GREEN);
                    Toast.makeText(getApplicationContext(), "Color Fons Lletra: Verd",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.Blau:
                if (checked) {
                    Layout_Configuram.setBackgroundColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), "Color Fons Lletra: Blau",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.Blanc:
                if (checked) {
                    Layout_Configuram.setBackgroundColor(Color.WHITE);
                    Toast.makeText(getApplicationContext(), "Color Fons Lletra: Blanc",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.Negre:
                if (checked) {
                    Layout_Configuram.setBackgroundColor(Color.BLACK);
                    Toast.makeText(getApplicationContext(), "Color Fons Lletra: Negre",
                            Toast.LENGTH_LONG).show();
                    break;
                }
        }
    }

    //Funcio OnClick per canviar el color del layout
    public void ColordeFonsdelLayout(View view) {
        // Aqui fem un boolean per mirar si is checked
        boolean checked = ((RadioButton) view).isChecked();

        // Aqui fem un swhitch que ens dira en el cas de que algun dels Rbuttons estigui checked passara el seguent
        switch (view.getId()) {
            //IF on canviarem el color del layout
            case R.id.vermell3:
                if (checked) {
                    Layout_Principal.setBackgroundColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "Color Fons: Vermell",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.verd3:
                if (checked) {
                    Layout_Principal.setBackgroundColor(Color.GREEN);
                    Toast.makeText(getApplicationContext(), "Color Fons: Verd",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.blau3:
                if (checked) {
                    Layout_Principal.setBackgroundColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), "Color Fons: Blau",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.blanc3:
                if (checked) {
                    Layout_Principal.setBackgroundColor(Color.WHITE);
                    Toast.makeText(getApplicationContext(), "Color Fons: Blanc",
                            Toast.LENGTH_LONG).show();
                    break;
                }
            case R.id.negre3:
                if (checked) {
                    Layout_Principal.setBackgroundColor(Color.BLACK);
                    Toast.makeText(getApplicationContext(), "Color Fons: Negre",
                            Toast.LENGTH_LONG).show();
                    break;
                }
        }
    }


    //Funcio OnClick per canviar el color de la Lletra des del text quan es premi el boto aplicar

    public void Botoaplicar (View view){

        ColordelaFonsLletraEscrit(view);
        ColordelaLletraEscrit(view);
        Colorfonslayout(view);
    }

    public void ColordelaLletraEscrit(View view) {
        //Aqui li passem el color que ha escrit l'usuari i li afegim un #
        String color = "#" + codiHexlletra.getText();
        tv_Configuram.setTextColor(Color.parseColor(color));

        Toast.makeText(getApplicationContext(), "Color lletra Aplicat",
                Toast.LENGTH_LONG).show();

    }

    public void ColordelaFonsLletraEscrit(View view) {
        //Aqui li passem el color que ha escrit l'usuari i li afegim un #
        String color = "#" + codiHexfonslletra.getText();
        Layout_Configuram.setBackgroundColor(Color.parseColor(color));

        Toast.makeText(getApplicationContext(), "Color Fons lletra Aplicat",
                Toast.LENGTH_LONG).show();
    }

    public void Colorfonslayout(View view) {
        //Aqui li passem el color que ha escrit l'usuari i li afegim un #
        String color = "#" + codiHexfons.getText();
        Layout_Principal.setBackgroundColor(Color.parseColor(color));

        Toast.makeText(getApplicationContext(), "Color Fons Aplicat",
                Toast.LENGTH_LONG).show();
    }
}