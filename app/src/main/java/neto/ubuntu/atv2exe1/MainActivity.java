package neto.ubuntu.atv2exe1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RadioGroup sexo;
    private TextView novo_nome,novo_sexo;
    private EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.sexo = findViewById(R.id.radioGroup_sexo);
        this.novo_nome =findViewById(R.id.textView_novo_nome);
        this.novo_sexo =findViewById(R.id.textView_novo_sexo);
        this.nome = findViewById(R.id.editText_nome);
    }

    public void limpar(View view) {
        this.novo_nome.setText("");
        this.novo_sexo.setText("");
        this.nome.setText("");
        this.sexo.clearCheck();
    }

    public void exibir(View view) {

        int opcaoRadioButton = this.sexo.getCheckedRadioButtonId();

        if(opcaoRadioButton!=-1) {

            RadioButton escolhido = findViewById(opcaoRadioButton);

            this.novo_sexo.setText(escolhido.getText());
        }

        this.novo_nome.setText(this.nome.getText());
    }
}
