package com.example.pablo.tod;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Salvador on 27/05/2015.
 */
public class ListAdapterItem<Object> extends ArrayAdapter<ClimaModel> {

    TextView day;
    TextView temp;
    TextView clima;

    public ListAdapterItem(Context context, int resource, List<ClimaModel> objects) {
        super(context, resource, objects);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ClimaModel clima1 = getItem(position);

        String dia= clima1.getDia();
        String temperatura=clima1.getTemperatura();
        String climita= clima1.getClima();



        if (convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        day = (TextView) convertView.findViewById(R.id.dia);
        temp = (TextView) convertView.findViewById(R.id.temperatura);
        clima= (TextView) convertView.findViewById(R.id.clima);


            day.setText(dia);
            temp.setText(temperatura);
            clima.setText(climita);


        return convertView;

    }

}
