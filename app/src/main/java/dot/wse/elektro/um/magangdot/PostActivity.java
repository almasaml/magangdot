package dot.wse.elektro.um.magangdot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class PostActivity extends AppCompatActivity {

        private RecyclerView rvView;
        private RecyclerView.Adapter adapter;
        private RecyclerView.LayoutManager layoutManager;
        private ArrayList<String> dataSet;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_post);

            dataSet = new ArrayList<>();
            initDataset();

            rvView = (RecyclerView) findViewById(R.id.rv_post);
            rvView.setHasFixedSize(true);

            layoutManager = new LinearLayoutManager(this);
            rvView.setLayoutManager(layoutManager);

            adapter = new RecyclerViewAdapter(dataSet);
            rvView.setAdapter(adapter);

            private void initDataset(){

                /**
                 * Tambahkan item ke dataset
                 * dalam prakteknya bisa bermacam2
                 * tidak hanya String seperti di kasus ini
                 */
                dataSet.add("Karin");
                dataSet.add("Ingrid");
                dataSet.add("Helga");
                dataSet.add("Renate");
                dataSet.add("Elke");
                dataSet.add("Ursula");
                dataSet.add("Erika");
                dataSet.add("Christa");
                dataSet.add("Gisela");
                dataSet.add("Monika");

            }
        }
    public void komen(View view) {
        Intent intent = new Intent(PostActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
