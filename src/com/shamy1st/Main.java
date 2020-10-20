package com.shamy1st;

import com.shamy1st.template.Task;
import com.shamy1st.template.TransferMoneyTask;

public class Main {

	public static void main(String[] args) {
		Task task = new TransferMoneyTask();
		task.execute();
	}
}