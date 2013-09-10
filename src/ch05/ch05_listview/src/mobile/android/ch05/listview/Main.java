package mobile.android.ch05.listview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;

public class Main extends Activity implements OnItemSelectedListener,
		OnItemClickListener
{
	private static String[] data = new String[]
	{
			"�������",
			"����ͨ��",
			"��������(Ʈ)",
			"����һ֦÷",
			"����ռ�",
			"��ȸ��",
			"���ν��3�����˰棩",
			"�Ǽʴ���",
			"����Ц���������У�СЬ����С����������ǿ��ͷ���ɲ����书�Ĳ��������ֵ�һ���֣��Ա�ɽ���Ǹ��书��ǿ�Ĵ�����������书��С������ܣ���Ұ�����Ա�ɽ������Ƥ�𣬾��������Ա�ɽ�� �����ɫ��Χ��С�������á�" };

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id)
	{
		Log.d("itemclick", "click " + position + " item");

	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id)
	{
		Log.d("itemselected", "select " + position + " item");
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent)
	{
		Log.d("nothingselected", "nothing selected");

	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ListView lvCommonListView = (ListView) findViewById(R.id.lvCommonListView);

		// ��ArrayAdapter���췽�������һ�������ĳ�dataList��ϵͳ�ͻ����List���������
		// List<String> dataList = new ArrayList<String>();
		// dataList.add("��������");
		// dataList.add("��������");
		ArrayAdapter<String> aaData = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, data);

		lvCommonListView.setAdapter(aaData);
	//	lvCommonListView.setSelection(6);
		lvCommonListView.setOnItemClickListener(this);
		lvCommonListView.setOnItemSelectedListener(this);

	}

}
