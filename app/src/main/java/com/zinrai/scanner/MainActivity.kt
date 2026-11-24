
package com.zinrai.scanner

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(12, 18, 32))
        }

        val title = TextView(this).apply {
            text = "ZiNRAi Scanner AI"
            textSize = 30f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "VISOR EDUCATIVO DE MERCADOS"
            textSize = 14f
            setTextColor(Color.rgb(0, 220, 180))
            gravity = Gravity.CENTER
        }

        val info = TextView(this).apply {
            text = "\nAprende a interpretar gráficos financieros\n\nIndicadores: EMA • RSI • MACD\n\nPróximamente: gráficos históricos y ejemplos simulados"
            textSize = 16f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(info)

        setContentView(layout)
    }
}
