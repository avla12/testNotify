package tw.petra.fragment;

import java.util.Date;

import com.example.fragmenttest.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentSample1 extends Fragment {

	private TextView tv_date;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container, Bundle savedInstanceState) {
		//return super.onCreateView(inflater, container, savedInstanceState);
		
		View view=inflater.inflate(R.layout.fragmentsample1_layout, container, false);
		tv_date=(TextView) view.findViewById(R.id.tv_Date);
		tv_date.setText("2016/06/30");
		
		return view;
	}

}
