package com.portsip.sipsample.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.portsip.PortSipEnumDefine;
import com.portsip.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AudioDeviceAdapter extends ArrayAdapter
{
    static List<PortSipEnumDefine.AudioDevice> audioDeviceList = new ArrayList(){
        {add(PortSipEnumDefine.AudioDevice.EARPIECE);
        add(PortSipEnumDefine.AudioDevice.SPEAKER_PHONE);
        add(PortSipEnumDefine.AudioDevice.BLUETOOTH);
        add(PortSipEnumDefine.AudioDevice.WIRED_HEADSET);}};
    static List<PortSipEnumDefine.AudioDevice> audioDeviceAvailable = new ArrayList<>();
    static int select =0;

    public AudioDeviceAdapter(@NonNull Context context) {
        super(context, R.layout.audio_device,audioDeviceList);
    }

    public static int getCurrentDevice(){
        return select;
    }

    public static void setSelectalbeAudioDevice(PortSipEnumDefine.AudioDevice current, Set<PortSipEnumDefine.AudioDevice> devices){
        audioDeviceAvailable.clear();
        audioDeviceAvailable.addAll(devices);

        select = audioDeviceList.indexOf(current);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view =  super.getDropDownView(position, convertView, parent);
        PortSipEnumDefine.AudioDevice device =  (PortSipEnumDefine.AudioDevice)getItem(position);
        boolean available = audioDeviceAvailable.contains(device);
        switch (device){
            case EARPIECE:
                ((TextView)view).setText("EARPIECE");
                break;
            case SPEAKER_PHONE:
                ((TextView)view).setText("SPEAKER_PHONE");
                break;
            case  BLUETOOTH:
                ((TextView)view).setText("BLUETOOTH");
                break;
            case  WIRED_HEADSET:
                ((TextView)view).setText("WIRED_HEADSET");
                break;
        }

        view.setClickable(!available);
        if(available) {
            view.setBackground(null);
        }else{
            view.setBackgroundColor(getContext().getResources().getColor(android.R.color.darker_gray));
        }


        return view;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = super.getView(position, convertView, parent);

        PortSipEnumDefine.AudioDevice device =  (PortSipEnumDefine.AudioDevice)getItem(position);
        switch (device){
            case EARPIECE:
                ((TextView)view).setText("EARPIECE");
                break;
            case SPEAKER_PHONE:
                ((TextView)view).setText("SPEAKER_PHONE");
                break;
            case  BLUETOOTH:
                ((TextView)view).setText("BLUETOOTH");
                break;
            case  WIRED_HEADSET:
                ((TextView)view).setText("WIRED_HEADSET");
                break;
        }
        view.setTag(device);
        return view;
    }
}


