package br.com.ccard.baskete;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int pontuacaoTimeA = 0;
    private int pontuacaoTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoTresPontosTimeA = findViewById(R.id.tresPontosA);
        botaoTresPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTresPontosTimeA();
            }
        });
        Button botaoDoisPontosTimeA = findViewById(R.id.doisPontosA);
        botaoDoisPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDoisPontosTimeA();
            }
        });

        Button botaoTiroLivreTimeA = findViewById(R.id.tiroLivreA);
        botaoTiroLivreTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUmPontoTimeA();
            }
        });

        Button botaoTresPontosTimeB = findViewById(R.id.tresPontosB);
        botaoTresPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTresPontosTimeB();
            }
        });

        Button botaoDoisPontosTimeB = findViewById(R.id.doisPontosB);
        botaoDoisPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDoisPontosTimeB();
            }
        });

        Button botaoTiroLivreB = findViewById(R.id.tiroLivreB);
        botaoTiroLivreB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUmPontoTimeB();
            }
        });

        Button botaoReiniciarPartida = findViewById(R.id.reiniciarPartida);
        botaoReiniciarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reiniciarPartida();
            }
        });
    }


    public void reiniciarPartida(){
        pontuacaoTimeA = 0;
        pontuacaoTimeB = 0;
        mostrarPlacarTimeA(pontuacaoTimeA);
        mostrarPlacarTimeB(pontuacaoTimeB);
        Toast.makeText(this,"Partida reiniciado",Toast.LENGTH_SHORT).show();
    }

    public void mostrarPlacarTimeA(int pontuacao){
        TextView placarTimeA = findViewById(R.id.placarTimeA);
        placarTimeA.setText(String.valueOf(pontuacao));
    }

    public void addTresPontosTimeA(){
        pontuacaoTimeA = pontuacaoTimeA + 3;
        mostrarPlacarTimeA(pontuacaoTimeA);
    }

    public void addDoisPontosTimeA(){
        pontuacaoTimeA += 2;
        mostrarPlacarTimeA(pontuacaoTimeA);
    }

    public void addUmPontoTimeA(){
        pontuacaoTimeA += 1;
        mostrarPlacarTimeA(pontuacaoTimeA);
    }

    public void mostrarPlacarTimeB(int pontuacao){
        TextView placarTimeB = findViewById(R.id.placarTimeB);
        placarTimeB.setText(String.valueOf(pontuacao));
    }

    public void addTresPontosTimeB(){
        pontuacaoTimeB = pontuacaoTimeB + 3;
        mostrarPlacarTimeB(pontuacaoTimeB);
    }

    public void addDoisPontosTimeB(){
        pontuacaoTimeB += 2;
        mostrarPlacarTimeB(pontuacaoTimeB);
    }

    public void addUmPontoTimeB(){
        pontuacaoTimeB += 1;
        mostrarPlacarTimeB(pontuacaoTimeB);
    }

}
