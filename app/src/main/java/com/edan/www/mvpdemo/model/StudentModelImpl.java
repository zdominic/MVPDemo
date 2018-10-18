package com.edan.www.mvpdemo.model;

import com.edan.www.mvpdemo.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/18 10:07
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class StudentModelImpl implements IStudentModel {

    @Override
    public void getStudentData(OnStudentDataListener listener) {
        List<Student> list = getList();
        listener.complete(list);
    }

    public List<Student> getList() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三",23));
        students.add(new Student("李四",24));
        students.add(new Student("王五",25));
        return students;
    }
}
