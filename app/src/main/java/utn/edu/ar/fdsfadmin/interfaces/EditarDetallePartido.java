package utn.edu.ar.fdsfadmin.interfaces;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Map;

import utn.edu.ar.fdsfadmin.Entidades.Jugador;
import utn.edu.ar.fdsfadmin.R;

/**
 * Created by Gabriel on 08/03/2017.
 */

public class EditarDetallePartido extends Activity {
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    Button botonGolLocal, botonAmarillaLocal, botonRojaLocal, botonCambioLocal
            , botonAceptarLocal, botonCancelarLocal;
    Spinner spinner1Local, spinner2Local;
    EditText minutoLocal;
    ArrayList<String> listaTitulares, listaSuplentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editar_detalle_partido);
        cargarInterfaz();

        botonGolLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void cargarInterfaz(){
        botonGolLocal = (Button) findViewById(R.id.botonLocalGol);
        botonAmarillaLocal = (Button) findViewById(R.id.botonLocalAmarilla);
        botonRojaLocal = (Button) findViewById(R.id.botonLocalRoja);
        botonCambioLocal = (Button) findViewById(R.id.botonLocalCambio);
        botonAceptarLocal = (Button) findViewById(R.id.botonLocalAceptar);
        botonCancelarLocal = (Button) findViewById(R.id.botonLocalCancelar);
        spinner1Local = (Spinner) findViewById(R.id.spinnerLocalUno);
        spinner2Local = (Spinner) findViewById(R.id.spinnerLocalDos);
        minutoLocal = (EditText) findViewById(R.id.editTextLocalMinuto);
        listaTitulares = new ArrayList<>();
        listaSuplentes = new ArrayList<>();
        buscarJugadores();

        ArrayAdapter<String> listAdapter1;
        listAdapter1 = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, listaTitulares);
        listAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1Local.setAdapter(listAdapter1);

        ArrayAdapter<String> listAdapter2;
        listAdapter2 = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, listaSuplentes);
        listAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner2Local.setAdapter(listAdapter2);
        spinner2Local.setSelection(0);
    }

    public ArrayList<String> buscarJugadores(){
        listaTitulares.clear();
        listaSuplentes.clear();
        database.getReference("datos/users/jugadores").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot snapshot, String previousChildKey) {
                Map<String, Object> newPost = (Map<String, Object>) snapshot.getValue();
                if(newPost.get("equipo").equals("ARGENTINO DE SAN CARLOS")){
                    if(newPost.get("titular").equals("T"))
                        listaTitulares.add(
                                newPost.get("nombre").toString() + " " +
                                        newPost.get("apellido").toString()
                        );
                    else{
                        listaSuplentes.add(
                                newPost.get("nombre").toString() + " " +
                                newPost.get("apellido").toString()
                        );
                    }
                }
            }
            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {}
            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {}
            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {}
            @Override
            public void onCancelled(DatabaseError databaseError) {}
        });

        return listaTitulares;
    }
}
