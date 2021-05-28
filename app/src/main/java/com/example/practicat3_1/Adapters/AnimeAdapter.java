package com.example.practicat3_1.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practicat3_1.Entity.Anime;
import com.example.practicat3_1.R;

import org.w3c.dom.Text;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.PalabraViewHolder> {

    List<Anime> animes;

    public AnimeAdapter(List<Anime> animes)
    {
        this.animes =animes;
    }

    @Override
    public PalabraViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_anime, parent, false);

        return new PalabraViewHolder(view);
    }

    @Override
    public void onBindViewHolder( AnimeAdapter.PalabraViewHolder holder, int position) {
        View view = holder.itemView;
        Anime anime = animes.get(position);

        TextView idNombre= view.findViewById(R.id.idNombre);
        TextView idDescripcion = view .findViewById(R.id.idDescripcion);
        ImageView idImagen= view.findViewById(R.id.idImagen);
        ImageView idImagen2= view.findViewById(R.id.idImagen2);


        idImagen.setImageResource(anime.Foto);
        idNombre.setText(anime.Nombre);
        idDescripcion.setText(anime.Descripcion);
        idImagen2.setImageResource(anime.Favorito);
    }

    @Override
    public int getItemCount() {
        return animes.size();
    }

    public class PalabraViewHolder extends RecyclerView.ViewHolder{


        public PalabraViewHolder(View itemView) {
            super(itemView);
        }
    }
}
