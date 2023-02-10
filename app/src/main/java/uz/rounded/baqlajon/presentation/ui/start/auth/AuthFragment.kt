package uz.rounded.baqlajon.presentation.ui.start.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.rounded.baqlajon.R
import uz.rounded.baqlajon.databinding.FragmentAuthBinding
import uz.roundedllc.tmkeld.presentation.BaseFragment


class AuthFragment : BaseFragment<FragmentAuthBinding>() {
    override fun createBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAuthBinding = FragmentAuthBinding.inflate(inflater)

    override fun created(view: View, savedInstanceState: Bundle?) {

    }

}