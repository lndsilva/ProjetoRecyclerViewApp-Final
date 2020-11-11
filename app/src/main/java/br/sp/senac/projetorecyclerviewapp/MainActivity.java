package br.sp.senac.projetorecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Livros> lstLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inserindo os livros no arrayList vazio
        lstLivros = new ArrayList<>();
        lstLivros.add(new Livros("O dilema","Auto ajuda","O dilema do porco espinho",R.drawable.dilema));
        lstLivros.add(new Livros("Como fazer Amigos","Auto ajuda","Como fazer amigos",R.drawable.amigos));
        lstLivros.add(new Livros("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
        lstLivros.add(new Livros("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        lstLivros.add(new Livros("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        lstLivros.add(new Livros("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        lstLivros.add(new Livros("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        lstLivros.add(new Livros("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        lstLivros.add(new Livros("O dilema","Auto ajuda","O dilema do porco espinho",R.drawable.dilema));
        lstLivros.add(new Livros("Como fazer Amigos","Auto ajuda","Como fazer amigos",R.drawable.amigos));
        lstLivros.add(new Livros("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
        lstLivros.add(new Livros("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        lstLivros.add(new Livros("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        lstLivros.add(new Livros("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        lstLivros.add(new Livros("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        lstLivros.add(new Livros("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));

        //declarando a variavel xml enviando para o java
        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);

        //Instânciando o adaptador com os valores necessários
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplicationContext(), lstLivros);
        //Criando o layout para inserção dos valores

        //LayoutManager não é necessário inserção de colunas - pode ser utilizado na vertical ou horizontal
       // mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL,true));

        //GriLayoutManager necessário a inserção de colunas
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //Para melhorar a performance do RecyclerView na listagem
        mRecyclerView.setHasFixedSize(true);

        //Inserindo os valores na lista do RecyclerView
        mRecyclerView.setAdapter(mAdapter);


    }
}
