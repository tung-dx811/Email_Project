package com.example.email_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Email> emails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emails = new ArrayList<>();

        emails.add(new Email("Coursera", "Recommended: Python for Everybody" +
                "We combed our catalog and found courses that we think match your interests." +
                " Browse our recommendations below, and start learning something new today!", "12:34 PM"));
        emails.add(new Email("HackerankTeam", "We Challenge You to Solve." +
                "Hi Tùng, Improve your skills with this challenge recommended for you","11:22 AM"));
        emails.add(new Email("Atlassian", "Upcoming changes to our server and Data Center products" +
                "Hello,...", "9:20 AM"));
        emails.add(new Email("Trọng Hải Nguyễn","Hello - NMKTTT.zip", "9:19 AM"));
        emails.add(new Email("Google.com", "Security warning!!!","8:03 AM"));
        emails.add(new Email("UpRace2020","Cập nhật thông tin nhận áo Wining Team UpRace 2020",
                "7:30 AM"));
        emails.add(new Email("Sinno Club","Thư xác nhận tham gia SINNO Workshop vào tối ngày 8/10/2020"
        ,"6:30 AM"));

        AdapterEmail adapter = new AdapterEmail(this,emails);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}