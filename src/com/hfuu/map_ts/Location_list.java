package com.hfuu.map_ts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Location_list extends Activity {
	private ListView loc_list;
	private ArrayAdapter<String> arrayAdapter;
	private String[] test_data = {
			"���պϷ�","���պϷ�","���պϷ�","���պϷ�","���պϷ�","���պϷ�","���պϷ�","���պϷ�",};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.location_list);
		loc_list = (ListView) findViewById(R.id.loc_listview);
		//����adapter ����Listview
		arrayAdapter = new ArrayAdapter<String>(
				this, android.R.layout.simple_list_item_1,test_data);
		loc_list.setAdapter(arrayAdapter);
	}
}
