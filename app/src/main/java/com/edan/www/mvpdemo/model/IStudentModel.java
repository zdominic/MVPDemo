package com.edan.www.mvpdemo.model;

import com.edan.www.mvpdemo.bean.Student;

import java.util.List;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/18 10:04
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public interface IStudentModel {

    void getStudentData(OnStudentDataListener listener);

    interface OnStudentDataListener{
        void complete(List<Student> list);
    }
}
