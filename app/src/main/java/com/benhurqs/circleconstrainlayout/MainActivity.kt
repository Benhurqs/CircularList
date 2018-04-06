package com.benhurqs.circleconstrainlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.benhurqs.circleconstrainlayout.sample.SampleAdapter
import com.benhurqs.circularlist.widget.CircularList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CircularList.OnClickItemListener, CircularList.OnAnimationListener, CircularList.OnAnimationItemListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        createList(10)
        circularList.circleRadius = 200
        circularList.setOnClickItemListener(this)
                .setOnAnimationListener(this)
                .setOnAnimationItemListener(this)
                .setAdapter(SampleAdapter(getList(5)))

    }

    /********* Animation Item Listener ************/
    override fun onAnimationStart(position: Int, item: View) {
//        var text = item.findViewById<View>(R.id.text)
//        text.visibility = View.INVISIBLE

    }

    override fun onAnimationEnd(position: Int, item: View) {
//        var text = item.findViewById<View>(R.id.text)
//        text.visibility = View.VISIBLE
    }

    /******** Animation Listener *********/
    override fun onAnimationStart() {
        showMsg("Start animation")
    }

    override fun onAnimationEnd() {
        showMsg("Finish animation")
    }

    /******* Click Item Listener ********/
    override fun onClickItem(position: Int, item: View) {
        showMsg("click item -> $position")
    }

    private fun showMsg(msg: String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }


    private fun getList(total: Int): List<ItemObj>{
        var list = ArrayList<ItemObj>()
        list.clear()
        for(i in 1..total){
            //Item
           var item = ItemObj()
            item.text = "imagem $i"
            item.img = R.drawable.barbecue
            list.add(item)

        }

        return list
    }

}
