package com.example.thematthewpattel.actividad5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etApellido, etEdad;
    Button bBoton;
    ListView lvListView;
    List<String> lLista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.iNombre);
        etApellido = (EditText) findViewById(R.id.iApellido);
        etEdad = (EditText) findViewById(R.id.iEdad);
        bBoton = (Button) findViewById(R.id.iBoton);
        lvListView = (ListView) findViewById(R.id.iListView);

        final ArrayAdapter<String>aaAdaptador = new ArrayAdapter<String> (this,
                android.R.layout.simple_expandable_list_item_1, lLista);

        lvListView.setAdapter(aaAdaptador);

        bBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lvListView.setAdapter(null);
                String sNombre = etNombre.getText().toString();
                String sApellido = etApellido.getText().toString();
                String sEdad = etEdad.getText().toString();

                lLista.add(sNombre);
                lLista.add(sApellido);
                lLista.add(sEdad);
                lvListView.setAdapter(aaAdaptador);
            }
        });

    }
}
