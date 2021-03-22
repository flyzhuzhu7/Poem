package com.example.application2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.application2.main.PoemAdapter;
import com.example.application2.model.Poem;
import com.example.application2.ui.PoemActivity;
import com.example.application2.util.PoemUtils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private DrawerLayout drawerLayout;
    //下拉刷新控件
    private SwipeRefreshLayout swipeRefreshLayout;
    private ArrayList<Poem> list;
    private PoemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取Toolbar的实例
        Toolbar toolbar = findViewById(R.id.toolbar);
        //传入实例
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        //获取ActionBar实例
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            //显示导航按钮：HomeAsUp
            actionBar.setDisplayHomeAsUpEnabled(true);
            //设置导航按钮图标，默认是一个箭头
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }

        NavigationView navigationView = findViewById(R.id.nav_view);
        //设置默认选中
        navigationView.setCheckedItem(R.id.nav_call);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //关闭滑动菜单
                drawerLayout.closeDrawers();
                return true;
            }
        });

        //读取json格式的诗词
        list = (ArrayList<Poem>) PoemUtils.readPoems(this, "poem1.json");

        //打乱list元素顺序
        Collections.shuffle(list);

        //初始化RecyclerView
        final RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        adapter = new PoemAdapter(list);
        recyclerView.setAdapter(adapter);

        //设置悬浮按钮的点击事件
        FloatingActionButton button = findViewById(R.id.fab);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //回到RecyclerView的顶部
                recyclerView.scrollToPosition(0);
            }
        });

        //下拉刷新
        swipeRefreshLayout = findViewById(R.id.swipe_refresh);
        //设置下拉刷新进度条颜色
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshPoem();
            }
        });

    }

    /**
     * 创建选项菜单
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //为Activity指定选项菜单
        getMenuInflater().inflate(R.menu.toolbar, menu);
        //显示菜单项
        return true;
    }

    /**
     * 设置菜单项的点击事件
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //通过id识别菜单项
        switch (item.getItemId()) {
            //HomeAsUp按钮默认id
            case android.R.id.home:
                //将滑动菜单展示出来
                //Gravity参数对应XML的start
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.backup:
                Toast.makeText(this, "You clicked Backup", Toast.LENGTH_SHORT).show();
            case R.id.delete:
            case R.id.settings:
                break;
            default:
                //未处理菜单项（false）
                return super.onOptionsItemSelected(item);
        }
        //表示成功处理菜单项
        return true;
    }

    private void refreshPoem() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //线程睡眠1.5秒
                    Thread.sleep(1500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //刷新PoemList
                        Collections.shuffle(list);
                        //通知数据发生变化
                        adapter.notifyDataSetChanged();
                        //刷新结束，隐藏进度条
                        swipeRefreshLayout.setRefreshing(false);
                    }
                });
            }
        }).start();
    }

}