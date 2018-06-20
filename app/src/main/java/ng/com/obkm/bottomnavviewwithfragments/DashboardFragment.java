package ng.com.obkm.bottomnavviewwithfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {

    public TextView countTv;
    public Button countBtn;

    public DashboardFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        countTv = (TextView) view.findViewById(R.id.count_tv);
        countTv.setText("0");
        countBtn = (Button) view.findViewById(R.id.count_btn);
        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseCount();
            }
        });
        return view;
    }

    private void increaseCount() {
        int current = Integer.parseInt((String) countTv.getText());
        countTv.setText(String.valueOf(current+1));

    }

}
