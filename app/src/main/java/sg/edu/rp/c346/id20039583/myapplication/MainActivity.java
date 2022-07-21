package sg.edu.rp.c346.id20039583.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;

import sg.edu.rp.c346.id20039583.myapplication.CustomArrayAdapter;
import sg.edu.rp.c346.id20039583.myapplication.ToDoItem;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alToDoList;
    CustomArrayAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);

        alToDoList = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020,8,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);
        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);
        alToDoList.add(item1);
        alToDoList.add(item2);

        caToDo = new CustomArrayAdapter(this, R.layout.row, alToDoList);

        lvToDo.setAdapter(caToDo);

    }
}
