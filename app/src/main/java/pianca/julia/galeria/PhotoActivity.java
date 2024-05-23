package pianca.julia.galeria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        Toolbar toolbar = findViewById(R.id.tbPhoto); // obtem o elemento tbPhoto
        setSupportActionBar(toolbar); // indica para PhotoActivity que tbPhoto deve ser considerado como a ActionBar padrão da tela

        ActionBar actionBar = getSupportActionBar(); // obtém da Activity a ActionBar padrão
        actionBar.setDisplayHomeAsUpEnabled(true); // habilita o botão de voltar na ActionBar
    }
}