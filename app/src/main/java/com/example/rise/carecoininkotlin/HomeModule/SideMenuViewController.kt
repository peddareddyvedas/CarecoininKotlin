package com.example.rise.carecoininkotlin.HomeModule

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.net.ConnectivityManager
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.transition.Slide
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView



import java.io.ByteArrayInputStream

import butterknife.ButterKnife
import butterknife.OnClick
import com.example.rise.carecoininkotlin.R
import de.hdodenhof.circleimageview.CircleImageView



/**
 *
 */
class SideMenuViewController : Fragment() {
    internal lateinit var view: View
    internal lateinit var mDrawerToggle: ActionBarDrawerToggle
    internal lateinit var mDrawerLayout: DrawerLayout
    internal lateinit var drawerListener: FragmentDrawerListener
    internal lateinit var containerView: View
    internal lateinit var txt_email: TextView
    internal lateinit var edit_username: TextView
    internal lateinit var main: LinearLayout
    internal lateinit var addpayee: TextView
    internal  lateinit var currentsett: TextView
    internal lateinit var tansfer: TextView
    internal lateinit var support: TextView
    internal lateinit var logout: TextView
    internal lateinit var changepass: TextView
    internal  lateinit var rlUserLogin: RelativeLayout
    internal lateinit var rl_cgPsw: RelativeLayout
    internal  lateinit var rladdpayee: RelativeLayout
    internal lateinit var rlcurrentset: RelativeLayout
    internal lateinit var rltransfer: RelativeLayout
    internal lateinit var rlsupport: RelativeLayout
    internal lateinit var rllogout: RelativeLayout
    internal lateinit var profileImage: CircleImageView

    internal var mProfileListener: View.OnClickListener = View.OnClickListener {
        mDrawerLayout.closeDrawer(containerView)

        val preferences1 = activity.getSharedPreferences("walletdetails", Context.MODE_PRIVATE)
        val editor1 = preferences1.edit()
        editor1.clear()
        editor1.commit()
    }

    val isConn: Boolean
        get() {
            val connectivity = activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            if (connectivity.activeNetworkInfo != null) {
                if (connectivity.activeNetworkInfo.isConnected)
                    return true
            }
            return false
        }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        view = inflater!!.inflate(R.layout.activity_fragment_drawer_list, container, false)
        ButterKnife.bind(this, view)

        init()
        return view
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume", "call")
       /* if (UserDataController.getInstance().currentUser != null) {
            loadAdminData()
        }*/
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart", "call")

    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop", "call")

    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause", "call")

    }

    fun init() {

        //traRecyclerView = view!!.findViewById<RecyclerView>(R.id.recyclerview_activity)

        rlUserLogin  = view!!.findViewById(R.id.rlUserLogin)
        rladdpayee = view!!.findViewById(R.id.rl_addpayes)
        rlcurrentset = view!!.findViewById(R.id.rl_currentsett)
        rltransfer = view!!.findViewById(R.id.rl_transfer)
        rlsupport = view!!.findViewById(R.id.rl_support)
        rl_cgPsw = view!!.findViewById(R.id.rl_cgpsw)
        rllogout = view.findViewById(R.id.rl_logout)
        main = view!!.findViewById(R.id.main)
        main = view!!.findViewById(R.id.main)
        profileImage = view!!.findViewById(R.id.imageView_profile)
        txt_email = view!!.findViewById(R.id.txt_email)
        edit_username = view!!.findViewById(R.id.textUsername)
        addpayee = view!!.findViewById(R.id.addpayes)
        currentsett = view!!.findViewById(R.id.currentsett)
        logout = view!!.findViewById(R.id.logout)
        tansfer = view!!.findViewById(R.id.transfer)
        //   support = (TextView) changepass.findViewById(R.id.support);
        logout = view!!.findViewById(R.id.logout)
        changepass = view!!.findViewById(R.id.changepassword)

        profileImage.setOnClickListener(mProfileListener)

    }

   /* fun loadAdminData() {
        val adminPic = view.findViewById(R.id.imageView_profile) as CircleImageView
        val txt_name = view.findViewById(R.id.textUsername) as TextView
        val txt_email = view.findViewById(R.id.txt_email) as TextView

        UserDataController.getInstance().fetchUserData()
        val user = UserDataController.getInstance().currentUser
        if (user != null) {
            val email = user!!.userid
            txt_email.text = "" + email

            if (user!!.username != null) {
                val name = user!!.username
                txt_name.text = "" + name
                Log.e("name", "" + name)

            }
            if (UserDataController.getInstance().currentUser.mprofilepicturepath != null) {
                Log.e("loadcurrentuser", "call")
                adminPic.setImageBitmap(convertByteArrayTOBitmap(UserDataController.getInstance().currentUser.mprofilepicturepath))
            }
        }
    }
*/
    @OnClick(R.id.rlUserLogin)
    fun onClickaction(view: View) {
        mDrawerLayout.closeDrawer(containerView)
       /* ContactsDataController.getInstance().selectedContactModel = null
        CareCoinAdvertizeViewController.isSetAnimation = true
        startActivity(Intent(activity, PersonalinfoViewController::class.java))*/
        // getActivity().overridePendingTransition(R.transition.slide_from_bottom, R.transition.slide_from_bottom);

        val preferences1 = activity.getSharedPreferences("walletdetails", Context.MODE_PRIVATE)
        val editor1 = preferences1.edit()
        editor1.clear()
        editor1.commit()

    }

    @OnClick(R.id.rl_addpayes)
    fun addpayes() {
        mDrawerLayout.closeDrawer(containerView)
      //  ContactsDataController.getInstance().selectedContactModel = null
        //  startActivity(new Intent(getActivity(), PassCodeViewController.class));
        val preferences1 = activity.getSharedPreferences("walletdetails", Context.MODE_PRIVATE)
        val editor1 = preferences1.edit()
        editor1.clear()
        editor1.commit()
    }

    @OnClick(R.id.rl_currentsett)
    fun currentsett(view: View) {
       /* ContactsDataController.getInstance().selectedContactModel = null
        mDrawerLayout.closeDrawer(containerView)
        CareCoinAdvertizeViewController.isSetAnimation = true

        startActivity(Intent(activity, TransactionTabsActivity::class.java))
*/
        val preferences1 = activity.getSharedPreferences("walletdetails", Context.MODE_PRIVATE)
        val editor1 = preferences1.edit()
        editor1.clear()
        editor1.commit()

    }

    @OnClick(R.id.rl_transfer)
    fun transfer(view: View) {
     /*   CareCoinAdvertizeViewController.isSetAnimation = true
        ContactsDataController.getInstance().selectedContactModel = null*/
        mDrawerLayout.closeDrawer(containerView)
        val viewScreen = activity.window.decorView
        viewScreen.isDrawingCacheEnabled = true
        viewScreen.buildDrawingCache()
        viewScreen.destroyDrawingCache()

        val shareIntent = Intent()
        shareIntent.action = Intent.ACTION_SEND
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Care Coin")
        shareIntent.putExtra(Intent.EXTRA_TEXT, "" + "I'm using the secure Carecoin  wallet from Vedaslabs.com. Create your wallet today!-> http://vedaslabs.com")
        shareIntent.type = "image/*"
        shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        startActivity(Intent.createChooser(shareIntent, "Share the status :"))

        val preferences1 = activity.getSharedPreferences("walletdetails", Context.MODE_PRIVATE)
        val editor1 = preferences1.edit()
        editor1.clear()
        editor1.commit()
    }

    @OnClick(R.id.rl_support)
    fun support() {
       /* EventBus.getDefault().post(ContactsViewController.MessageEvent("removeContacts"))
        ContactsDataController.getInstance().selectedContactModel = null
        mDrawerLayout.closeDrawer(containerView)
        CareCoinAdvertizeViewController.isSetAnimation = true

        startActivity(Intent(activity, SupportActivity::class.java))*/
        (activity as Activity).overridePendingTransition(0, 0)

        val preferences1 = activity.getSharedPreferences("walletdetails", Context.MODE_PRIVATE)
        val editor1 = preferences1.edit()
        editor1.clear()
        editor1.commit()
    }

    @OnClick(R.id.rl_cgpsw)
    fun ChangePsw() {
       /* CareCoinAdvertizeViewController.isSetAnimation = true

        ContactsDataController.getInstance().selectedContactModel = null
        mDrawerLayout.closeDrawer(containerView)
        startActivity(Intent(activity, SettingsViewController::class.java))
*/
        val preferences1 = activity.getSharedPreferences("walletdetails", Context.MODE_PRIVATE)
        val editor1 = preferences1.edit()
        editor1.clear()
        editor1.commit()
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
   /* @OnClick(R.id.rl_logout)
    fun logout() {
        mDrawerLayout.closeDrawer(containerView)
        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.logout_alert)
        dialog.setCanceledOnTouchOutside(false)
        dialog.setCancelable(false)
        dialog.show()
        dialog.window!!.setBackgroundDrawableResource(R.drawable.transparent_selector)

        val no = dialog.findViewById(R.id.btn_no) as Button
        val yes = dialog.findViewById(R.id.btn_yes) as Button
        val txt_msg = dialog.findViewById(R.id.textview) as TextView
        val txt_alert = dialog.findViewById(R.id.textview1) as TextView

        no.setOnClickListener { dialog.cancel() }
        yes.setOnClickListener {
            dialog.dismiss()
            // deleteDatabaseData();
            if (isConn) {
                refreshShowingDialog.showAlert()
                loadLogoutServerApi()

            } else {
                AlertShowingDialog(activity, "No Internet Connection")
            }
        }
    }*/

    ////////////////////////////////////logoutaps/////////////////////////////


    fun setDrawerListener(listener: FragmentDrawerListener) {
        this.drawerListener = listener
    }

    fun setUp(fragmentId: Int, drawerLayout: DrawerLayout, toolbar: Toolbar) {
        containerView = activity.findViewById(fragmentId)
        mDrawerLayout = drawerLayout
        mDrawerLayout.setScrimColor(Color.TRANSPARENT)
        ///for builtin button open close drawayer.
        mDrawerToggle = object : ActionBarDrawerToggle(activity, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            override fun onDrawerOpened(drawerView: View?) {
                super.onDrawerOpened(drawerView)
                activity.invalidateOptionsMenu()
            }

            override fun onDrawerClosed(drawerView: View?) {

                super.onDrawerClosed(drawerView)
                activity.invalidateOptionsMenu()

                Log.e("onDrawerItemSelected", "call")

            }

            override fun onDrawerSlide(drawerView: View?, slideOffset: Float) {
                super.onDrawerSlide(drawerView, slideOffset)
                toolbar.translationX = slideOffset * drawerView!!.width
                mDrawerLayout.bringChildToFront(drawerView)
                mDrawerLayout.requestLayout()
                //below line used to remove shadow of drawer
                mDrawerLayout.setScrimColor(Color.TRANSPARENT)
                Log.e("onDrawerSlide", "call")

                val preferences = activity.getSharedPreferences("contactsDetails", Context.MODE_PRIVATE)
                val editor = preferences.edit()
                editor.clear()
                editor.commit()

            }//this method helps you to aside menu drawer

        }

        mDrawerLayout.setDrawerListener(mDrawerToggle)
        mDrawerToggle.isDrawerIndicatorEnabled = false
        mDrawerLayout.post { mDrawerToggle.syncState() }
    }


    interface FragmentDrawerListener {
        fun onDrawerItemSelected(view: View, position: Int)
    }



}
