package br.com.jvictororiz.libs.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.jvictororiz.libs.R;

public class OurRecyclerviewAdapter extends RecyclerView.Adapter<OurRecyclerviewAdapter.ViewHolder> {
    private int idLayout;

    public OurRecyclerviewAdapter(int idLayout) {
        this.idLayout = idLayout;
    }

    List<String> itens = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(itens.get(position));
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }

    public void removeTopItem() {
        itens.remove(0);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }

        public void bind(String item) {
            TextView textView = itemView.findViewById(R.id.tv_text);
            if (textView != null)
                textView.setText(item);
        }
    }
}
