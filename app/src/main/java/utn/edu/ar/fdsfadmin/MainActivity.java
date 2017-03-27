package utn.edu.ar.fdsfadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import utn.edu.ar.fdsfadmin.interfaces.EditarDetallePartido;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editar_detalle_partido);
        CargarDatos.cargarEquipos();
        startActivity(new Intent(getApplicationContext(), EditarDetallePartido.class));
    }
}
