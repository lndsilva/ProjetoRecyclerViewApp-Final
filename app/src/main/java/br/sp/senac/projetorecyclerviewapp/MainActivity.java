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
        lstLivros.add(new Livros("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
        lstLivros.add(new Livros("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        lstLivros.add(new Livros("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        lstLivros.add(new Livros("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        lstLivros.add(new Livros("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        lstLivros.add(new Livros("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        lstLivros.add(new Livros("The Vegitarian ", "Categoria do livro", "Descrição do livro", R.drawable.thevigitarian));
        lstLivros.add(new Livros("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        lstLivros.add(new Livros("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        lstLivros.add(new Livros("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        lstLivros.add(new Livros("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        lstLivros.add(new Livros("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        lstLivros.add(new Livros("The Vegitarian ", "Categoria do livro", "Descrição do livro", R.drawable.thevigitarian));
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
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));
        //Inserindo os valores na lista do RecyclerView
        mRecyclerView.setAdapter(mAdapter);



    }
}
