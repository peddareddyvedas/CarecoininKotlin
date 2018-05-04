package com.example.rise.carecoininkotlin

import android.os.Build
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.example.rise.carecoininkotlin.HomeModule.SideMenuViewController
import com.example.tablayoutmanytabs.PageAdapter
import kotlinx.android.synthetic.main.activityhome.*


/**
 * Created by Rise on 23/04/2018.
 */
class HomeActivity : AppCompatActivity(), SideMenuViewController.FragmentDrawerListener {

    internal lateinit var toolbar: Toolbar
    internal lateinit var back: ImageView
    internal lateinit var add: ImageView
    internal lateinit var tool_text: TextView
    internal lateinit var frameLayout: FrameLayout
    internal lateinit var drawerFragment: SideMenuViewController
    internal lateinit var drawer: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityhome)
        init()
        configureTabLayout()
        initializeDrawer()
    }


    private fun configureTabLayout() {

        tablayout.addTab(tablayout.newTab().setText("Receive"))
        tablayout.addTab(tablayout.newTab().setText("Activity"))
        tablayout.addTab(tablayout.newTab().setText("Send"))
        tablayout.getTabAt(0)!!.setIcon(R.drawable.ic_receive)
        tablayout.getTabAt(1)!!.setIcon(R.drawable.ic_activity)
        tablayout.getTabAt(2)!!.setIcon(R.drawable.ic_send)

        val adapter = PageAdapter(supportFragmentManager,
                tablayout.tabCount)
        view_pager.adapter = adapter

        view_pager.addOnPageChangeListener(
                TabLayout.TabLayoutOnPageChangeListener(tablayout))

        tablayout.addOnTabSelectedListener(object :
                TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                view_pager.currentItem = tab.position

            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }

        })

    }


    fun init() {
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        back = findViewById(R.id.toolbar_icon) //Spectrum
        back.setBackgroundResource(R.drawable.ic_sidemenu)


        tool_text = toolbar.findViewById(R.id.toolbar_text)
        //frameLayout = findViewById(R.id.frame)
        add = toolbar.findViewById(R.id.img_share)
        // add.setImageResource(R.drawable.ic_add);
        add.setVisibility(View.VISIBLE)

        tool_text.setText("Home")

        add.setOnClickListener(View.OnClickListener { })


    }

    //initializing the navigation drawer
    fun initializeDrawer() {
        drawer = findViewById(R.id.drawer_layout)
        drawerFragment = supportFragmentManager.findFragmentById(R.id.fragment_navigation_drawer) as SideMenuViewController
        drawerFragment.setUp(R.id.fragment_navigation_drawer, drawer, toolbar)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            drawerFragment.setDrawerListener(this)
        }
        back.setOnClickListener {
            Log.e("openDrawer", "call")
            drawer.openDrawer(GravityCompat.START)// for open the side menu
        }
    }

    override fun onDrawerItemSelected(view: View, position: Int) {


    }

}