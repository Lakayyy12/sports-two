package com.application.betsportsodds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.topics_list.*

class MainActivity : AppCompatActivity() {

    private lateinit var listViewAdapter: ExpandableListViewAdapter
    private lateinit var chapterList: List<String>
    private lateinit var topicList: HashMap<String, List<String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        this function is call before adapter set (show list())

       showlist()

        listViewAdapter = ExpandableListViewAdapter(this, chapterList, topicList)
        elistView.setAdapter(listViewAdapter)

    }

    private fun showlist() {

        chapterList = ArrayList()
        topicList = HashMap()

        (chapterList as ArrayList<String>).add("Chapter 1")
        (chapterList as ArrayList<String>).add("Chapter 2")
        (chapterList as ArrayList<String>).add("Chapter 3")
        (chapterList as ArrayList<String>).add("Chapter 4")
        (chapterList as ArrayList<String>).add("Chapter 5")

        val topic1 : MutableList<String> = ArrayList()
        topic1.add("Topic 1")
        topic1.add("Topic 2")
        topic1.add("Topic 3")

        val topic2 : MutableList<String> = ArrayList()
        topic2.add("Topic 1")
        topic2.add("Topic 2")
        topic2.add("Topic 3")

        val topic3 : MutableList<String> = ArrayList()
        topic3.add("Topic 1")
        topic3.add("Topic 2")
        topic3.add("Topic 3")

        val topic4 : MutableList<String> = ArrayList()
        topic4.add("Topic 1")
        topic4.add("Topic 2")
        topic4.add("Topic 3")

        val topic5 : MutableList<String> = ArrayList()
        topic5.add("Topic 1")
        topic5.add("Topic 2")
        topic5.add("Topic 3")

        topicList[chapterList[0]] = topic1
        topicList[chapterList[1]] = topic2
        topicList[chapterList[2]] = topic3
        topicList[chapterList[3]] = topic4
        topicList[chapterList[4]] = topic5

    }
}
