package utn.edu.ar.fdsfadmin;

import com.google.firebase.database.FirebaseDatabase;
import java.util.ArrayList;
import utn.edu.ar.fdsfadmin.Entidades.Jugador;

public class CargarDatos {

    private static FirebaseDatabase database = FirebaseDatabase.getInstance();

    public static void cargarEquipos() {

        ArrayList<ArrayList<Jugador>> jugadores = new ArrayList<>();
        ArrayList<Jugador> jugadoresArgentino = new ArrayList<>();
        jugadoresArgentino.add(new Jugador("LEIVA", "LUIS", "ARQ", "a", "ARGENTINO DE SAN CARLOS", "T", 2, 1, 0, 4));
        jugadoresArgentino.add(new Jugador("DAMONTE", "AGUSTIN", "DEF", "b", "ARGENTINO DE SAN CARLOS", "T", 0, 1, 0, 4));
        jugadoresArgentino.add(new Jugador("BERNIA","PABLO","DEF", "b","ARGENTINO DE SAN CARLOS","T",1,0,0,4));
        jugadoresArgentino.add(new Jugador("SALZMAN","ANDRÉS","DEF", "b","ARGENTINO DE SAN CARLOS","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("NUÑEZ","RODRIGO","DEF", "b","ARGENTINO DE SAN CARLOS","T",1,0,1,4));
        jugadoresArgentino.add(new Jugador("LATUFF","JOAQUÍN","MED", "c","ARGENTINO DE SAN CARLOS","T",1,0,0,4));
        jugadoresArgentino.add(new Jugador("IPARRAGUIRRE","NICOLÁS","MED", "c","ARGENTINO DE SAN CARLOS","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("CHAVARINI","MATÍAS","MED", "c","ARGENTINO DE SAN CARLOS","T",1,0,0,4));
        jugadoresArgentino.add(new Jugador("AGUIRRE","FERNANDO","MED", "c","ARGENTINO DE SAN CARLOS","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("SWICH","GABRIEL","MED", "c","ARGENTINO DE SAN CARLOS","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("CENTANI","MAURO","MED", "c","ARGENTINO DE SAN CARLOS","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("DEJÓN","DANTE","MED", "c","ARGENTINO DE SAN CARLOS","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("MARTINEZ","MATÍAS","DEL", "d","ARGENTINO DE SAN CARLOS","T",0,1,0,4));
        jugadoresArgentino.add (new Jugador("FORMENTO","ANDRÉS","DEL", "d","ARGENTINO DE SAN CARLOS","T",0,0,0,4));

        ArrayList<Jugador> jugadoresAteneo = new ArrayList<>();
        jugadoresArgentino.add(new Jugador("JIMENEZ","LUIS","ARQ", "a","ATENEO INMACULADA","T", 0, 1, 0, 4));
        jugadoresArgentino.add(new Jugador("BENITEZ","AGUSTIN","DEF", "b","ATENEO INMACULADA","T",0,1,0,4));
        jugadoresArgentino.add(new Jugador("RODRIGUEZ","PABLO","DEF", "b","ATENEO INMACULADA","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("GONZALEZ","ANDRÉS","DEF", "b","ATENEO INMACULADA","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("ALVAREZ","RODRIGO","DEF", "b","ATENEO INMACULADA","T",0,0,1,4));
        jugadoresArgentino.add(new Jugador("PEREZ","JOAQUÍN","MED", "c","ATENEO INMACULADA","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("CASARSA","GABRIEL JESUS","MED", "c","ATENEO INMACULADA","T",2,0,1,4));
        jugadoresArgentino.add(new Jugador("FERREYRA","MATÍAS","MED", "c","ATENEO INMACULADA","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("SACRIPANTI","FERNANDO","MED", "c","ATENEO INMACULADA","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("OBOLO","GABRIEL","DEL", "d","ATENEO INMACULADA","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("PERNIA","MAURO","DEL", "d","ATENEO INMACULADA","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("SCHMIDT","DANTE","DEL", "d","ATENEO INMACULADA","S",0,0,0,4));

        ArrayList<Jugador> jugadoresColon = new ArrayList<>();
        jugadoresArgentino.add(new Jugador("BLAZINA","LUIS","ARQ", "a","COLON DE SANTA FE","T", 0, 1, 0, 4));
        jugadoresArgentino.add(new Jugador("BANZINA","AGUSTIN","DEF", "b","COLON DE SANTA FE","T",0,1,2,4));
        jugadoresArgentino.add(new Jugador("BASSO","PABLO","DEF", "b","COLON DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("ZUBIETA","ANDRÉS","DEF", "b","COLON DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("GRECCO","RODRIGO","DEF", "b","COLON DE SANTA FE","T",0,0,4,4));
        jugadoresArgentino.add(new Jugador("COLOMBO","JOAQUÍN","MED", "c","COLON DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("IMBELLONI","GABRIEL JESUS","MED", "c","COLON DE SANTA FE","T",0,0,1,4));
        jugadoresArgentino.add(new Jugador("FARRO","MATÍAS","MED", "c","COLON DE SANTA FE","T",1,0,0,4));
        jugadoresArgentino.add(new Jugador("PONTONI","FERNANDO","MED", "c","COLON DE SANTA FE","T",1,0,0,4));
        jugadoresArgentino.add(new Jugador("MARTINO","GABRIEL","DEL", "d","COLON DE SANTA FE","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("SILVA","MAURO","DEL", "d","COLON DE SANTA FE","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("PRIETTO","LIVIO","DEL", "d","COLON DE SANTA FE","S",1,0,0,4));

        ArrayList<Jugador> jugadoresCosmos = new ArrayList<>();
        jugadoresArgentino.add(new Jugador("PASSET","LUIS","ARQ", "a","COSMOS FC","T", 0, 1, 0, 4));
        jugadoresArgentino.add(new Jugador("RIVADERO","AGUSTIN","DEF", "b","COSMOS FC","T",0,1,0,4));
        jugadoresArgentino.add(new Jugador("MANUSOVICH","PABLO","DEF", "b","COSMOS FC","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("RUGGERI","ANDRÉS","DEF", "b","COSMOS FC","T",0,4,0,4));
        jugadoresArgentino.add(new Jugador("GALETTO","RODRIGO","DEF", "b","COSMOS FC","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("SILAS","JOAQUÍN","MED", "c","COSMOS FC","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("GOROSITO","GABRIEL JESUS","MED", "c","COSMOS FC","T",0,0,1,4));
        jugadoresArgentino.add(new Jugador("BIAGGIO","MATÍAS","MED", "c","COSMOS FC","T",3,0,0,4));
        jugadoresArgentino.add(new Jugador("GONZALEZ","FERNANDO","MED", "c","COSMOS FC","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("MONSERRAT","GABRIEL","DEL", "d","COSMOS FC","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("AREVALO","MAURO","DEL", "d","COSMOS FC","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("ARBARELLO","LIVIO","DEL", "d","COSMOS FC","S",0,0,0,4));

        ArrayList<Jugador> jugadoresLaSalle = new ArrayList<>();
        jugadoresArgentino.add(new Jugador("SAJA","LUIS","ARQ", "a","LA SALLE JOBSON","T", 0, 1, 0, 4));
        jugadoresArgentino.add(new Jugador("COLOCCINI","AGUSTIN","DEF", "b","LA SALLE JOBSON","T",1,1,0,4));
        jugadoresArgentino.add(new Jugador("TUZZIO","PABLO","DEF", "b","LA SALLE JOBSON","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("AMELI","ANDRÉS","DEF", "b","LA SALLE JOBSON","T",1,1,0,4));
        jugadoresArgentino.add(new Jugador("SERRIZUELA","RODRIGO","DEF", "b","LA SALLE JOBSON","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("MICHELINI","JOAQUÍN","MED", "c","LA SALLE JOBSON","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("ERVITI","GABRIEL JESUS","MED", "c","LA SALLE JOBSON","T",0,0,1,4));
        jugadoresArgentino.add(new Jugador("ROMAGNOLI","MATÍAS","MED", "c","LA SALLE JOBSON","T",1,0,0,4));
        jugadoresArgentino.add(new Jugador("RODRIGUEZ","FERNANDO","MED", "c","LA SALLE JOBSON","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("ESTEVEZ","GABRIEL","DEL", "d","LA SALLE JOBSON","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("ROMEO","MAURO","DEL", "d","LA SALLE JOBSON","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("CASADO","GONZALO","DEL", "d","LA SALLE JOBSON","S",6,0,0,4));

        ArrayList<Jugador> jugadoresNewells = new ArrayList<>();
        jugadoresArgentino.add(new Jugador("BUTTICCE","LUIS","ARQ", "a","NEWELLS DE SANTA FE","T", 0, 1, 0, 4));
        jugadoresArgentino.add(new Jugador("VILLAR","AGUSTIN","DEF", "b","NEWELLS DE SANTA FE","T",1,1,0,4));
        jugadoresArgentino.add(new Jugador("ALBRETCH","PABLO","DEF", "b","NEWELLS DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("CALICS","ANDRÉS","DEF", "b","NEWELLS DE SANTA FE","T",1,1,0,4));
        jugadoresArgentino.add(new Jugador("ROSL","RODRIGO","DEF", "b","NEWELLS DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("COCCO","JOAQUÍN","MED", "c","NEWELLS DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("TELCH","GABRIEL JESUS","MED", "c","NEWELLS DE SANTA FE","T",0,0,1,4));
        jugadoresArgentino.add(new Jugador("RENDO","MATÍAS","MED", "c","NEWELLS DE SANTA FE","T",1,0,0,4));
        jugadoresArgentino.add(new Jugador("GONZALEZ","FERNANDO","MED", "c","NEWELLS DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("FISCHER","GABRIEL","DEL", "d","NEWELLS DE SANTA FE","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("VEGLIO","MAURO","DEL", "d","NEWELLS DE SANTA FE","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("DE LA MATA","GONZALO","DEL", "d","NEWELLS DE SANTA FE","S",0,0,0,4));

        ArrayList<Jugador> jugadoresSanjustino = new ArrayList<>();
        jugadoresArgentino.add(new Jugador("ROMERO","LUIS","ARQ", "a","SANJUSTINO","T", 0, 1, 0, 4));
        jugadoresArgentino.add(new Jugador("ROJO","AGUSTIN","DEF", "b","SANJUSTINO","T",1,1,0,4));
        jugadoresArgentino.add(new Jugador("OTAMENDI","PABLO","DEF", "b","SANJUSTINO","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("FUNES MORI","ANDRÉS","DEF", "b","SANJUSTINO","T",1,1,0,4));
        jugadoresArgentino.add(new Jugador("BUFFARINI","RODRIGO","DEF", "b","SANJUSTINO","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("BANEGA","JOAQUÍN","MED", "c","SANJUSTINO","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("BIGLIA","GABRIEL","MED", "c","SANJUSTINO","T",0,0,1,4));
        jugadoresArgentino.add(new Jugador("DI MARIA","MATÍAS","MED", "c","SANJUSTINO","T",1,0,0,4));
        jugadoresArgentino.add(new Jugador("MESSI","FERNANDO","MED", "c","SANJUSTINO","T",1,0,0,4));
        jugadoresArgentino.add(new Jugador("PRATTO","GABRIEL","DEL", "d","SANJUSTINO","S",2,0,0,4));
        jugadoresArgentino.add(new Jugador("CORREA","MAURO","DEL", "d","SANJUSTINO","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("ZAMPEDRI","GONZALO","DEL", "d","SANJUSTINO","S",0,0,0,4));

        ArrayList<Jugador> jugadoresUnion = new ArrayList<>();
        jugadoresArgentino.add(new Jugador("ORION","LUIS","ARQ", "a","UNION DE SANTA FE","T", 0, 1, 0, 4));
        jugadoresArgentino.add(new Jugador("GONZALEZ","AGUSTIN","DEF", "b","UNION DE SANTA FE","T",0,1,0,4));
        jugadoresArgentino.add(new Jugador("MENDEZ","PABLO","DEF", "b","UNION DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("TULA","ANDRÉS","DEF", "b","UNION DE SANTA FE","T",0,1,0,4));
        jugadoresArgentino.add(new Jugador("BOTTINELLI","RODRIGO","DEF", "b","UNION DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("LEDESMA","JOAQUÍN","MED", "c","UNION DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("HIRSIG","GABRIEL","MED", "c","UNION DE SANTA FE","T",0,0,1,4));
        jugadoresArgentino.add(new Jugador("RIVERO","MATÍAS","MED", "c","UNION DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("FERREYRA","FERNANDO","MED", "c","UNION DE SANTA FE","T",0,0,0,4));
        jugadoresArgentino.add(new Jugador("LAVEZZI","GABRIEL","DEL", "d","UNION DE SANTA FE","S",1,0,0,4));
        jugadoresArgentino.add(new Jugador("FERNANDEZ","MAURO","DEL", "d","UNION DE SANTA FE","S",0,0,0,4));
        jugadoresArgentino.add(new Jugador("SILVERA","GONZALO","DEL", "d","UNION DE SANTA FE","S",3,0,0,4));

        jugadores.add(jugadoresArgentino);
        jugadores.add(jugadoresAteneo);
        jugadores.add(jugadoresColon);
        jugadores.add(jugadoresCosmos);
        jugadores.add(jugadoresLaSalle);
        jugadores.add(jugadoresNewells);
        jugadores.add(jugadoresSanjustino);
        jugadores.add(jugadoresUnion);

        cargarJugadores(jugadores);
    }

    public static void cargarJugadores(ArrayList<ArrayList<Jugador>> jugadores) {
        for (int i = 0; i < jugadores.size(); i++) {
            for (int j = 0; j < jugadores.get(i).size(); j++) {
                database.getReference("datos").child("users").child("/jugadores/" + jugadores.get(i).get(j).getId()).setValue(jugadores.get(i).get(j));
                //database.getReference("datos").child("users").child("/jugadores/ARGENTINO DE SAN CARLOS DAMONTEAGUSTIN").child("goles").setValue("7");
            }
        }
    }
}
