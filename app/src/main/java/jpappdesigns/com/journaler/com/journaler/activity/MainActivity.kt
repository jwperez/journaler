package jpappdesigns.com.journaler.com.journaler.activity

import android.os.Bundle
import jpappdesigns.com.journaler.R
import jpappdesigns.com.journaler.com.journaler.fragment.ItemsFragment

class MainActivity : BaseActivity() {

    override val tag = "MainActivity"
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragment = ItemsFragment()
        supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
    }
}