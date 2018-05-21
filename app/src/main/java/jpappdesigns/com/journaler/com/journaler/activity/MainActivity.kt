package jpappdesigns.com.journaler.com.journaler.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import jpappdesigns.com.journaler.R
import jpappdesigns.com.journaler.com.journaler.fragment.ItemsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override val tag = "MainActivity"
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       pager.adapter = ViewPagerAdapter(supportFragmentManager)
    }

    private class ViewPagerAdapter(manager: FragmentManager) :
            FragmentStatePagerAdapter(manager) {
        override fun getItem(position: Int): Fragment {
            return ItemsFragment()
        }

        override fun getCount(): Int {
            return 5
        }
    }
}