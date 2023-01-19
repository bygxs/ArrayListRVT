package com.example.arraylistrvt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonsRecyclerViewAdapter extends
        RecyclerView.Adapter<PersonsRecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<PersonModel> personModels;

    public PersonsRecyclerViewAdapter(Context context, ArrayList<PersonModel> personModels ) {
        this.context = context;
        this.personModels = personModels;
    }

    @NonNull
    @Override
    public PersonsRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row,parent, false);

        return new PersonsRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonsRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvPerson.setText(personModels.get(position).getPersons());
        holder.tvCar.setText(personModels.get(position).getCars());
        holder.tvPet.setText(personModels.get(position).getPets());
        holder.imageView.setImageResource(personModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return personModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvPerson, tvCar,tvPet;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvPerson = itemView.findViewById(R.id.tv_name_person);
            tvCar = itemView.findViewById(R.id.tv_identity);
            tvPet = itemView.findViewById(R.id.tv_type);

        }
    }
}
