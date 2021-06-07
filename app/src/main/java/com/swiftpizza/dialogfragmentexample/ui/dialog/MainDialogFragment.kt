package com.swiftpizza.dialogfragmentexample.ui.dialog

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.swiftpizza.dialogfragmentexample.databinding.DialogFragmentMainBinding
import com.swiftpizza.dialogfragmentexample.ui.main.MainViewModel

class MainDialogFragment : DialogFragment() {

    private var cxt: Context? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        cxt = context
    }

    private val TAG = MainDialogFragment::class.java.name

    private val viewModel: MainViewModel by activityViewModels()

    private var _binding: DialogFragmentMainBinding? = null
    private val b get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        _binding = DialogFragmentMainBinding.inflate(inflater, container, false)
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog?.setCancelable(false)

        viewModel.getMessage().observe(viewLifecycleOwner){
            it?.let { message ->
                Log.d(TAG, "onViewCreated: message = $message")
            }
        }

        b.imageView.setOnClickListener {
            dialog?.dismiss()
        }

    }

}