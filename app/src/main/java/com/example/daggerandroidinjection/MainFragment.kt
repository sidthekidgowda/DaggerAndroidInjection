package com.example.daggerandroidinjection

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_main.view.*
import javax.inject.Inject
import javax.inject.Named

class MainFragment : DaggerFragment() {

    @Inject
    lateinit @field:Named("HelloDaggerAndroid") var helloDagger: String

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //this injected text should say Hello Dagger Android
        view.fragment_text.text = helloDagger
    }
}