package dot.wse.elektro.um.magangdot;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleViewAdapterPost extends RecyclerView.Adapter<RecycleViewAdapterPost.ViewHolder> {
    private ArrayList<String> rvData;

    public RecycleViewAdapterPost(ArrayList<String> inputData) {
        rvData = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public TextView tvTitle;
        public TextView tvBody;

        public ViewHolder(View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvBody = (TextView) v.findViewById(R.id.tv_body)
        }
    }
    @Override
    public RecycleViewAdapterPost.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_post, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        RecycleViewAdapterPost.ViewHolder vh = new RecycleViewAdapterPost.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecycleViewAdapterPost.ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        final String name = rvData.get(position);
        holder.tvTitle.setText(rvData.get(position));
        holder.tvBody.setText(rvData.get(position));
        //holder.tvSubtitle.setText("Frau " + position);
    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}

