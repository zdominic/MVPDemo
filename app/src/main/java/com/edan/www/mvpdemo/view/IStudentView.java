package com.edan.www.mvpdemo.view;

import com.edan.www.mvpdemo.bean.Student;

import java.util.List;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/18 10:02
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public interface IStudentView {

    void showStudentData(List<Student> students);
}
