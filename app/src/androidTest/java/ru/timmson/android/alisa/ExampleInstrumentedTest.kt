package ru.timmson.android.alisa

import android.content.Intent
import android.net.Uri
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
//@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun name() {
        val i = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("bank100000000111://qr.nspk.ru/AB1S00766IESACR79JAAGRFVKVCTS66F")
        )

        println(i)
    }

 /*   @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("ru.timmson.android.alisa", appContext.packageName)
    }*/
}