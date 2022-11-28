package com.egor.gmk.ui


import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.egor.gmk.OnItemClickListener
import com.egor.gmk.R
import com.egor.gmk.colors.*
import com.egor.gmk.databinding.FragmentGmkListBinding


class GmkListFragment : Fragment(), OnItemClickListener {

    private var _binding: FragmentGmkListBinding? = null
    private lateinit var recyclerView: RecyclerView
    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGmkListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    // Class created for receiving argument passed in from previous fragment (number = position)
    private val args: GmkListFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val position = args.number
/*
        // The usage of an interface lets you inject your own implementation
        val menuHost: MenuHost = requireActivity()

        // Add menu items without using the Fragment Menu APIs
        // Note how we can tie the MenuProvider to the viewLifecycleOwner
        // and an optional Lifecycle.State (here, RESUMED) to indicate when
        // the menu should be visible
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                // Add menu items here
                menuInflater.inflate(R.menu.search_menu, menu)
            }

            override fun onMenuItemSelected(item: MenuItem): Boolean {
                return when (item.itemId) {
                    R.id.action_search -> {
                        var searchView = item.actionView as SearchView

                        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
                            override fun onQueryTextSubmit(query: String?): Boolean {
                                return true
                            }

                            override fun onQueryTextChange(newText: String?): Boolean {
                               return true
                            }

                        })

                        return true
                    }
                    else -> false
                }
                return true
            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)

 */

        recyclerView = binding.recyclerView




        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // populates the color keycaps list via position. Data/list from GmkListFragment
        // Position of companion obj - list
        recyclerView.adapter = GmkListAdapter(list[position], this)


        /*
        recyclerView.addItemDecoration(
            DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        )
        */

        // greenPic.fill(0,1,2)
    }




    override fun onItemClick(position: Int) {
        // Toast.makeText(requireContext(), "item $position is clicked", Toast.LENGTH_SHORT).show()

        val item = args.word


        val action1 = GmkListFragmentDirections.actionGmkListFragmentToGreenFragment(number = position, image = greenPic[position], title = greenTitle[position], price = greenPrice[position])
        val action2 = GmkListFragmentDirections.actionGmkListFragmentToBlueFragment(numberBlue = position, imageBlue = bluePic[position], titleBlue = blueTitle[position], priceBlue = bluePrice[position])
        val action3 = GmkListFragmentDirections.actionGmkListFragmentToBlackFragment(numberBlack = position, imageBlack = blackPic[position], titleBlack = blackTitle[position], priceBlack = blackPrice[position])
        val action4 = GmkListFragmentDirections.actionGmkListFragmentToWhiteFragment(numberWhite = position, imageWhite = whitePic[position], titleWhite = whiteTitle[position], priceWhite = whitePrice[position])
        val action5 = GmkListFragmentDirections.actionGmkListFragmentToRedFragment(numberRed = position, imageRed = redPic[position], titleRed = redTitle[position], priceRed = redPrice[position])
        val action6 = GmkListFragmentDirections.actionGmkListFragmentToYellowFragment(numberYellow = position, imageYellow = yellowPic[position], titleYellow = yellowTitle[position], priceYellow = yellowPrice[position])
        val action7 = GmkListFragmentDirections.actionGmkListFragmentToPinkFragment(numberPink = position, imagePink = pinkPic[position], titlePink = pinkTitle[position], pricePink = pinkPrice[position])
        val action8 = GmkListFragmentDirections.actionGmkListFragmentToPurpleFragment(numberPurp = position, imagePurp = purpPic[position], titlePurp = purpTitle[position], pricePurp = purpPrice[position])
        val action9 = GmkListFragmentDirections.actionGmkListFragmentToGreyFragment(numberGrey = position, imageGrey = greyPic[position], titleGrey = greyTitle[position], priceGrey = greyPrice[position])
        val action10 = GmkListFragmentDirections.actionGmkListFragmentToBrownFragment(numberBrown = position, imageBrown = brownPic[position], titleBrown = brownTitle[position], priceBrown = brownPrice[position])
        val action11 = GmkListFragmentDirections.actionGmkListFragmentToOrangeFragment(numberOrange = position, imageOrange = orangePic[position], titleOrange = orangeTitle[position], priceOrange = orangePrice[position])
        val action12 = GmkListFragmentDirections.actionGmkListFragmentToMultiColorFragment(numberMulti = position, imageMulti = multiPic[position], titleMulti = multiTitle[position], priceMulti = multiPrice[position])
        val action13 = GmkListFragmentDirections.actionGmkListFragmentToAdditionFragment(numberAddition = position, imageAddition = additionPic[position], titleAddition = additionTitle[position], priceAddition = additionPrice[position])

        when (item) {
            "green" -> {view?.findNavController()?.navigate(action1)}
            "blue"-> {view?.findNavController()?.navigate(action2)}
            "black" -> {view?.findNavController()?.navigate(action3)}
            "white" -> {view?.findNavController()?.navigate(action4)}
            "red" -> {view?.findNavController()?.navigate(action5)}
            "yellow" -> {view?.findNavController()?.navigate(action6)}
            "pink" -> {view?.findNavController()?.navigate(action7)}
            "purple" -> {view?.findNavController()?.navigate(action8)}
            "grey/Beige" -> {view?.findNavController()?.navigate(action9)}
            "brown" -> {view?.findNavController()?.navigate(action10)}
            "orange" -> {view?.findNavController()?.navigate(action11)}
            "multiColor" -> {view?.findNavController()?.navigate(action12)}
            "addons" -> {view?.findNavController()?.navigate(action13)}
        }
    }



    private fun searchGmk(text: String?) {

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}
