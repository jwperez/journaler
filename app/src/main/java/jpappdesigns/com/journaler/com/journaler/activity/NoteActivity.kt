package jpappdesigns.com.journaler.com.journaler.activity

import jpappdesigns.com.journaler.R

class NoteActivity : ItemActivity() {
    override val tag = "NoteActivity"
    override fun getLayout() = R.layout.activity_note

    override fun getActivityTitle() = R.string.app_name

}