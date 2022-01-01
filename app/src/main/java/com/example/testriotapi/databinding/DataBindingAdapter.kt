package com.example.testriotapi.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.testriotapi.R

/**
 * @author Daewon
 * @package com.example.testriotapi.databinding
 * @email green201402317@gmail.com
 * @created 2021/12/30
 */

object DataBindingAdapter {

    @JvmStatic
    @BindingAdapter("imageUrl")
    fun bindImage(imageView: ImageView, imageUrl: String?) {
        imageUrl?.let {
            Glide.with(imageView).load(imageUrl).centerCrop().into(imageView)

        }
    }

    @JvmStatic
    @BindingAdapter("tierImage")
    fun tierImage(imageView: ImageView, tier: String) {
        when(tier) {
            "GOLD" -> {
                imageView.setImageResource(R.drawable.emblem_gold)
            }
            "SILVER" -> {
                imageView.setImageResource(R.drawable.emblem_silver)
            }
            "BRONZE" -> {
                imageView.setImageResource(R.drawable.emblem_bronze)
            }

            "CHALLENGER" -> {
                imageView.setImageResource(R.drawable.emblem_challenger)
            }

            else -> {
                imageView.setImageResource(R.drawable.emblem_grandmaster)
            }
        }
    }
}