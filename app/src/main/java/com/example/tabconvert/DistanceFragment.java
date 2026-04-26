package com.example.tabconvert;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.*;
import android.widget.*;
import androidx.fragment.app.Fragment;

public class DistanceFragment extends Fragment {

    EditText input;
    RadioButton km, mi;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_distance, container, false);

        input = v.findViewById(R.id.input);
        km = v.findViewById(R.id.km);
        mi = v.findViewById(R.id.mi);
        result = v.findViewById(R.id.result);

        v.findViewById(R.id.btn).setOnClickListener(x -> {
            String val = input.getText().toString();
            if (TextUtils.isEmpty(val)) return;

            double d = Double.parseDouble(val);
            double r = km.isChecked() ? d * 0.6214 : d / 0.6214;

            result.setText(String.format("%.2f", r));
        });

        return v;
    }
}