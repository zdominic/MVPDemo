package com.edan.www.mvpdemo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.edan.www.mvpdemo.presenter.BasePresenter;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/18 10:39
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity{
    //表示层的引用
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = creatPresenter();
        presenter.attach((V) this);
    }

    protected abstract T creatPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dettach();
    }
}
