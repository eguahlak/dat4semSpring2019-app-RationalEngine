package dk.cphbusiness.rationalengine

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

//import android.util.log

class MainActivity : AppCompatActivity() {
    val LOG_KEY = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            Log.d(LOG_KEY, "Button clicked")

//            val intent = Intent(this, OptionsActivity::class.java)
//            startActivity(intent)

            startActivity<OptionsActivity>("name" to "Kurt")
            }
        }
    }
