package tw.petra.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmenttest.R;

public class FragmentSample2 extends Fragment {
	private TextView tv_date;

	@Override
	public View onCreateView(LayoutInflater inflater,
			 ViewGroup container, Bundle savedInstanceState) {
		//return super.onCreateView(inflater, container, savedInstanceState);
		
		View view=inflater.inflate(R.layout.fragmentsample2_layout, container, false);

		
		return view;
	}


}
