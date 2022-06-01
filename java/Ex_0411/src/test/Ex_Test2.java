package test;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_Test2 {

	static String daySelect = "";
	static String timeSelect = "";

	public static void main(String[] args) {

		Choice day = new Choice();
		Choice time = new Choice();

		String[] a = {"4/18","4/19", "4/20", "4/21", "4/22"};

		String[] b = {"12:00", "14:00", "16:00", "18:00", "20:00"};

		day.add("날짜를 선택해 주세요");

		for(int i = 0; i < a.length; i++) {

			day.add(a[i]);
			day.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					daySelect = e.getItem().toString();

				}
			});
		}

		time.add("시간을 선택해 주세요");

		for(int j = 0; j < b.length; j++) {

			time.add(b[j]);
			time.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					timeSelect = e.getItem().toString();

				}
			});

		}



	}
}
