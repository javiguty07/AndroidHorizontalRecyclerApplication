package com.example.androidhorizontalrecyclerapplication

import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var sw1: Switch
    lateinit var floatingButton: FloatingActionButton
    lateinit var fragmentVertical: Fragment
    lateinit var fragmentHorizontal: Fragment
    lateinit var transaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sw1 = findViewById(R.id.switch1)
        floatingButton = findViewById(R.id.floatingActionButton)


       // supportFragmentManager.beginTransaction().add(R.id.fragment_container, fragmentVertical)
           // .commit()

        sw1.setOnCheckedChangeListener { _, isChecked ->
            var message = ""
             if (isChecked){
                try{
                    message = "Switch1:ON"
                   /* transaction = supportFragmentManager.beginTransaction()
                    fragmentHorizontal = HorizontalScrollViewFragment()
                    fragmentVertical = AndroidFragment()

                    transaction.replace(R.id.fragment_container,fragmentHorizontal).addToBackStack(null).commit()*/
                }catch (e : Exception){
                    println("---------------------------")
                    println(e)
                    println("---------------------------")
                }

            } else {
                message = "Switch1:OFF"
                // transaction = supportFragmentManager.beginTransaction()

                // transaction.replace(R.id.fragment_container,fragmentVertical).addToBackStack(null).commit()
            }
            Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
        }

        floatingButton.setOnClickListener {

          /* try{

               fragmentHorizontal = HorizontalScrollViewFragment()
               fragmentVertical = AndroidFragment()
               transaction = supportFragmentManager.beginTransaction()
               transaction.replace(R.id.fragment_container,fragmentVertical)
               transaction.commit()

           }catch(e:Exception){
               println("---------------------------")
               println(e)
               println("---------------------------")
           }*/



        }

    }
}