package br.sp.senac.projetorecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Livro_Activity extends AppCompatActivity {

    private TextView txtTitulo, txtDescricao, txtCategoria;
    private ImageView imagemLivro;
    Toolbar idToolBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.livro_layout);

        txtTitulo = findViewById(R.id.txtIdTitulo);
        txtDescricao = findViewById(R.id.txtIdDescricao);
        txtCategoria = findViewById(R.id.txtIdCategoria);
        imagemLivro = findViewById(R.id.idImgLivroN);
        idToolBar = findViewById(R.id.idToolBarLivros);

        //Inserir ação na seta de retorno da janela
        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
            }
        });

        //Inserir ação nos itens dse menu
        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mComprar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em comprar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mCarrinho:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em carrinho",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mFav:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em Favoritos",
                                Toast.LENGTH_SHORT).show();
                        break;

                }

                return false;
            }
        });


        //Intent que irá receber os valores da outra janela.
        Intent intent = getIntent();

        //As variáveis que irão receber os valores da outra janela.
        String titulo, descricao, categoria;
        int miniatura;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");
        miniatura = intent.getExtras().getInt("Miniatura");

        txtTitulo.setText(titulo);
        txtDescricao.setText(descricao);
        txtCategoria.setText(categoria);
        imagemLivro.setImageResource(miniatura);

    }
}
