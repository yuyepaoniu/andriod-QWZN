package mobile.android.ch07.single.choice.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity
{
	private String[] provinces = new String[]
	{ "����ʡ", "ɽ��ʡ", "�ӱ�ʡ", "����ʡ", "�㶫ʡ", "������ʡ" };
	private int index;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);


	}
	public void onClick_SingleChoiceDialog(View view)
	{
		new AlertDialog.Builder(this).setTitle("ѡ��ʡ��")
		.setSingleChoiceItems(provinces, -1, new OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog, int which)
			{
				index = which;

			}
		}).setPositiveButton("ȷ��", new OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog, int which)
			{
				new AlertDialog.Builder(Main.this).setMessage(
						"���Ѿ�ѡ���ˣ� " + index + ":" + provinces[index])
						.show();

			}
		}).setNegativeButton("ȡ��", new OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog, int which)
			{
				new AlertDialog.Builder(Main.this).setMessage(
						"��ʲô��δѡ��.").show();

			}
		}).show();
	}
}