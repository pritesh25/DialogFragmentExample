package com.swiftpizza.dialogfragmentexample.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.swiftpizza.dialogfragmentexample.databinding.FragmentMainBinding
import com.swiftpizza.dialogfragmentexample.ui.dialog.MainDialogFragment

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
        val TAG = MainFragment::class.simpleName
    }

    private val viewModel: MainViewModel by activityViewModels()

    private var _binding: FragmentMainBinding? = null
    private val b get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        //return inflater.inflate(R.layout.fragment_main, container, false)
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        b.message.setOnClickListener {
            Log.d(TAG, "onViewCreated: message clicked")

            viewModel.setMessage("Hi, this is demo message")

            val mdf = MainDialogFragment()
            mdf.show(childFragmentManager, TAG)


        }

    }

}