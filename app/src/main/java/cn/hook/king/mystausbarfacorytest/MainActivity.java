package cn.hook.king.mystausbarfacorytest;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;

import com.gyf.barlibrary.BarHide;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.hook.king.mystausbarfacorytest.utils.ActivityUtils;

/**
 * 类功能描述：</br>
 *沉浸式状态栏测试类
 * 博客地址：http://blog.csdn.net/androidstarjack
 * 公众号：终端研发部
 * @author yuyahao
 * @version 1.0 </p> 修改时间：</br> 修改备注：</br>
 */

public class MainActivity extends BaseActivity {
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.drawer)
    DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(setLayoutId());
        ButterKnife.bind(this);
    }


    @OnClick({R.id.bt01,R.id.btn_bar_hide,R.id.btn_bar_show,R.id.btn_drawer})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.bt01:
                ActivityUtils.showActivity(this,PicAndColorActivity.class);
                break;
            case R.id.btn_bar_hide:
                mImmersionBar.hideBar(BarHide.FLAG_HIDE_BAR).init();
                break;
            case R.id.btn_bar_show:
                mImmersionBar.hideBar(BarHide.FLAG_SHOW_BAR).init();
                break;
            case R.id.btn_drawer:
                drawer.openDrawer(Gravity.START);
        }
    }
    @Override
    protected int setLayoutId() {
        return R.layout.mian;
    }

    @Override
    protected void initImmersionBar() {
        super.initImmersionBar();
        mImmersionBar.titleBar(toolbar).init();
    }

}
