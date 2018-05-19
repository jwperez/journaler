package jpappdesigns.com.journaler.com.journaler.activity

import jpappdesigns.com.journaler.R

class TodoActivity : ItemActivity() {
    override val tag = "TodoActivity"
    override fun getLayout() = R.layout.activity_todo

    override fun getActivityTitle() = R.string.app_name
}