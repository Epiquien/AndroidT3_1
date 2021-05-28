package com.example.practicat3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.practicat3_1.Adapters.AnimeAdapter;
import com.example.practicat3_1.Entity.Anime;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Anime> animes =GetAnimes();

        RecyclerView rv = findViewById(R.id.rvPalabras);
        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        AnimeAdapter adapter= new AnimeAdapter(animes);


        rv.setAdapter(adapter);


    }

    private  List<Anime> GetAnimes()
    {
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("Bleach", "La serie narra las aventuras de Ichigo Kurosaki, un joven adolescente de quince años de edad que accidentalmente absorbe los poderes de una shinigami", R.drawable.bleach, R.drawable.estrellablanca));
        animes.add(new Anime("One Piece", "Monkey D. Luffy quiere llegar a ser el Rey de los Piratas y hacerse al fin con un legendario tesoro, el One Piece.", R.drawable.onepiece,  R.drawable.estrellablanca));
        animes.add(new Anime("Dragon Ball Z", "CUn valiente joven con poderes increíbles se aventura hacia un viaje místico en tierras exóticas llenas de guerreros nobles, princesas hermosas, monstruos mutantes, extraterrestres y crueles ejércitos.", R.drawable.dragonballz,  R.drawable.estrellablanca));
        animes.add(new Anime("Naruto", ". La obra narra la historia de un ninja adolescente llamado Naruto Uzumaki, quien aspira a convertirse en hokage", R.drawable.naruto ,  R.drawable.estrellablanca));
        animes.add(new Anime("One punch Man", "Saitama comenzó a hacer de héroe por pura afición, y tras tres años de un durísimo entrenamiento consiguió tal nivel de fuerza", R.drawable.onepunchman,  R.drawable.estrellablanca));
        animes.add(new Anime("Baki", "Baki entrena duro para superar la leyenda de su padre, lo cual llega a oídos de 5 peligrosos criminales de todo el mundo que deciden tomar acción", R.drawable.baki,  R.drawable.estrellablanca));
        animes.add(new Anime("Death Note", "Un estudiante excepcional de secundaria que encuentra un misterioso cuaderno de notas el cual pertenece a un dios de la muerte", R.drawable.deathnote,  R.drawable.estrellablanca));
        animes.add(new Anime("Full Metal Alchemist", "Edward y Alphonse Elric son dos hermanos en busca de la piedra filosofal. Viven en un mundo donde la alquimia", R.drawable.fullalchemist,  R.drawable.estrellablanca));
        animes.add(new Anime("Nanatzu No Taizai", "Es un grupo variopinto de guerreros, algunos aparentan ser personas normales mientras que otros tienen una desproporcionada musculatura", R.drawable.nanatzunotaizai,  R.drawable.estrellablanca));
        animes.add(new Anime("Feiry Tail", "La historia comienza cuando esté joven conoce a una joven maga de espíritus llamada Lucy Heartfilia la cual su sueño es ingresar al gremio ", R.drawable.feirytail,  R.drawable.estrellablanca));

        return animes;
    }
}