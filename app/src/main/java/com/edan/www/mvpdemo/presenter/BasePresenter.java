package com.edan.www.mvpdemo.presenter;

import java.lang.ref.WeakReference;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/18 10:17
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class BasePresenter<V> {

    protected WeakReference<V> mWeakReference;

    public void attach(V view){
        mWeakReference = new WeakReference<V>(view);
    }

    public void dettach(){
        if (mWeakReference.get()!=null){
            mWeakReference.clear();
        }
    }

}
