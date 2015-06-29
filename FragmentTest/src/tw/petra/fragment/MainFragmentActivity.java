package tw.petra.fragment;

import com.example.fragmenttest.R;
import com.example.fragmenttest.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainFragmentActivity extends FragmentActivity {
	private Button btn1, btn2, btn3;
	private FragmentManager fragmentManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);
		btn3 = (Button) findViewById(R.id.btn3);
		MyClickListener listener = new MyClickListener();
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(listener);
		btn3.setOnClickListener(listener);

		fragmentManager = getSupportFragmentManager();

		Fragment fragment = fragmentManager.findFragmentById(R.id.framelayout);
		fragment = new FragmentSample1();
		fragmentManager.beginTransaction().replace(R.id.framelayout, fragment)
				.commit();

	}

	public void replaceFragment(Fragment f) {
		fragmentManager.beginTransaction().replace(R.id.framelayout, f)
				.addToBackStack(null).commit();
	}

	public class MyClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn1:
				Log.d("cindy", "btn1");
				replaceFragment(new FragmentSample1());
				break;
			case R.id.btn2:
				Log.d("cindy", "btn2");
				replaceFragment(new FragmentSample2());
				break;
			case R.id.btn3:
				Log.d("cindy", "btn3");
				break;
			}

		}

	}
}
