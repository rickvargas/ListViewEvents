package com.example.listviewevents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class EventoAdapter extends ArrayAdapter<Evento> {
	Context mContext;
	int mResource;
	
	public EventoAdapter(Context context, int resource, Evento[] objects){
		super(context, resource, objects);
		mContext = context;
		mResource = resource;
	}
	
	@NonNull
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		LayoutInflater layoutInflater = LayoutInflater.from(mContext);
		convertView = layoutInflater.inflate(mResource,parent,false);
		
		TextView textViewId = convertView.findViewById(R.id.textViewID);
		TextView textViewPrioridade = convertView.findViewById(R.id.textViewPrioridade);
		ImageView imageViewPrioridade = convertView.findViewById(R.id.imagemViewPriority);
		TextView textViewDescricao = convertView.findViewById(R.id.textViewDescription);
		TextView textViewCategoria = convertView.findViewById(R.id.textViewCategory);
		
		Evento evento = getItem(position);
		
		textViewId.setText(evento.getId());
		imageViewPrioridade.setImageResource(evento.getImgPrioridade());
		textViewPrioridade.setText(evento.getPrioridade());
		textViewDescricao.setText(evento.getDescricao());
		textViewCategoria.setText(evento.getCategoria());
		
		return convertView;
	}
}

