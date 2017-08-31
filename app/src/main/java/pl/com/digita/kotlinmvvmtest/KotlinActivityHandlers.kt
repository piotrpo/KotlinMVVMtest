package pl.com.digita.kotlinmvvmtest

import android.view.View

/**
 * Handlers of the main view
 */
interface KotlinActivityHandlers {
    fun run(view: View)
    fun reset(view: View)
    fun clear(view: View)
}