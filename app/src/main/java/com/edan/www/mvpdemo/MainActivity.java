package com.edan.www.mvpdemo;

import android.os.Bundle;
import android.util.Log;

import com.edan.www.mvpdemo.bean.Student;
import com.edan.www.mvpdemo.presenter.StudentPresenter;
import com.edan.www.mvpdemo.view.BaseActivity;
import com.edan.www.mvpdemo.view.IStudentView;

import java.util.List;

public class MainActivity extends BaseActivity<IStudentView,StudentPresenter<IStudentView>> implements IStudentView {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.load();
    }

    @Override
    protected StudentPresenter<IStudentView> creatPresenter() {
        return new StudentPresenter<>();
    }

    @Override
    public void showStudentData(List<Student> students) {
        Log.e("aaa", "showStudentData "+students.size());
    }
}
