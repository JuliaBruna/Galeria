package pianca.julia.galeria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toolbar;

public class PhotoActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opShare:
                sharePhoto(); // Caso o ícone de câmera tenha sido clicado, então será executado código que compartilha a foto
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.photo_activity_tb, menu);
        return true;
    }

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