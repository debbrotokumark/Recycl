package com.emon.recycl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static RecyclerView recyquiz;
    Button button;
    public static int i = 0;
    boolean bol = true;
    public static int totalqn = 100;
    public static int totasel = 0;
    LinearLayoutManager layoutManager;
    TextView textViewTotal;
    public static ImageView imageView2;
    public static Myadapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myadapter = new Myadapter();
        button = findViewById(R.id.button);

        textViewTotal = findViewById(R.id.textViewTotal);
        recyquiz = findViewById(R.id.recyquiz);
        recyquiz.setAdapter(myadapter);
        recyquiz.setItemViewCacheSize(totalqn); //By the number of items
        layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyquiz.setLayoutManager(layoutManager);
        recyquiz = findViewById(R.id.recyquiz);
        button = findViewById(R.id.button);
        myadapter.notifyDataSetChanged();
        recyquiz.setItemViewCacheSize(totalqn);
    }


    public class Myadapter extends RecyclerView.Adapter<Myadapter.myviewholder> {


        @NonNull
        @Override
        public Myadapter.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View myview = inflater.inflate(R.layout.qn, parent, false);
            return new myviewholder(myview);

        }

        @Override
        public void onBindViewHolder(@NonNull Myadapter.myviewholder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return totalqn;
        }

        public class myviewholder extends RecyclerView.ViewHolder {

            public myviewholder(@NonNull View itemView) {
                super(itemView);

                imageView2 = itemView.findViewById(R.id.imageView2);
                imageView2.setVisibility(View.VISIBLE);


            }
        }
    }


}