package com.egor.gmk.ui.colorfrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.egor.gmk.R
import com.egor.gmk.databinding.FragmentDetailBinding

class GreyFragment : Fragment() {

    private val args: GreyFragmentArgs by navArgs()

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        return view


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        val argImg = args.imageGrey
        val argTitle = args.titleGrey
        val argPrice = args.priceGrey

        val images : ImageView = requireView().findViewById(R.id.new_images)
        val title : TextView = requireView().findViewById(R.id.titles)
        val price : TextView = requireView().findViewById(R.id.prices)


        images.setImageResource(argImg)
        title.text = argTitle
        price.text = argPrice



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}