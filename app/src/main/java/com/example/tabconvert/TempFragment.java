package com.example.tabconvert;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.*;
import android.widget.*;
import androidx.fragment.app.Fragment;

public class TempFragment extends Fragment {

    EditText input;
    RadioButton cf, fc;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_temp, container, false);

        input = v.findViewById(R.id.input);
        cf = v.findViewById(R.id.cf);
        fc = v.findViewById(R.id.fc);
        result = v.findViewById(R.id.result);

        v.findViewById(R.id.btn).setOnClickListener(x -> {
            String val = input.getText().toString();
            if (TextUtils.isEmpty(val)) return;

            double d = Double.parseDouble(val);
            double r = cf.isChecked() ? (1.8 * d + 32) : (d - 32) / 1.8;

            result.setText(String.format("%.2f", r));
        });

        return v;
    }
}