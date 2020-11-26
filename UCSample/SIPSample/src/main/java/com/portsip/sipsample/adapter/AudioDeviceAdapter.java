package com.portsip.sipsample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.portsip.PortSipEnumDefine;
import com.portsip.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AudioDeviceAdapter extends BaseAdapter
{
    PortSipEnumDefine.AudioDevice[] audioDeviceList;

    List<PortSipEnumDefine.AudioDevice> audioDeviceAvailable = new ArrayList<>();
    public AudioDeviceAdapter(@NonNull PortSipEnumDefine.AudioDevice[] audioDeviceList){
        this.audioDeviceList = audioDeviceList;
    }

    public void setSelectalbeAudioDevice(Set<PortSipEnumDefine.AudioDevice> devices){
        audioDeviceAvailable.clear();
        audioDeviceAvailable.addAll(devices);
    }

    @Override
    public int getCount() {
        return audioDeviceList.length;
    }

    @Override
    public Object getItem(int position) {
        return audioDeviceList[position];
    }

    @Override
    public long getItemId(int position) {
        Object object = getItem(position);
        if(object!=null){
            return ((PortSipEnumDefine.AudioDevice)object).ordinal();
        }
        return -1;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView textView;
        if(convertView ==null) {
            textView = (TextView)LayoutInflater.from(parent.getContext()).inflate(R.layout.audio_device, null);
        }else{
            textView = (TextView)convertView;
        }

        PortSipEnumDefine.AudioDevice device =  (PortSipEnumDefine.AudioDevice)getItem(position);
        textView.setText(device.toString());

        if(audioDeviceAvailable.contains(device)) {
            textView.setBackgroundColor(textView.getResources().getColor(android.R.color.white));
        }else{
            textView.setBackgroundColor(textView.getResources().getColor(android.R.color.darker_gray));
        }
        return textView;
    }

}


