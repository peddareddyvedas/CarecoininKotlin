package com.example.tablayoutmanytabs

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.rise.carecoininkotlin.R
import java.util.ArrayList

class ActiveFragment : Fragment() {
    internal lateinit var traRecyclerView: RecyclerView

    internal lateinit var transaction: Transaction
    internal var view: View? = null


    internal var image1 = ArrayList<Int>()
    internal var name = ArrayList<String>()
    internal var name1 = ArrayList<String>()
    internal var image = ArrayList<Int>()
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater?.inflate(R.layout.activefragment, container, false)

        init()
    }

    private fun init() {

        name.add("Device Name")
        name.add("Device Name")
        name.add("Device Name")

        name1.add("ID:8654876RDS")
        name1.add("ID:8976542RDS")
        name1.add("ID:89764542RDS")


        image.add(R.drawable.ic_send)
        image.add(R.drawable.ic_send)
        image.add(R.drawable.ic_send)


        traRecyclerView = view!!.findViewById<RecyclerView>(R.id.recyclerview_activity)
        transaction = Transaction(name, activity)
        val horizontalLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        traRecyclerView.layoutManager = horizontalLayoutManager
        traRecyclerView.adapter = transaction

    }


    // Step 1:-
    inner class Transaction(arrayList: ArrayList<String>, internal var ctx: Context) : RecyclerView.Adapter<Transaction.ViewHolder>() {

        // step 3:-
        internal var arrayList = ArrayList<String>()
        internal var button: ImageView? = null


        init {
            this.arrayList = arrayList
        }

        // step 5:-
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


            val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.devicecardlayout, parent, false)


            return ViewHolder(view, ctx, arrayList)


        }

        //step 6:-
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            holder.userName.text = name[position]
            holder.userName1.text = name1[position]


            // holder.image1.setBackgroundResource(image1.get(position));
            holder.image.setBackgroundResource(image[position])

            if (selectedPosition == position) {
                Log.e("if", "called")
                holder.image.visibility = View.VISIBLE
            } else {
                Log.e("else", "called")
                holder.image.visibility = View.INVISIBLE

            }

            holder.itemView.setOnClickListener {
                selectedPosition = position
                Log.e("pos", "" + selectedPosition)

                notifyDataSetChanged()
            }


        }

        // step 4:-
        override fun getItemCount(): Int {

            Log.e("listarray", "" + arrayList.size)
            return arrayList.size
        }


        // Step 2:-
        inner class ViewHolder(itemView: View, internal var ctx: Context, arrayList: ArrayList<String>) : RecyclerView.ViewHolder(itemView), View.OnClickListener {


            internal var image: ImageView
            internal var userName: TextView
            internal var userName1: TextView
            internal var arrayList = ArrayList<String>()

            init {

                this.arrayList = arrayList
                userName = itemView.findViewById(R.id.devicename)
                userName1 = itemView.findViewById(R.id.deviceid)
                image = itemView.findViewById(R.id.tick)

                itemView.setOnClickListener(this)

            }

            override fun onClick(v: View) {


            }
        }
    }


    companion object {
        internal var selectedPosition = 0
    }


}

