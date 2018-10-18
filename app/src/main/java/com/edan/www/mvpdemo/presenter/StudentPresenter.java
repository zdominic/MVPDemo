package com.edan.www.mvpdemo.presenter;

import com.edan.www.mvpdemo.bean.Student;
import com.edan.www.mvpdemo.model.IStudentModel;
import com.edan.www.mvpdemo.model.StudentModelImpl;
import com.edan.www.mvpdemo.view.IStudentView;

import java.util.List;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/18 10:09
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class StudentPresenter<T extends IStudentView> extends BasePresenter<T>{


    private IStudentModel mModel = new StudentModelImpl();

    public StudentPresenter() {
    }

    public void load() {
        if (mWeakReference.get()!=null){
            if (mModel!=null){
                mModel.getStudentData(new IStudentModel.OnStudentDataListener() {
                    @Override
                    public void complete(List<Student> list) {
                        mWeakReference.get().showStudentData(list);
                    }
                });
            }
        }
    }
}
