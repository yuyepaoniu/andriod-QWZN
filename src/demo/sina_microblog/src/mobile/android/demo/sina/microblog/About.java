package mobile.android.demo.sina.microblog;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends Activity
{
	private TextView tvAbout;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		tvAbout = (TextView) findViewById(R.id.tvAbout);
		String about = "����΢���ͻ���     �汾��1.0\n\n";
		about += "���ߣ�����\n\n";
		about += "����������ʹ��\n\n";
		about += "���ͣ�http://nokiaguy.blogjava.net\n\n";
		
		tvAbout.setText(about);
	}
}
 