package com.linksfield.lpa_example.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import java.lang.reflect.ParameterizedType

/**
 * CreateDate: 2020/9/2 9:59
 * Author: you
 * Description:
 */
abstract class BaseFragment<VB: ViewBinding>: Fragment() {

    private var binding: VB? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //利用反射，调用指定ViewBinding中的inflate方法填充视图
        val type = javaClass.genericSuperclass
        val clazz = (type as ParameterizedType).actualTypeArguments[0] as Class<VB>
        val method = clazz.getMethod("inflate", LayoutInflater::class.java, ViewGroup::class.java, Boolean::class.java)
        binding = method.invoke(null, layoutInflater, container, false) as VB
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    abstract fun initViews()

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

    fun showToast(content: String) {
        activity?.runOnUiThread {
            Toast.makeText(context, content, Toast.LENGTH_SHORT).show()
        }
    }

}