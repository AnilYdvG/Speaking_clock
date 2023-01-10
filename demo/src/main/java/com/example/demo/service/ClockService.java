package com.example.demo.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class ClockService {

	public String getTime() {
		Date date = new Date();
		String strTimeFormat = "HH:mm";
		DateFormat dateFormat = new SimpleDateFormat(strTimeFormat);
		String formattedDate = dateFormat.format(date);

		String[] time = formattedDate.split(":");
		int h = Integer.parseInt(time[0]);
		int m = Integer.parseInt(time[1]);

		String nums[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "twenty one", "twenty two", "twenty three", "twenty four",

		};
		String s;
		String h1;

		if (m == 0)
			s = nums[h] + " o' clock ";
		if (m == 10)
			s = "it's " + nums[h] + " ten";
		if (m == 20)
			s = "it's " + nums[h] + " twenty";
		if (m == 30)
			s = "it's " + nums[h] + " thirty";
		if (m == 40)
			s = "it's " + nums[h] + " fourty";
		if (m == 50)
			s = "it's " + nums[h] + " fifty";

		if (m < 20)
			s = "it's " + nums[h] + " " + nums[m];

		else {
			int n = m % 10;
			if (m > 20 && m < 30)
				s = "it's " + nums[h] + " twenty " + nums[n];
			if (m > 30 && m < 40)
				s = "it's " + nums[h] + " thirty " + nums[n];
			if (m > 40 && m < 50)
				s = "it's " + nums[h] + " forty " + nums[n];
			else
				s = "it's " + nums[h] + " fifty " + nums[n];
		}

		if (h >= 4 && h < 11)
			h1 = "it's Morning";
		else if (h >= 11 && h < 16)
			h1 = "it's Midday";
		else if (h >= 16 && h < 20)
			h1 = "it's Evening";
		else
			h1 = "it's MidNight";

		return s + "\n" + h1;

	}

}
