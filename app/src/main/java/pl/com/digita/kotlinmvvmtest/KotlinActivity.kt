package pl.com.digita.kotlinmvvmtest

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import pl.com.digita.kotlinmvvmtest.databinding.ActivityKotlinBinding


class KotlinActivity : AppCompatActivity() {

    private val userEntity = UserEntity("John", "Snow")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityKotlinBinding>(this, R.layout.activity_kotlin)
        binding.user = userEntity

        binding.handlers = object : KotlinActivityHandlers {
            override fun reset(view: View) {
                userEntity.firstName = "John"
                userEntity.lastName = "Snow"
            }

            override fun clear(view: View) {
                userEntity.firstName = ""
                userEntity.lastName = ""
            }

            override fun run(view: View) {
                AlertDialog.Builder(this@KotlinActivity)
                        .setTitle("Hello")
                        .setMessage("${userEntity.firstName} ${userEntity.lastName}")
                        .setPositiveButton("Dismiss", { dialogInterface, i -> dialogInterface.dismiss() })
                        .show()
            }

        }
    }


}
