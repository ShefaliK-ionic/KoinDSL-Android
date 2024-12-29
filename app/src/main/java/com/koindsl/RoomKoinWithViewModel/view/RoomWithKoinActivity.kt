package com.koindsl.RoomKoinWithViewModel.view

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.koindsl.R
import com.koindsl.RoomKoinWithViewModel.db.NotesEntity
import com.koindsl.container.Component
import com.koindsl.databinding.ActivityRoomWithKoinBinding
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class RoomWithKoinActivity : AppCompatActivity() {

    lateinit var activityRoomWithKoinBinding: ActivityRoomWithKoinBinding
    private val component= Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityRoomWithKoinBinding=ActivityRoomWithKoinBinding.inflate(layoutInflater)
        setContentView(activityRoomWithKoinBinding.root)
        clickEvent()
        attachObserver()


    }

    private fun attachObserver() {
        component.roomDbViewmodel.noteList.observe(this@RoomWithKoinActivity, Observer {
            Log.d("222", "clickEvent: "+it.get(0).title)

        })
    }

    private fun clickEvent() {
        activityRoomWithKoinBinding.btnAdd.setOnClickListener {

            if(activityRoomWithKoinBinding.etTitle.text.trim().isNotBlank() &&
                activityRoomWithKoinBinding.etDes.text.trim().isNotBlank()){
                var notesEntity=NotesEntity(0,activityRoomWithKoinBinding.etTitle.text.toString(),
                    activityRoomWithKoinBinding.etDes.text.trim().toString())
                component.roomDbViewmodel.addNote(notesEntity)

            }

        }

        activityRoomWithKoinBinding.btnGet.setOnClickListener {
           lifecycleScope.launch {

               var a1=async{ component.roomDbViewmodel.getAllNotes()}
               Log.d("222", "clickEvent: "+a1.await())
           }
        }



        }
}