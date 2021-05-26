package br.sp.senac.projetorecyclerviewapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Livros> mData;

    //Construtor da classe
    public RecyclerViewAdapter(Context mContext, List<Livros> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_livros, parent, false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        //passando valores para o RecyclerView
        holder.tvTituloLivro.setText(mData.get(position).getTitulo());
        holder.imgLivro.setImageResource(mData.get(position).getMiniatura());
        //Evento de clique no cardView
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, Livro_Activity.class);

                intent.putExtra("Titulo", mData.get(position).getTitulo());
                intent.putExtra("Descricao", mData.get(position).getDescricao());
                intent.putExtra("Categoria", mData.get(position).getCategoria());
                intent.putExtra("Miniatura", mData.get(position).getMiniatura());

                mContext.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        //tamanho da lista de livros
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvTituloLivro;
        ImageView imgLivro;
        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            tvTituloLivro = itemView.findViewById(R.id.id_lblTituloLivro);
            imgLivro = itemView.findViewById(R.id.id_imgLivro);
            cardView = itemView.findViewById(R.id.idCardView);


        }
    }
}
