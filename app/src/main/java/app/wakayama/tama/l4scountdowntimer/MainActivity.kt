package app.wakayama.tama.l4scountdowntimer

import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var second = 10
    val timer: CountDownTimer = object : CountDownTimer(10000, 1000) {


        override fun onFinish() {
            startButton.isVisible = true
            second = 10
            secondText.text = second.toString()
        }

        override fun onTick(millisUnitFinished: Long) {
            second = second - 1
            secondText.text = second.toString()

        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //残り時間表示
        secondText.text = second.toString()

        //スタートボタンがタップされた時
        startButton.setOnClickListener {
            startButton.isVisible = false

            //タイマー開始
            timer.start()

        }


    }

}