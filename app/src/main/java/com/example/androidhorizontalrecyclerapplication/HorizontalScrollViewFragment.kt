package com.example.androidhorizontalrecyclerapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.androidhorizontalrecyclerapplication.databinding.FragmentItemListHorizontalBinding


class HorizontalScrollViewFragment : Fragment(R.layout.fragment_item_list_horizontal) {

    lateinit var androidList: ArrayList<Android>
    lateinit var adapter: MyHorizontalScrollViewRecyclerViewAdapter
    lateinit var recyclerview: RecyclerView
    private var _binding: FragmentItemListHorizontalBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentItemListHorizontalBinding.inflate(inflater, container, false)
        val view = binding.root
        // Set the adapter

        // Set the adapter

        androidList = arrayListOf(

            Android(R.drawable.applepie, "Android 1.0 Apple Pie", "Septiembre de 2008"),
            Android(R.drawable.petit, "Android 1.1 Petit Four", "Febrero de 2009"),
            Android(R.drawable.cupcake, "Android 1.5 Cupcake", "Abril de 2009"),
            Android(R.drawable.donut, "Android 1.6 Donut", "Septiembre de 2009"),
            Android(R.drawable.eclair, "Android 2.0 Eclair", "Finales de 2009"),
            Android(R.drawable.froyo, "Android 2.2 Froyo", "Mayo de 2010"),
            Android(R.drawable.ginger, "Android 2.3 Gingerbread", "Finales de 2010"),
            Android(R.drawable.honeycomb, "Android 3.0 Honeycomb", "Febrero de 2011"),
            Android(R.drawable.icecream, "Android 4.0 Ice Cream Sandwich", "Durante 2011"),
            Android(R.drawable.jelly, "Android 4.1 Jelly Bean", "Julio de 2012"),
            Android(R.drawable.kat, "Android 4.4 KitKat", "Octubre de 2013"),
            Android(R.drawable.lolli, "Android 5.0 Lollipop", "Finales de 2014"),
            Android(R.drawable.marsmallow, "Android 6.0 Marshmallow", "Octubre de 2015"),
            Android(R.drawable.nougat, "Android 7.0 Nougat", "Marzo de 2016"),
            Android(R.drawable.oreo, "Android 8.0 Oreo", "Agosto de 2017"),
            Android(R.drawable.pie, "Android 9.0 Pie", "Agosto de 2018"),
            Android(R.drawable.diez, "Android 10", "Segundo semestre de 2019"),
            Android(R.drawable.once, "Android 11", "Junio de 2020")

        )


        binding.listHorizontal.adapter =
            MyHorizontalScrollViewRecyclerViewAdapter(androidList) { android ->

                val itemClicked = android.name
                Toast.makeText(context, "Versión:  $itemClicked", Toast.LENGTH_LONG).show()
            }


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}